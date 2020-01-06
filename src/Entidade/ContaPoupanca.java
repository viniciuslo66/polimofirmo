package Entidade;

public final class ContaPoupanca extends Conta { //"Final" evita que a classe seja herdada

	private Double taxaDeJuros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaDeJuros) {
		super(numero, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void atualizacaoSaldo (double montante) {
		saldo += saldo * taxaDeJuros;
	}
	
	@Override  		
	public final void saque(double montante) {	//Sobreposição de função //Final evita que o metodo seja sobreposto
		saldo -= montante;
	}
}
