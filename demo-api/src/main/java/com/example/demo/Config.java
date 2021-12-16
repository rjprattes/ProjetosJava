package com.example.demo;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.notificacao.Notificador;
import com.example.notificacao.NotificadorEmail;
import com.example.notificacao.NotificadorSMS;
import com.example.service.AtivacaoClienteService;

@Configuration
public class Config {
	
	@Bean
	public NotificadorSMS notificadorSMS() {
		NotificadorSMS notificador = new NotificadorSMS();
//		notificador.setCaixaAlta(true);
		return notificador;
	}
		
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail();
//		notificador.setCaixaAlta(true);
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService(List<Notificador> notificador) {
		return new AtivacaoClienteService(notificador);
	}

}
