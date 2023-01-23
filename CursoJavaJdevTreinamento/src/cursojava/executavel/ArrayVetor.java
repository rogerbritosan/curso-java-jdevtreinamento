	package cursojava.executavel;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		// 13.2 - Criando nosso primeiro Array
		// array pode ser de todos os tipos de dados e objetos
		// array sempre deve ter a quantidade de posições definidas
		
		// exemplos
		double notas[] = new double[4];
		String[] disciplinas = new String[4];
		
		notas[0] = 9.5;
		notas[1] = 10;
		notas[2] = 8.9;
		notas[3] = 7;
		
		disciplinas[0] = "Java";
		disciplinas[1] = "XML";
		disciplinas[2] = "ReactJS";
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}
		
		for(int i = 0; i < disciplinas.length; i++) {
			System.out.println("Disciplinas: " + disciplinas[i]);
		}
		
	}

}
