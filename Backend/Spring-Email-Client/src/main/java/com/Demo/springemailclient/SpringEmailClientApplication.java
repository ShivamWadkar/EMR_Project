package com.Demo.springemailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailClientApplication {

	@Autowired
	EmailSenderService emailService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailClientApplication.class, args);
		
	}
	
		@EventListener(ApplicationReadyEvent.class)
		public void sendMail()
		{
			emailService.sendSimpleEmail("omkarbhise2997@gmail.com", "Message From Sender","Subjet");
		}	
	
}
