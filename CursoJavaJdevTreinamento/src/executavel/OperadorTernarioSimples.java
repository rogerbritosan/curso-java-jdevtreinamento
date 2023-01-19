package executavel;

public class OperadorTernarioSimples {
	
	public static void main(String[] args) {
		
		double nota1 = 10;
		double nota2 = 9.5;
		double nota3 = 8;
		double nota4 = 9;

		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		// operador ternário
		
		String saidaResultado;
		
		//saidaResultado = media >=7 ? "Aluno aprovado" : "Aluno reprovado";
		
		saidaResultado = media >=7 ? "Aluno aprovado" : (media >= 4.9 && media <= 6.9) ? "Aluno em recuperação" : "Aluno reprovado";
		
		System.out.println(saidaResultado);
		
	}

}
