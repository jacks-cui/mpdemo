package com.cent.mq.publisherandsubscribe;

import com.cent.mq.utils.ConnectionUtils;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

// 发布订阅模式
public class FanoutProducer {
    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connections = ConnectionUtils.getConnections();
        //创建频道
        Channel channel = connections.createChannel();
        //声明交换机:交换机名称  交换机类型（广播式交换机）
        channel.exchangeDeclare("fanout_exchange", BuiltinExchangeType.FANOUT);
        for (int i = 0; i < 50; i++) {
            //10、创建消息-String m = xxx
            String message = "hello,欢迎来到深圳黑马！" + i;
            //11、消息发送-channel.basicPublish(交换机[默认Default Exchage],路由key[简单模式可以传递队列名称],消息其它属性,消息内容)
            channel.basicPublish("fanout_exchange","",null,message.getBytes("utf-8"));
        }
        //12、关闭资源-channel.close();connection.close()
        channel.close();
        connections.close();
    }
}

