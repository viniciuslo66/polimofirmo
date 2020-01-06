package Aplicacao;

import Entidade.Conta;
import Entidade.ContaEmpresario;
import Entidade.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1001, "Vinicius", 0.0);
		ContaEmpresario contaEmp = new ContaEmpresario(1001, "Magnus", 0.0, 500.00);
		
		//UPCASTING
		
		Conta conta1 = contaEmp;
		Conta conta2 = new ContaEmpresario(1003, "Oliveira", 0.0, 600.00);
		Conta conta3 = new ContaPoupanca(1004, "Lourenco", 0.0, 0.01);
		
		//DOWNCASTING
		
		ContaEmpresario contaEmp1 = (ContaEmpresario)conta2;
		contaEmp1.emprestimo(100.00);
		
		//ContaEmpresario contaEmp2 = (ContaEmpresario)conta3;
		if(conta3 instanceof ContaEmpresario) {
			ContaEmpresario contaEmp2 = (ContaEmpresario)conta3;
			contaEmp2.emprestimo(100.00);
			System.out.println("Emprestimo!");
		}
		
		if(conta3 instanceof ContaPoupanca) {
			ContaPoupanca contaPop = (ContaPoupanca)conta3;
			contaPop.atualizacaoSaldo(100.00);
			System.out.println("Atualizado!");
		}
		
	}

}
