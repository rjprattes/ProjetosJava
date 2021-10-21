package com.impressao.impressoras;

import com.impressao.Impressora;
import com.impressao.Imprimivel;

public class HP implements Impressora {

	public void imprimir(Imprimivel imprimivel) {
		System.out.println("*************************");
		System.out.println(imprimivel.getCabecalho());
		System.out.println("*************************");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("           HP            ");
		System.out.println("-------------------------");

	}

}
