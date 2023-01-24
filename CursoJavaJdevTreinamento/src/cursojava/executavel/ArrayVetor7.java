package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor7 {

	public static void main(String[] args) {

		// 13.9 - Descobrindo a menor nota do aluno

		Aluno aluno = new Aluno();
		aluno.setNome("Rogério Brito dos Santos");
		aluno.setNomeEscola("Jdev Treinamento");

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Anderson Brito dos Santos");
		aluno2.setNomeEscola("Alura");

		double[] notas = { 8.9, 9.7, 9.5, 7 };
		double[] notasHTML = { 7.9, 8, 7.5, 8.7 };

		double[] notasUx = { 8.5, 7.6, 8.5, 10};
		double[] notasUi = { 10, 8, 9, 8.7 };

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setNota(notas);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("HTML");
		disciplina2.setNota(notasHTML);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("UX");
		disciplina3.setNota(notasUx);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("HTML");
		disciplina4.setNota(notasUi);

		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		
		aluno2.getDisciplinas().add(disciplina3);
		aluno2.getDisciplinas().add(disciplina4);

		// Array de objetos
		//Aluno arrayAlunos[] = new Aluno[3];
		
		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for(int pos = 0; pos < arrayAlunos.length; pos++) {
			
			System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());
			
			for(Disciplina d: arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Disciplina: " + d.getDisciplina());
				
				for(int posNota = 0; posNota < d.getDisciplina().length(); posNota++) {
					System.out.println("Nota " + posNota + ": " + d.getNota()[posNota]);
				}
				
			}
			
			System.out.println();
			
		}

	}

}
