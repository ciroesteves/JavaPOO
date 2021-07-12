package projeto10;

public class Conta {
	String nome;
	String cpf;
	int agencia;
	int conta;
	static double saldo;
	static double limite;

Conta(){
	nome = "Ronaldo Arruda";
	cpf = "123.456.789-00";
	agencia = 3572;
	conta = 100253;
	saldo = 500.0;
	limite = 1000.0;
	System.out.println("---- Dados e Saldos Iniciais -----");
	System.out.println("Nome: " + nome);
	System.out.println("CPF: " + cpf);
	System.out.println("Agência: " + agencia);
	System.out.println("Conta: " + conta);
	System.out.println("Saldo Conta inicial: " + saldo);
	System.out.println("Saldo Limite inicial: " + limite);
}

Conta(double valor){
	if(valor >= 0) {
		saldo += valor;
		if(saldo >= 0) {
			limite = 1000;
		}
	}else {
		if(Math.abs(valor) > limite) {
			System.out.println("Saque inválido!");
			return;
		} else {
			saldo += valor;
			if(saldo < 0) {
				limite +=  saldo;
			}
		}
	}
	System.out.println("---- Movimento da Conta -----");
	System.out.println("Valor Movimentado: " + valor);
	System.out.println("Saldo Conta Atualizado: " + saldo);
	System.out.println("Saldo do Limite Atualizado: " + limite);
}
}
