package br.com.caelum.banco;

import br.com.caelum.banco.modelo.ContaCorrente;

public class TestaLang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object c = new Object();
		System.out.println(c);
		System.out.println(new ContaCorrente());
		
		ContaCorrente cc = new ContaCorrente();
		cc.setNumero(10);
		ContaCorrente cc2 = new ContaCorrente();
		cc2.setNumero(10);
		System.out.println(cc.equals(cc2));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(123));
		int i = Integer.parseInt("127");
		System.out.println(i);
	}

}
