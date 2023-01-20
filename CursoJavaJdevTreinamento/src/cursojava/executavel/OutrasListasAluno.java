package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class OutrasListasAluno {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		int cadastroAluno = JOptionPane.showConfirmDialog(null, "Deseja cadastrar aluno?");

		while (cadastroAluno == 0) {

			// instância de aluno
			Aluno aluno = new Aluno();
			aluno.setNome(JOptionPane.showInputDialog("Digite o nome"));
			aluno.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade")));
			aluno.setDataNascimento(JOptionPane.showInputDialog("Digite a data de nascimento"));

			alunos.add(aluno);

			int cadastroDisciplina = JOptionPane.showConfirmDialog(null, "Deseja cadastrar uma disciplina?");

			while (cadastroDisciplina == 0) {

				// instância de disciplinas
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(JOptionPane.showInputDialog("Qual?"));
				disciplina.setNota(Double.parseDouble(
						JOptionPane.showInputDialog("Nota da disciplina " + disciplina.getDisciplina() + ":")));

				aluno.getDisciplinas().add(disciplina);

				cadastroDisciplina = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra disciplina?");

			}

			JOptionPane.showMessageDialog(null,
					"Média de notas do aluno " + aluno.getNome() + ": " + aluno.getMediaNota());
			JOptionPane.showMessageDialog(null, "Aluno " + aluno.getNome() + ": " + aluno.getAlunoResultado());

			cadastroAluno = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro aluno?");

		}

		// criando as listas de aprovados e reprovados
		for (Aluno aluno : alunos) {

			if (aluno.getAlunoResultado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else if (aluno.getAlunoResultado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				alunosReprovados.add(aluno);
			}

		}
		
		System.out.println("---------------------- Lista dos aprovados------------------------");
		for(Aluno aluno : alunosAprovados) {
			System.out.println("Resultado: " + aluno.getAlunoResultado() + " com média de: " + aluno.getMediaNota());
		}
		
		System.out.println("---------------------- Lista dos reprovados------------------------");
		for(Aluno aluno : alunosReprovados) {
			System.out.println("Resultado: " + aluno.getAlunoResultado() + " com média de: " + aluno.getMediaNota());
		}
		

	}

}
