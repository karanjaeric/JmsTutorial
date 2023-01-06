/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jms.tutorial.learn;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 *
 * @author erick.karanja
 */
@Component
public class MessageListener {

    @JmsListener(destination = JmsConfig.QUEUE)
    public void listen(@Payload Message message, @Headers MessageHeaders messageHeaders) {
        // Display command
        System.out.println("Greeting Received!!!");
        System.out.println(message);

    }

}
