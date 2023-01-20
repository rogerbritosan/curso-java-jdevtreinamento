package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class RemovendoDisciplinas {

	public static void main(String[] args) {

		// cadastro do aluno
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Rogério");
		aluno1.setIdade(39);
		aluno1.setDataNascimento("28/01/1983");
		aluno1.setRegistroGeral("30.408.020-0");

		int cadastrarDisciplinas = JOptionPane.showConfirmDialog(null, "Cadastrar disciplinas?");

		if (cadastrarDisciplinas == 0) {

			while (cadastrarDisciplinas == 0) {

				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina:");
				double notaDisciplina = Double
						.parseDouble(JOptionPane.showInputDialog("Nota da disciplina " + nomeDisciplina));

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(notaDisciplina);

				aluno1.getDisciplinas().add(disciplina);

				cadastrarDisciplinas = JOptionPane.showConfirmDialog(null, "Cadastrar mais disciplinas?");

			}

			// toString
			System.out.println("Aluno " + aluno1.getNome());
			System.out.println("Média do aluno " + aluno1.getNome() + ": " + aluno1.getMediaNota());
			System.out.println("Situação atual do aluno: " + aluno1.getAlunoResultado());

		}

		if (aluno1.getDisciplinas().size() > 0) {

			String disciplinasAtuais = "";

			for (Disciplina disciplina : aluno1.getDisciplinas()) {
				disciplinasAtuais += "Disciplina: " + disciplina.getDisciplina() + "\nNota: " + disciplina.getNota()
						+ "\n";
			}

			int confirmaRemocao = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			while (confirmaRemocao == 0) {

				disciplinasAtuais = "";

				for (Disciplina disciplina : aluno1.getDisciplinas()) {
					disciplinasAtuais += "Disciplina: " + disciplina.getDisciplina() + "\nNota: " + disciplina.getNota()
							+ "\n\n";
				}

				if (aluno1.getDisciplinas().size() > 0) {

					int removerDisciplina = Integer
							.valueOf(JOptionPane.showInputDialog("Qual disciplina?\n" + disciplinasAtuais));

					aluno1.getDisciplinas().remove(removerDisciplina);

				}
				
				if(aluno1.getDisciplinas().size() > 0) {
					confirmaRemocao = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Remover mais alguma?"));
				}

			}

		}

	}

}
