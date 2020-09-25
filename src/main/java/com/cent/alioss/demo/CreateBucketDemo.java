package com.cent.alioss.demo;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

public class CreateBucketDemo {
    public static void main(String[] args) {
        String endpoint = "https://oss-cn-beijing.aliyuncs.com";
        String accessKeyId = "LTAI4GKzN3Hi2rKTGHKb5TPt";
        String accessKeySecret = "jG5FZzIqIeMdLkF9eJDHo0Yp8REZM3";
        String bucketName = "alicui123";

        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        // 创建存储空间。
        ossClient.deleteBucket(bucketName);
        // 关闭OSSClient。
        ossClient.shutdown();

    }
}
