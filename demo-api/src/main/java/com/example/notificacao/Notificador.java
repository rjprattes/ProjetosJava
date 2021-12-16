package com.example.notificacao;



import com.example.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}