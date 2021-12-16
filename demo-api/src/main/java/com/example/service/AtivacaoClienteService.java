package com.example.service;




import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.modelo.Cliente;
import com.example.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	@Autowired
	private List<Notificador> notificador;
	
	@PostConstruct
	public void init() {
		System.out.println("INIT" + notificador);
	}
	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}


	
	public AtivacaoClienteService(List<Notificador> notificador) {
		this.notificador = notificador;	
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		for(Notificador notificador : notificador) {
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	}
//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = (List<Notificador>) notificador;
//	}
	
}
