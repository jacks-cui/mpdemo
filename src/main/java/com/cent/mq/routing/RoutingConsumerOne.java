package com.cent.mq.routing;

import com.cent.mq.utils.ConnectionUtils;
import com.rabbitmq.client.*;

import java.io.UnsupportedEncodingException;

public class RoutingConsumerOne {
    public static void main(String[] args) throws Exception{
        Connection connection = ConnectionUtils.getConnections();
        //8、创建频道-channel = connection.createChannel()
        Channel channel = connection.createChannel();
        //9、声明队列-channel.queueDeclare(名称，是否持久化，是否独占本连接,是否自动删除,附加参数)
        channel.queueDeclare("routing_queue1",true,false,false,null);

        //队列绑定交换机-channel.queueBind(队列名, 交换机名, 路由key[广播消息设置为空串])
        channel.queueBind("routing_queue1", "routing_exchange", "log.error");
        //创建消费者
        Consumer callback = new DefaultConsumer(channel){
            /**
             * @param consumerTag 消费者标签，在channel.basicConsume时候可以指定
             * @param envelope 消息包的内容，可从中获取消息id，消息routingkey，交换机，消息和重传标志(收到消息失败后是否需要重新发送)
             * @param properties  属性信息(生产者的发送时指定)
             * @param body 消息内容
             * @throws UnsupportedEncodingException
             */
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws UnsupportedEncodingException {
                //路由的key
                String routingKey = envelope.getRoutingKey();
                //获取交换机信息
                String exchange = envelope.getExchange();
                //获取消息ID
                long deliveryTag = envelope.getDeliveryTag();
                //获取消息信息
                String message = new String(body,"utf-8");
                System.out.println(
                        "routingKey:" + routingKey +
                                ",exchange:" + exchange +
                                ",deliveryTag:" + deliveryTag +
                                ",message:" + message);
            }
        };
        /**
         * 消息消费
         * 参数1：队列名称
         * 参数2：是否自动应答，true为自动应答[mq接收到回复会删除消息]，设置为false则需要手动应答
         * 参数3：消息接收到后回调
         */
        channel.basicConsume("routing_queue1",true,callback);

        //注意，此处不建议关闭资源，让程序一直处于读取消息
    }
}
