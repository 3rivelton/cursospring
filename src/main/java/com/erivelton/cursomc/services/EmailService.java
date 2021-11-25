package com.erivelton.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.erivelton.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
