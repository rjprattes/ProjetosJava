
public class Notebook implements Seguravel{
	
	private double valorMercado;
	private String processador;
	
	public Notebook(double valorMercado, String processador) {
		this.valorMercado = valorMercado;
		this.processador = processador;
	}

	public double calcularValorApolice() {
		if (processador == "I3") {
			valorMercado = valorMercado * 0.3;
		} else {
			if (processador == "I5") {
				valorMercado = valorMercado * 0.5;
			} else {
				if (processador == "I7") {
					valorMercado = valorMercado * 0.7;
				}
			}
		}
		return valorMercado;
	}

	public String obterDescricao() {
		return "Notebook " + this.processador + " com valor de mercado " 
				+ this.valorMercado;
	}
	
	
}
