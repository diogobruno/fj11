
public class TestaClasseAbstrata {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Funcionario f = new Estagiario();
		f.setSalario(1000);
		System.out.println(f.getBonificacao());
		
		Conta c = new ContaSalario("diogo");
		c.deposita(100);
		c.atualiza(0.01);
		
		System.out.println();
		
		Conta cc = new ContaCorrente();
		cc.deposita(500);
		cc.atualiza(0.5);
		cc.transferePara(cc, 1000.0);
		
		c.mostra();
		cc.mostra();
	}

}
