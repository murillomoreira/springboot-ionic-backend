package com.mamc.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.mamc.cursomc.domain.Pedido;

public interface EmailService {

	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
