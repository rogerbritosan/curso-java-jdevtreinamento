package cursojava.base;

public class RepeticaoForBreak {

	public static void main(String[] args) {
		
		// estrutura de repetição for (com parada)
		
		for(int numero = 0; numero <= 10; numero++) {
			if(numero == 3) {
				System.out.println("Encontrei o número três!");
				System.out.println("Vou parar a execução...");
				break;
			}
		}

	}

}
