package com.cent.mq.routing;

import com.cent.mq.utils.ConnectionUtils;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class RoutingProducer {
    public static void main(String[] args) throws Exception{
        Connection connection = ConnectionUtils.getConnections();
        //8、创建频道-channel = connection.createChannel()
        Channel channel = connection.createChannel();

        //声明交换机- channel.exchangeDeclare(交换机名字,交换机类型)
        channel.exchangeDeclare("routing_exchange", BuiltinExchangeType.DIRECT);
        //连续发3条消息
        for (int i = 0; i < 3; i++) {
            String routingKey = "";
            //发送消息的时候根据相关逻辑指定相应的routing key。
            switch (i){
                case 0:  //假设i=0，为error消息
                    routingKey = "log.error";
                    break;
                case 1: //假设i=1，为info消息
                    routingKey = "log.info";
                    break;
                case 2: //假设i=2，为warning消息
                    routingKey = "log.warning";
                    break;
            }
            //10、创建消息-String m = xxx
            String message = "hello,欢迎来到深圳黑马！" + i;
            //11、消息发送-channel.basicPublish(交换机[默认Default Exchage],路由key[简单模式可以传递队列名称],消息其它属性,消息内容)
            channel.basicPublish("routing_exchange",routingKey,null,message.getBytes("utf-8"));
        }
        //12、关闭资源-channel.close();connection.close()
        channel.close();
        connection.close();
    }
}
