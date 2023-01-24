package cursojava.thread;

import javax.swing.JOptionPane;

public class RotinasThread {

	public static void main(String[] args) throws InterruptedException {
		
		// 14.3 - Criando a primeira Thread
		
		new Thread() {
			
			public void run() {

				// código da rotina que eu quero executar em paralelo
				for (int pos = 0; pos < 10; pos++) {

					// quero executar esse envio com um tempo de parada, ou com um tempo determinado
					System.out.println("Executando alguma rotina, por exemplo envio de email");

					// aguarda 1 seg
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		}.start(); // start liga a thread que fica processando paralelamente
		
		
		System.out.println("Chegou ao fim do código de teste de thread");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}

}
