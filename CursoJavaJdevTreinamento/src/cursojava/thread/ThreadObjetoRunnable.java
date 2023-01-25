package cursojava.thread;

import javax.swing.JOptionPane;

public class ThreadObjetoRunnable {

	public static void main(String[] args) {

		// Thread em objeto e o Runnable

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();

		System.out.println("Chegou ao fim do código de teste de thread");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}

	private static Runnable thread1 = new Runnable() {

		@Override
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

	};

	// Thread processando em paralelo do envio de nota fiscal
	private static Runnable thread2 = new Runnable() {

		public void run() {

			for (int pos = 0; pos < 10; pos++) {

				System.out.println("Executando a rotina de envio de nota fiscal.");

				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		}

	};

}
