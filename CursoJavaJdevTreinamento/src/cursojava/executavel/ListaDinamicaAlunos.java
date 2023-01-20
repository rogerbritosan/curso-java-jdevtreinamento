package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ListaDinamicaAlunos {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		int cadastroAluno = JOptionPane.showConfirmDialog(null, "Deseja cadastrar aluno?");
		
		while(cadastroAluno == 0) {
			
			// instância de aluno
			Aluno aluno = new Aluno();
			aluno.setNome(JOptionPane.showInputDialog("Digite o nome"));
			aluno.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade")));
			aluno.setDataNascimento(JOptionPane.showInputDialog("Digite a data de nascimento"));
			
			alunos.add(aluno);
			
			
			int cadastroDisciplina = JOptionPane.showConfirmDialog(null, "Deseja cadastrar uma disciplina?");
			
			while(cadastroDisciplina == 0) {
				
				// instância de disciplinas
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(JOptionPane.showInputDialog("Qual?"));
				disciplina.setNota(Double.parseDouble(JOptionPane.showInputDialog("Nota da disciplina " + disciplina.getDisciplina() + ":")));
				
				aluno.getDisciplinas().add(disciplina);
				
				cadastroDisciplina = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra disciplina?");
				
			}
			
			JOptionPane.showMessageDialog(null, "Média de notas do aluno " + aluno.getNome() + ": " + aluno.getMediaNota());
			JOptionPane.showMessageDialog(null, "Aluno " + aluno.getNome() + ": " + aluno.getAlunoResultado());
			
			cadastroAluno = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro aluno?");
			
		}

	}

}
