package com.teste;

import com.caixa.Checkout;
import com.caixa.Compra;
import com.impressao.Impressora;
import com.impressao.impressoras.HP;
import com.pagamento.Cartao;
import com.pagamento.Operadora;
import com.pagamento.operadoras.Cielo;

public class TesteCheckout {
	
	public static void main(String[] args) {
		Operadora operadora = new Cielo();
		Impressora impressora = new HP();
	
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Rogeres J Prates");
		cartao.setNumeroCartao("123336");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Rogeres José Prates");
		compra.setProduto("Pão");
		compra.setValorTotal(2.5);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		
	}
}
