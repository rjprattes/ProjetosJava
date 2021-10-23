
public class TesteExcecoes {
	
		public static void main(String[] args) {
			ContaCorrente cc = new ContaCorrente(100);
			
			try {
				cc.sacar(50);
			} catch (SaldoInsuficiente e) {
				System.out.println("Saldo insuficiente!");
			}
			System.out.println("Saldo: " + cc.getSaldo());
			
			try {
				cc.sacar(60);
			} catch (SaldoInsuficiente e) {
				System.out.println("Saldo insuficiente!");
			}
			finally {
				System.out.println("Volte sempre!");
			}
			System.out.println("Saldo: " + cc.getSaldo());
		}		
		
}
