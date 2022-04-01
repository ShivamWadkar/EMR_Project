package com.Demo.springemailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

	@Autowired
	private JavaMailSender mailSender;
	
	public void sendSimpleEmail(String toEmail, String body, String subject)
	{
		
		SimpleMailMessage m = new SimpleMailMessage();
		m.setFrom("ranyarb2432@gmail.com");
		m.setTo(toEmail);
		m.setText(body);
		m.setSubject(subject);
		
		mailSender.send(m);
		System.out.println("Mail Send Successfully");
		
	}
	
	
	
}
