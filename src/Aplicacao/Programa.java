package Aplicacao;

import Entidade.Conta;
import Entidade.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {

		Conta x = new Conta(1001, "Vinicius", 1000.00);
		Conta y = new ContaPoupanca(1002, "Magnus", 1000.00, 0.01);

		x.saque(50.0);
		y.saque(50.0);

		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());
	}

}
