package cursojava.base;

public class OperacoesLogicasIfEElse {

	public static void main(String[] args) {

		double nota1 = 10;
		double nota2 = 9.5;
		double nota3 = 8;
		double nota4 = 9;

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 4.9 && media <= 6.9) {
			System.out.println("Aluno em recuperação.");
		} else {
			System.out.println("Aluno reprovado.");
		}

	}

}
