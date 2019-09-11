package com.metacube.mail.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.metacube.mail.service.MailSender;
import com.metacube.mail.service.impl.SmtpMailSender;
import com.metacube.mail.service.impl.MockMailSender;


@Configuration
public class AppConfig {
	
	@Bean	
	//@Primary
	public MailSender smtpMailSender() {
		return new SmtpMailSender();
	}
	
	@Bean
	
	public MailSender mockMailSender() {
		return new MockMailSender();
	}
	
	
	
}
