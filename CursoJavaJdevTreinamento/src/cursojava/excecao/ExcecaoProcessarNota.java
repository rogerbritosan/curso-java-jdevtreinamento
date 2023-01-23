package cursojava.excecao;

public class ExcecaoProcessarNota extends Exception {
	
	// 11.13 - Criando uma classe de exceção customizada
	
	public ExcecaoProcessarNota(String erro) {
		super("Um erro no processamento do arquivo ao processar: " + erro);
	}

}
