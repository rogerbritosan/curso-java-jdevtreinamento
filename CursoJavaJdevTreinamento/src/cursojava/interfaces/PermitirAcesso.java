package cursojava.interfaces;

// contrato
public interface PermitirAcesso {

	// apenas declaração do método
	// obrigatório pra quem implementa
	//public boolean autenticar();
	
	public boolean autenticar(String login, String senha);
	
}
