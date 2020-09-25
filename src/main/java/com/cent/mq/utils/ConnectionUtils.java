package com.cent.mq.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * mq消息 连接工具抽取
 */
public class ConnectionUtils {
    public static Connection getConnections() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        //2、设置RabbitMQ服务主机地址，默认localhost-factory.setHost("localhost")
        factory.setHost("localhost");
        //3、设置RabbitMQ服务端口，默认-1-factory.setPort(5672)
        factory.setPort(5672);
        factory.setVirtualHost("/");
        //5、设置用户连接名，默认guest-factory.setUsername("admin")
        factory.setUsername("guest");
        //6、设置链接密码，默认guest-factory.setPassword("admin")
        factory.setPassword("guest");
        //7、创建链接-connection=factory.newConnection()
        return factory.newConnection();
    }
}
