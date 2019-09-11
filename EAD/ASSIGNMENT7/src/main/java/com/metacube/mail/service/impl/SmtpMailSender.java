package com.metacube.mail.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.metacube.mail.service.MailSender;

//@Component("smtpMailSender")
//@Primary
public class SmtpMailSender implements MailSender {
	
	private static final Logger log=LoggerFactory.getLogger(SmtpMailSender.class);
	@Override
	public void sendMail() {
		log.info("Smtp Mail sent");

	}

}
