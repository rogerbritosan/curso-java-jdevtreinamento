package executavel;

public class RepeticaoWhileDoWhile {

	public static void main(String[] args) {

		// estrutura de repetição
		int numero = 1;
		while (numero <= 60) {
			System.out.println("O número atual é: " + numero);
			numero++;
		}
		
		System.out.println("-------------------------------------");

		// primeiro executa e depois verifica
		int x = 1;
		do {
			System.out.println("O número atual é: " + x);
			x++;
		} while (x <= 30);

	}

}
