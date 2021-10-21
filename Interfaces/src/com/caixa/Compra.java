package com.caixa;

import com.impressao.Imprimivel;
import com.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel{
	
	private double valorTotal;
	private String produto;
	private String nomeCliente;

	public double getValorTotal() {
		return this.valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
	public String getCabecalho() {
		return this.getProduto() + " = " +this.getValorTotal();
	}
	public String getCorpoPagina() {
		return this.getNomeCliente();
	}

	

}
