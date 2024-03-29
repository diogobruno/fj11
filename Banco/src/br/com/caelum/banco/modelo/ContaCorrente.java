package br.com.caelum.banco.modelo;

import br.com.caelum.banco.Tributavel;

public class ContaCorrente extends Conta implements Tributavel, Comparable<ContaCorrente> {
	
	public void atualiza (double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	public void deposita (double valor) {
		this.saldo += valor - 0.10;	
	}
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Corrente";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ContaCorrente){
			ContaCorrente cc = (ContaCorrente) obj;
			return cc.getNumero() == this.getNumero();
		}
		return false;
	}

	@Override
	public int compareTo(ContaCorrente cc) {
		return (int)(getSaldo() - cc.getSaldo());
	}
}
