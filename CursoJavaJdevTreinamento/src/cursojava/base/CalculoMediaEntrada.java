package cursojava.base;

import javax.swing.JOptionPane;

public class CalculoMediaEntrada {

	public static void main(String[] args) {

		// Calculando a média de notas com telas de entrada

		String nota1Pergunta = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2Pergunta = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3Pergunta = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4Pergunta = JOptionPane.showInputDialog("Informe a nota 4");

		double nota1 = Double.parseDouble(nota1Pergunta);
		double nota2 = Double.parseDouble(nota2Pergunta);
		double nota3 = Double.parseDouble(nota3Pergunta);
		double nota4 = Double.parseDouble(nota4Pergunta);

		// média de aprovação: 7
		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 5) {
			if (media >= 7) {
				if (media >= 9) {
					JOptionPane.showMessageDialog(null, "Incrível!");
				} else {
					JOptionPane.showMessageDialog(null, "Aprovado.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Em recuperação.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Reprovado!");
		}

	}

}
