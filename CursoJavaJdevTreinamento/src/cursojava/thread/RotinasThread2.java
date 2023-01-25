package cursojava.thread;

import javax.swing.JOptionPane;

public class RotinasThread2 {

	public static void main(String[] args) throws InterruptedException {
		
		// 14.4 - Processamento concorrente entre duas Thread
		
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
		
		
		// Thread processando em paralelo do envio de nota fiscal
		new Thread() {
			
			public void run() {
				
				for(int pos = 0; pos < 10; pos++) {
					
					System.out.println("Executando a rotina de envio de nota fiscal.");
					
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
			}
			
		}.start();
		
		
		System.out.println("Chegou ao fim do código de teste de thread");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}

}
