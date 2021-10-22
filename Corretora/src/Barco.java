public class Barco implements Seguravel {

	private double valorMercado;
	private int anoFabricacao;

	public Barco(double valorMercado, int anoFabricacao) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	public String obterDescricao() {
		return "Barco ano " + this.anoFabricacao + " com valor de mercado " 
			+ this.valorMercado;
	}

	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.5;
		if (anoFabricacao < 2000) {
			valorApolice = valorApolice * 1.5;
		}
		return valorApolice;
	}

}