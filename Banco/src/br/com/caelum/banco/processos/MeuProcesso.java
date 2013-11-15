package br.com.caelum.banco.processos;

public class MeuProcesso implements Runnable {
	public int id;

	public MeuProcesso(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("processo: " + id + " iteracao: " + i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}