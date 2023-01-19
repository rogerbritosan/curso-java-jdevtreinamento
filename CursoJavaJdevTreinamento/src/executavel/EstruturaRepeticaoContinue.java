package executavel;

public class EstruturaRepeticaoContinue {

	public static void main(String[] args) {
		
		// estrutura de repetição for e continue
		
		for(int numero = 0; numero <= 10; numero++) {
			if(numero == 3) {
				System.out.println("Se liga! Encontrei o número 3");
				System.out.println("estou pulando...");
				continue;
			}
			System.out.println("Número: " + numero);
		}

	}

}
