package com.learning.spring.integration;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class SimpleMessageHandler {

    @ServiceActivator
    public void handleMessage(String message) {
        System.out.println("Received message: " + message);
        
    }
}