package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	// 	14.11 - Criando a Fila e Pilha para processar paralelo em Thread

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilhaFila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilhaFila.add(objetoFilaThread);
	}

	public void run() {
		Iterator iteracao = pilhaFila.iterator();

		synchronized (iteracao) { // bloquear o acesso a esta lista por outros processos

			while (iteracao.hasNext()) { // enquanto conter dados na lista irá processar
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

				// exemplos:
				// processar 10 mil notas fiscais
				// gerar uma lista enorme de PDF
				// gerar um envio em massa de emails
				
				System.out.println("==========================================");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());

				iteracao.remove();

				try {
					Thread.sleep(100); // é essencial dar um tempo para a descarga de memória
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		try {
			Thread.sleep(1000); // processou toda a lista, dê um tempo para a limpesa de memória
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
