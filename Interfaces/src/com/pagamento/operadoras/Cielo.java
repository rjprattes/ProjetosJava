package com.pagamento.operadoras;

import com.pagamento.Autorizavel;
import com.pagamento.Cartao;
import com.pagamento.Operadora;

public class Cielo implements Operadora {

	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123") 
				&& autorizavel.getValorTotal() < 100;
	}

}
