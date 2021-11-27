package com.erivelton.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class SmtpEmailService extends AbstractEmailService {

	@Autowired
	private MailSender mailSender;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);
	
	/**
	 * Links para liberar envio de email no google
	 * http://www.google.com/settings/security/lesssecureapps
	 * http://accounts.google.com/b/0/DisplayUnlockCaptcha
	 */
	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		LOG.info("Enviando email");
		mailSender.send(msg);
		LOG.info("email enviado");
		
	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		LOG.info("Enviando email");
		javaMailSender.send(msg);
		LOG.info("email enviado");
	}

}
