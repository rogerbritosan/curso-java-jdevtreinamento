package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setIdade(20);
		aluno.setNome("Roger");

		Diretor diretor = new Diretor();
		diretor.setIdade(50);
		diretor.setNome("Anderson");

		Secretario secretario = new Secretario();
		secretario.setIdade(30);
		secretario.setNome("Roberto");

		System.out.println("Aluno é maior de idade? " + aluno.maiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println("Ajuda de custo do aluno " + aluno.salario());
		System.out.println("Diretor é maior de idade? " + diretor.maiorIdade());
		System.out.println("Salário do diretor: " + diretor.salario());
		System.out.println("Secretário é maior de idade? " + secretario.maiorIdade());
		System.out.println("Salário do secretário: " + secretario.salario());

		teste(aluno);
		teste(diretor);
		teste(secretario);

	}

	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais: " + pessoa.getNome() + " e o salário é " + pessoa.salario());
	}

}
