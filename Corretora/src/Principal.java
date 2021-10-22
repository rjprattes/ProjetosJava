
public class Principal {
	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro meuCarro = new Carro(4500d, 2012);
		Imovel minhaCasa = new Imovel(92000,  320);
		Barco meuBarco = new Barco(685555, 2015);
		Notebook meuNotebook = new Notebook(2000, "I7");

		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(meuBarco);
		corretora.fazerPropostaSeguro(meuNotebook);
	}
	
}
