package com.example.notificacao;



import com.example.modelo.Cliente;

public class NotificadorEmail implements Notificador  {

	private boolean caixaAlta;
//	private String hostServidorSmtp;
//	
//	public NotificadorEmail(String hostServidorSmtp) {
////		this.hostServidorSmtp = hostServidorSmtp;
//	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atrav�s do email %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

		
}
   