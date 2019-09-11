package com.metacube.mail.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metacube.mail.service.MailSender;

@RestController
public class AppController {
	
	private MailSender mailSender;
	
	// Using Component
	
	
	//Constructor injection using primary annotation  
	/*@Autowired
	public AppController(MailSender mailSender) {
		this.mailSender=mailSender;
	}*/
	
	
	
	//Constructor injection using name
	/*@Autowired
	public AppController(MailSender smtpMailSender) {
		this.mailSender=smtpMailSender;
	}*/
	
	
	
	//Constructor injection using Qualifier
	public AppController(@Qualifier("mockMailSender") MailSender mailSender) {
		this.mailSender=mailSender;
	}
	
	
	
	//Setter injection using primary annotation
	/*@Autowired
	public void setMailSender(MailSender mailSender) {
		this.mailSender=mailSender;
	}*/
	
	
	
	//Setter injection injection using name
		/*@Autowired
		public void setMailSender(MailSender smtpMailSender) {
			this.mailSender=smtpMailSender;
		}*/
	
	
	
	//Setter injection using Qualifier
		/*@Autowired
		public void setMailSender(@Qualifier("mockMailSender")  MailSender mailSender) {
			this.mailSender = mailSender;
		}*/
	
	
	
	@RequestMapping("/hello")
	public String helloWorld() {
		mailSender.sendMail();
		return "Hello World";
	}

}