package com.metacube.mail.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.metacube.mail.service.MailSender;

//@Component("mockMailSender")
//@Primary
public class MockMailSender implements MailSender {
	
	private static final Logger log=LoggerFactory.getLogger(MockMailSender.class);
	@Override
	public void sendMail() {
		log.info("Mock Mail sent");

	}

}
