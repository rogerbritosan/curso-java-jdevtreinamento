	package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor3 {
	
	public static void main(String[] args) {
		
		// 13.4 - Entrada e leitura de forma dinâmica
		// array pode ser de todos os tipos de dados e objetos
		// array sempre deve ter a quantidade de posições definidas
		
		double[] valores = {10, 8.5, 8, 7.2};
		int[] inteiros = {10, 8, 7, 65};
		float[] flutuantes = {8, 60, 10};
		
		System.out.println(valores.length);
		
		
		String[] valoresAleatorios = new String[3];
		valoresAleatorios[0] = "Roger";
		valoresAleatorios[1] = "teste";
		valoresAleatorios[2] = "rogerbritosan@gmail.com";
		
		for(int pos = 0; pos < valoresAleatorios.length; pos++) {
			System.out.println(valoresAleatorios[pos]);
		}
		
		
		
	}

}
