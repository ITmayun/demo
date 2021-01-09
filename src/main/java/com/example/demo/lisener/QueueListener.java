package com.example.demo.lisener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class QueueListener {
    @SendTo("SQueue")//方法的返回值发送到SQueue队列上
    @JmsListener(destination = "ma1")

    public String listenerQueue(String message){
        try {
            System.out.println("接收到消息：：：" + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
             return "ojbk";
        //返回值发送到 SQueue 队列中  ，， 如果返回值能够入队，代表消息已经完成正常处理后
        // 分布式事务
    }
}
