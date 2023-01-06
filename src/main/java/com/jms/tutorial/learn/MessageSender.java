/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jms.tutorial.learn;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author erick.karanja
 */
@RequiredArgsConstructor
@Component
public class MessageSender {

    private final JmsTemplate jmsTemplate;
    private static Integer ID = 1;

    @Scheduled(fixedRate = 2000)
    public void sendMessage() {
        System.out.println("Greetings User");
        Message message = Message.builder()
                .id(UUID.randomUUID())
                .message("Greetings User " + ID++)
                .build();
        jmsTemplate.convertAndSend(JmsConfig.QUEUE, message);
        System.out.println("Message sent!!!");

    }

}
