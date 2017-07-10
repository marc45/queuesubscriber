package com.intv.queuesubscriber.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.intv.queuesubscriber.SubscriberApplication;



@Service
public class MessageSubscriber {
	
	
	@RabbitListener(queues = "appGenericQueue")
    public void receiveMessage(final Message message) {
		System.out.println("inside reciever");
		System.out.println(message);
    }
	
	
}
