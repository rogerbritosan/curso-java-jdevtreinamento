package principio.responsabilidade;

public class ContaBancaria {
	
	// Princípio de responsabilidade Única - SOLID
	
	private String descricao;
	private double saldo = 1000;
	
	public void deposita(Double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(Double saque) {
		this.saldo -= saque;
	}

}
