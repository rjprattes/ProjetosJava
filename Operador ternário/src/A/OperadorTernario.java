package A;

import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		String indicacao = (idade >= 18) ? "Adulto" :  (idade <= 12) ? "Crian�a" : "Adolescente";
			
		System.out.println("Resultado: " + indicacao);
	}
}
