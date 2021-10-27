import java.util.Set;

public class TesteSetHashSet {

	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBD.buscarAlunos();
		
		Aluno alunoSorteado = new Aluno("Ana");
		
		if (alunos.contains(alunoSorteado)) {
			System.out.println("Parab�ns " + alunoSorteado.getNome() + ", voc� ganhou um p�o!");
		} else {
			System.out.println("Aluno n�o encontrado!");
		}
	}
}
