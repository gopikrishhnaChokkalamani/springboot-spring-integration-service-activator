package com.springboot.integration.serviceActivator.intfc;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface IntegrationAdapterGateway {
	@Gateway(requestChannel = "integration.gateway.channel")
	public void sendMessage(String message);
}
