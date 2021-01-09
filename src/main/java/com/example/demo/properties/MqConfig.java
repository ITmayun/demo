package com.example.demo.properties;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;


@Configuration
//配置类
public class MqConfig {
    //定义存放消息的队列,点对点
    @Bean
    public Queue queue1(){
        return new ActiveMQQueue("ma1");
    }
    //定义存放消息的队列,发布订阅模式
    @Bean
    public Topic topic(){
        return new ActiveMQTopic("ma2");
    }

}
