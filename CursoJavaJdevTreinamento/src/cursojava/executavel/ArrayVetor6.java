package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor6 {

	public static void main(String[] args) {

		// 13.9 - Descobrindo a menor nota do aluno

		Aluno aluno = new Aluno();
		aluno.setNome("Rogério Brito dos Santos");
		aluno.setNomeEscola("Jdev Treinamento");

		double[] notas = { 8.9, 9.7, 9.5, 7 };
		double[] notasHTML = { 7.9, 8, 7.5, 8.7 };

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setNota(notas);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("HTML");
		disciplina2.setNota(notasHTML);

		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);

		System.out.println("Nome do aluno: " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
		System.out.println();

		for (Disciplina d : aluno.getDisciplinas()) {

			System.out.println("Disciplina: " + d.getDisciplina());
			System.out.println("Notas das disciplinas: ");
			
			double notaMax = 0.0;

			for (int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota: " + pos + " é igual = " + d.getNota()[pos]);
				
				if(pos == 0) {
					notaMax = d.getNota()[pos];
				} else if (d.getNota()[pos] < notaMax) {
					notaMax = d.getNota()[pos];
				}
				
			}
			
			System.out.println("A menor nota da disciplina " + d.getDisciplina() + " é " + notaMax);
			System.out.println();

		}

	}

}
