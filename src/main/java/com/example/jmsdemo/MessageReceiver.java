/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jmsdemo;

import java.util.Map;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class MessageReceiver {
    
    @JmsListener(destination = "chatQueue")
    public void onMessage(@Payload Map<String, Object> data) {
        System.out.println("Recieved: " + data.get("name"));
    }

    @JmsListener(destination = "users", containerFactory = "topicFactory")
    public void onTopic(@Payload Object data) {
        System.out.println("Recieved a topic");
    }
}
