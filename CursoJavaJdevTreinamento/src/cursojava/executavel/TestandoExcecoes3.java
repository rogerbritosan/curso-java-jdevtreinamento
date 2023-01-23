package cursojava.executavel;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class TestandoExcecoes3 {

	public static void main(String[] args) {

		// 11.9 - Entendendo a classe Exception

		try {

			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			// FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();

			// PermitirAcesso permitirAcesso = new Secretario(login, senha);

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();

				File arq = new File("c://teste.txt");
				Scanner scanner = new Scanner(arq);

//				 List<Aluno> alunos = null;

				// K => chave
				// V => valor
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				// acabo não precisando mais dessas listas extras
				// List<Aluno> alunosAprovados = new ArrayList<Aluno>();
				// List<Aluno> alunosReprovados = new ArrayList<Aluno>();

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
					System.out.println(
							"Resultado: " + aluno.getAlunoResultado() + " com média de: " + aluno.getMediaNota());
				}

				System.out.println("---------------------- Lista dos reprovados------------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(
							"Resultado: " + aluno.getAlunoResultado() + " com média de: " + aluno.getMediaNota());
				}

			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido!");
			}

		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			// imprime erro no console
			e.printStackTrace();

			//
			for (int i = 0; i < e.getStackTrace().length; i++) {

//				System.out.println("Classe de erro: " + e.getStackTrace()[i].getClassName());
//				System.out.println("Método do erro: " + e.getStackTrace()[i].getMethodName());
//				System.out.println("Linha do erro: " + e.getStackTrace()[i].getLineNumber());

				saida.append("\nClasse de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\nMétodo do erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\nLinha do erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("\nClass: " + e.getClass().getName());

			}

			// mensagem de erro ou causa
//			JOptionPane.showMessageDialog(null, "Erro ao processar notas " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Erro de conversão de número: " + saida.toString());

		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opa um null pointer exception: " + e.getClass());
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getClass().getName());
		} finally {
			// sempre é executado havendo erros ou não
			System.out.println("Você está aprendendo Java. Continue!");
		}

	}

}
