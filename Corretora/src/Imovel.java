
public class Imovel implements Seguravel {

	private double valorMercado;
	private int areaConstruida;
		
	public Imovel(double valorMercado, int areaConstruida) {
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}

	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.003;
		valorApolice = valorApolice + (areaConstruida * 0.05);
		return valorApolice;
	}

	public String obterDescricao() {
		return "Im�vel com �rea contru�da de " + this.areaConstruida + "m� e valor de mercado "
				+ this.valorMercado;
	}
	
}
