import java.util.Set;

public class TesteSetHashSet {

	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBD.buscarAlunos();
		
		Aluno alunoSorteado = new Aluno("Ana");
		
		if (alunos.contains(alunoSorteado)) {
			System.out.println("Parabéns " + alunoSorteado.getNome() + ", você ganhou um pão!");
		} else {
			System.out.println("Aluno não encontrado!");
		}
	}
}
