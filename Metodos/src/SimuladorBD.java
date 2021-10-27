import java.util.HashSet;
import java.util.Set;

public class SimuladorBD {
	
	public static Set<Aluno> buscarAlunos(){
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(new Aluno("Ricardo"));
		alunos.add(new Aluno("Ana"));
		alunos.add(new Aluno("Maria"));
		
		return alunos;
	}
}
