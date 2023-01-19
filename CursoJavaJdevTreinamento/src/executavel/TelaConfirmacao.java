package executavel;

import javax.swing.JOptionPane;

public class TelaConfirmacao {

	public static void main(String[] args) {

		String carrosPergunta = JOptionPane.showInputDialog("Quantos carros tem?");
		String pessoasPergunta = JOptionPane.showInputDialog("E quantas pessoas?");

		int carrosNum = Integer.valueOf(carrosPergunta);
		int pessoasNum = Integer.valueOf(pessoasPergunta);

		int divisao = carrosNum / pessoasNum;
		int resto = carrosNum % pessoasNum;

		int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado?");

		if (confirmacao == 0) {
			JOptionPane.showMessageDialog(null, carrosNum + " carro(s)\n" + pessoasNum + " pessoa(s)\n" + divisao
					+ " carros para cada pessoa. Sobraram " + resto + " carro(s).");
		}

	}

}
