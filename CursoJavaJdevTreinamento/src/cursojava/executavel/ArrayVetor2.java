	package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor2 {
	
	public static void main(String[] args) {
		
		// 13.4 - Entrada e leitura de forma dinâmica
		// array pode ser de todos os tipos de dados e objetos
		// array sempre deve ter a quantidade de posições definidas
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições do array vc quer?");
		int posicoesNum = Integer.parseInt(posicoes);
		double notas[] = new double[posicoesNum];
		
		for(int pos = 0; pos < notas.length; pos++) {
			notas[pos] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor p/ a posição " + pos + ":"));
		}
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}
		
		
		
		
	}

}
