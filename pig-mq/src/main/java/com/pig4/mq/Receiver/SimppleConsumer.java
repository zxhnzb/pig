package com.pig4.mq.Receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/**直接模式-消费者*/
@Component // 必须放入IOC容器
@RabbitListener(queues= {"hello"}) // 绑定一个或多个队列
public class SimppleConsumer {

	/**
	 * 消息接收方法
	 */
	@RabbitHandler // 代表接收消息，在方法的参数里面，可以指定接收消息的类型（和生产者的类型是一样的）
	public void receiveMessage(String message) {
		System.out.println("接收的消息222："+message);
	}


}

