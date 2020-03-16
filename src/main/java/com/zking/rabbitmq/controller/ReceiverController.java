package com.zking.rabbitmq.controller;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"queue-first"})
public class ReceiverController {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("receive msg : " + msg);
    }

}
