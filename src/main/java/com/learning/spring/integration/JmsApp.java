package com.learning.spring.integration;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.core.PollableChannel;
import org.springframework.integration.support.MessageBuilder;

/**
 * Hello world!
 *
 */

public class JmsApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:jms-simple-spring-context.xml");
        context.start();

        MessageChannel input = (MessageChannel) context.getBean("input");
        PollableChannel output = (PollableChannel) context.getBean("output");
        input.send(MessageBuilder.withPayload("Integration Example").build());
        Message<?> reply = output.receive();
        System.out.println("received: " + reply);
        
	}
}