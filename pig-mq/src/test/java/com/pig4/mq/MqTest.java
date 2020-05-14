package com.pig4.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PigMQApplication.class)
public class MqTest {
	@Autowired
	private RabbitMessagingTemplate rabbitTemplate;
	@Test
	public void testSend() {
		rabbitTemplate.convertAndSend("hello","我要钱");
	}

	@Test
	public void testSimple() {
		/**
		 * 参数一：队列的名称
		 * 参数二：消息内容（可以是任意类型）
		 */
		rabbitTemplate.convertAndSend("hello", "测试简单模式的消息...");
	}

	@Test
	public void testPS() {
		/**
		 * 参数一：交换器名称
		 * 参数二：routingKey 路由规则 (注意：发布订阅模式的routingKey为空的)
		 * 参数三：消息内容
		 */
		rabbitTemplate.convertAndSend("ps_exchange", "", "测试发布订阅模式...");
	}
}
