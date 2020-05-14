package com.pig4.mq.Receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 2 * @Author: zxh
 * 3 * @Date: 2020/5/14 11:03
 * 4
 */
@Component
@RabbitListener(queues = "my")
public class Consumer3 {

    @RabbitHandler
    public void sendMessage(String msg){
        System.out.println("my接收到的消息："+msg);
    }
}
