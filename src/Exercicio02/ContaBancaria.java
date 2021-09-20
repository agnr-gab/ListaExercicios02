package Exercicio02;

/*
2. Crie uma classe referente à uma conta bancária, que possui como atributos o seu
número, saldo e o nome do correntista. Crie também o método saque() que serve
para retirar o certo valor do saldo, o método depósito() que serve para adicionar um
valor ao saldo e o método extrato() que serve para mostrar na tela o nome do
correntista, o número da conta e o saldo. Crie um programa principal e demonstre a
utilização dos métodos implementados.
 */
public class ContaBancaria {
    double numeroConta;
    double saldoConta;
    String nomeCliente;

    public ContaBancaria(double numeroConta, double saldoConta, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.nomeCliente = nomeCliente;
    }

    public void saque(double valorSaque) {
        saldoConta = saldoConta - valorSaque;

    }

    public void deposito(double valorDeposito) {
        saldoConta = saldoConta + valorDeposito;
    }

    public void extrato() {
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Conta Corrente: " + numeroConta);
        System.out.println("Saldo disponível: " + saldoConta);

    }
}
