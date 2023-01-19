package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class TesteAluno2 {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Rogério");
		aluno1.setIdade(39);
		aluno1.setDataNascimento("28/01/1983");
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Java");
		disciplina1.setNota(10);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Docker");
		disciplina2.setNota(9);
		
		// adicionando as disciplinas na lista
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);

		System.out.println(aluno1);
		System.out.println("Média do aluno: " + aluno1.getMediaNota());
		System.out.println("O aluno " + aluno1.getNome() + " foi aprovado? " + aluno1.getAlunoAprovado());
		
	}

}
