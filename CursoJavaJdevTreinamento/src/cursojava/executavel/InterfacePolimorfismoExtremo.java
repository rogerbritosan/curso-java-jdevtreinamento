package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class InterfacePolimorfismoExtremo {

	public static void main(String[] args) {
		
		// 10.12 - Método de interface com parâmetros
		// 10.13 - Interfaces e construtores
		// 10.14 - Interfaces e o polimorfismo extremo

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");	
		
		// FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
		
		// PermitirAcesso permitirAcesso = new Secretario(login, senha);		
			
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			// K => chave
			// V => valor
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			// acabo não precisando mais dessas listas extras
			//		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
			//		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

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

			// HashMap

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			// criando as listas de aprovados e reprovados
			for (Aluno aluno : alunos) {

				if (aluno.getAlunoResultado().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoResultado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}

			}

			System.out.println("---------------------- Lista dos aprovados------------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out
						.println("Resultado: " + aluno.getAlunoResultado() + " com média de: " + aluno.getMediaNota());
			}

			System.out.println("---------------------- Lista dos reprovados------------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out
						.println("Resultado: " + aluno.getAlunoResultado() + " com média de: " + aluno.getMediaNota());
			}

		} else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido!");
		}

	}

}
