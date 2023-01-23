package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor4 {

	public static void main(String[] args) {

		// 13.6 - Adicionando o array de notas dentro da disciplina

		Aluno aluno = new Aluno();
		aluno.setNome("Rogério Brito dos Santos");
		aluno.setNomeEscola("Jdev Treinamento");

		double[] notas = {8.9, 10, 9.5, 7};
		double[] notasHTML = {7.9, 8, 7.5, 10};
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");		
		disciplina.setNota(notas);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("HTML");		
		disciplina2.setNota(notasHTML);
		
		
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Nome do aluno: " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
		for(Disciplina d : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + d.getDisciplina());
			System.out.println("Notas das disciplinas: ");
			
			for(int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota: " + pos + " é igual = " + d.getNota()[pos]);
			}
			
		}
		
		
	}

}
