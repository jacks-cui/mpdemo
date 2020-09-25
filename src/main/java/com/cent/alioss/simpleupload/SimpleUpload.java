package com.cent.alioss.simpleupload;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.Callback;
import com.aliyun.oss.model.PutObjectRequest;

import java.io.ByteArrayInputStream;

public class SimpleUpload {
    public static void main(String[] args) {
        String endpoint = "https://oss-cn-beijing.aliyuncs.com";
        String accessKeyId = "LTAI4GKzN3Hi2rKTGHKb5TPt";
        String accessKeySecret = "jG5FZzIqIeMdLkF9eJDHo0Yp8REZM3";
        String bucketName = "stank";
        //用于返回回调的服务器地址
        String callbackUrl = "http://127.0.0.1:5151";

        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 上传Byte数组。
        byte[] content = "Hello OSS".getBytes();
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, "cui/a.txt", new ByteArrayInputStream(content));

        // 上传回调参数。
        Callback callback = new Callback();
        callback.setCallbackUrl(callbackUrl);
        putObjectRequest.setCallback(callback);

        // 关闭OSSClient。
        ossClient.shutdown();
    }
}
