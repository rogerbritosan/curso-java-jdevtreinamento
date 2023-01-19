package cursojava.base;

public class VariavelLocalGlobal {

	// variável global acessível a todos
	static int maiorIdadeGlobal = 21;

	public static void main(String[] args) {

		// variável global
		int maiorIdade = 18;
		
		System.out.println("Variável local: " + maiorIdade);
		System.out.println("Variável local/global: " + maiorIdadeGlobal);
		
		OutroMetodo();

	}
	
	public static void OutroMetodo() {
		System.out.println("Variável global: " + maiorIdadeGlobal);
	}

}
