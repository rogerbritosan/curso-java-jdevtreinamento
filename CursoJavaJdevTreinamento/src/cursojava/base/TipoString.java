package cursojava.base;

public class TipoString {
	
	public static void main(String[] args) {
		
		// String do Java sempre será um texto de qualquer tamanho
		String nome = "Rogério Brito dos Santos";
		String cpf = "409.741.159-99";
		String telefone = "(11) 98456-98454";
		String endereco = "Palo Alto Califórnia";
		int idade = 39;
		
		String saida = "Meu nome é " + nome +
				" e o CPF é " + cpf + ". Tel: " +
					telefone + " e moro em " +
						endereco + ". Tenho " + idade + " anos.";
		
		System.out.println(saida);
		
		
	}

}
