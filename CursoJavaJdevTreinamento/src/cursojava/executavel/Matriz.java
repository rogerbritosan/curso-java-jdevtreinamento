package cursojava.executavel;

public class Matriz {

	public static void main(String[] args) {
		
		// 13.13 - Lendo uma Matriz multidimensional
		
		int notas[][] = new int[4][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 65;
		notas[1][1] = 82;
		notas[1][2] = 50;
		
		notas[2][0] = 15;
		notas[2][1] = 42;
		notas[2][2] = 20;
		
		notas[3][0] = 25;
		notas[3][1] = 52;
		notas[3][2] = 60;
		
		for(int i = 0; i < notas.length; i++) {
			
			System.out.println("=========================================");
			
			for(int j = 0; j < notas[i].length; j++) {
				
				System.out.println(notas[i][j]);
				
			}
			
		}
		
		
	}

}
