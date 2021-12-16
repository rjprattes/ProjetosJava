package com.example.notificacao;



import com.example.modelo.Cliente;

public class NotificadorSMS implements Notificador  {

	private boolean caixaAlta;
//	private String hostServidorSmtp;
//	
//	public NotificadorEmail(String hostServidorSmtp) {
////		this.hostServidorSmtp = hostServidorSmtp;
//	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s po SMS através do telefone %s: %s\n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

		
}
   