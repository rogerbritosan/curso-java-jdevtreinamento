package cursojava.executavel;

import cursojava.classes.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Rogério");
		aluno1.setIdade(39);
		aluno1.setDataNascimento("28/01/1983");
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data de nasc: " + aluno1.getDataNascimento());
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Rogério");
		aluno2.setIdade(25);
		aluno2.setDataNascimento("01/10/1980");
		
		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("Idade: " + aluno2.getIdade());
		System.out.println("Data de nasc: " + aluno2.getDataNascimento());
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Roger");
		
		Aluno aluno5 = new Aluno("Roger", 39);
		
		// com o toString definido
		System.out.println(aluno1);
		
		System.out.println("\n");
		
		// utilizando equals e hashcode para comparar valores
		// pra isso, foi gerado o equals/hashcode apenas do nome
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos iguais");
		} else {
			System.out.println("Alunos diferentes");
		}
		
		
	}

}
