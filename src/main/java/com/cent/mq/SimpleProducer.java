package com.cent.mq;

import com.cent.mq.utils.ConnectionUtils;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class SimpleProducer {
    public static void main(String[] args) throws Exception{

        Connection connection = ConnectionUtils.getConnections();
        //8、创建频道-channel = connection.createChannel()
        Channel channel = connection.createChannel();

        for (int i = 40; i < 100; i++) {
            //9、声明队列-channel.queueDeclare(名称，是否持久化，是否独占本连接,是否自动删除,附加参数)
            channel.queueDeclare("simple_queue",true,false,false,null);
            //10、创建消息-String m = xxx
            String message = "hello,欢迎来到深圳黑马！"+i;
            //11、消息发送-channel.basicPublish(交换机[默认Default Exchage],路由key[简单模式可以传递队列名称],消息其它属性,消息内容)
            channel.basicPublish("","simple_queue",null,message.getBytes("utf-8"));
        }

        //12、关闭资源-channel.close();connection.close()
        channel.close();
        connection.close();
    }
}
