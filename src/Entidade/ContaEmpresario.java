package Entidade;

public class ContaEmpresario extends Conta {
	private Double limiteEmprestimo;

	public ContaEmpresario() {
		super();
	}

	public ContaEmpresario(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
	}

	public void emprestimo(double montante) {
		if (montante <= limiteEmprestimo) {
			deposito(montante);
		}
	}
	
	@Override  		
	public void saque(double montante) {	//Sobreposição de função
		super.saque(montante);
		saldo -= 2.0;
	}
}
