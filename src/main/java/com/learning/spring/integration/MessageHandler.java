package com.learning.spring.integration;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class MessageHandler {

    @ServiceActivator
    public String handleMessage(String message) {
        System.out.println("Received message: " + message);
        return "MESSAGE:" + message;
    }
}