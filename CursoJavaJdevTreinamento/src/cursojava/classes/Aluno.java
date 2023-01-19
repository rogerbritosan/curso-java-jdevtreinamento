package cursojava.classes;

public class Aluno {

	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	// construtor padrão
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

}
