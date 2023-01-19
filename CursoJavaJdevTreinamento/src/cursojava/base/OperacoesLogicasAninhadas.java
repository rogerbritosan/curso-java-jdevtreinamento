package cursojava.base;

public class OperacoesLogicasAninhadas {
	
	public static void main(String[] args) {
		
		double nota1 = 10;
		double nota2 = 9.5;
		double nota3 = 8;
		double nota4 = 9;

		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		// operações lógicas aninhadas: são operações dentro de operações
		
		if(media >= 5) {
			if(media >= 7) {
				if(media >=9) {
					System.out.println("Média: " + media + " - Você foi incrível!");
				} else {
					System.out.println("Média: " + media + " - Aprovado!");
				}
			} else {
				System.out.println("Média: " + media + " - Aluno em recuperação");
			}
		} else {
			System.out.println("Média: " + media + " - Reprovado!");
		}
		
	}

}
