package cursojava.executavel;

import cursojava.classes.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Rogério";
		
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Roger");
		
		Aluno aluno5 = new Aluno("Roger", 39);

	}

}
