package com.example.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.modelo.Cliente;
import com.example.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	private Notificador notificador;

	@Autowired
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		if(notificador != null) {
			notificador.notificar(cliente, "Seu cadastro no sistema est� ativo!");
		}else {
			System.out.println("Não existe notificador, mas cliente foi ativado");
		}
	}
	@Autowired
	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}
	
}
