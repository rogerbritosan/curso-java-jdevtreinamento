package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

	// 10.14 - Interfaces e o polimorfismo extremo
	// realmente e somente receber alguém que tenha o contrato da interface de PermitirAcesso e chamar o autenticar
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
