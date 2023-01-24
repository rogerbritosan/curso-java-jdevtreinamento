package cursojava.executavel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class SplitArray {
	
	public static void main(String[] args) {
		
		// 13.14 - String e o Método Split para Array
		
		//String texto = "Roger,Brito,dos,Santos";
		String texto = JOptionPane.showInputDialog("Digite um texto separado por \",\"");
		String[] arrayTextos = texto.split(",");
		//System.out.println(arrayTexto[0]);
		
		// Percorrer um array
		System.out.println("Percorrer um array");
		for(int i = 0; i < arrayTextos.length; i++) {
			System.out.println(arrayTextos[i]);
		}
		
		System.out.println("=================================");
		
		// convertendo um array em uma lista
		System.out.println("convertendo um array em uma lista");
		List<String> listaTextos = Arrays.asList(arrayTextos);
		
		for(String trechos : listaTextos) {
			System.out.println(trechos);
		}
		
		System.out.println("=================================");
		
		// convertendo uma lista num array
		System.out.println("convertendo uma lista num array");
		// new String[1] na hora da conversão, ignorou o 1 de posições e trouxe as posições corretas com os valores
		String[] conversaoArray = listaTextos.toArray(new String[1]);
		
		for(int i = 0; i < conversaoArray.length; i++) {
			System.out.println(conversaoArray[i]);
		}
		
		System.out.println("=================================");
		
		System.out.println("tamanho desse array: " + conversaoArray.length);
		
		
	}

}
