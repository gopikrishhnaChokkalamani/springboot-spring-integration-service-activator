package com.springboot.integration.serviceActivator.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

@Component
public class IntegrationService {

	@ServiceActivator(inputChannel = "integration.gateway.channel")
	public void recieveMessage(Message<?> message) throws MessagingException {
		System.out.println(message);
	}
}