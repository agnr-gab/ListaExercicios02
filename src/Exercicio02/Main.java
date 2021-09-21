package Exercicio02;

public class Main {
    public static void main(String[] args) {
        ContaBancaria correntista1 = new ContaBancaria(12319, 3698, "Maria J");
        ContaBancaria correntista2 = new ContaBancaria(78897, 985, "Joana Maria Flor");
        ContaBancaria correntista3 = new ContaBancaria(96321,1200, "Paulo Alfredo Maques");
        correntista1.extrato();
        correntista1.deposito(600);
        System.out.println("---");
        correntista1.extrato();
        System.out.println("---");
        correntista1.saque(10);
        correntista1.extrato();
        System.out.println("_____________");
        correntista2.extrato();
        correntista1.deposito(5600);
        System.out.println("---");
        correntista2.extrato();
        System.out.println("---");
        correntista2.saque(160);
        correntista2.extrato();
        System.out.println("_____________");
        correntista3.extrato();
        correntista1.deposito(300);
        System.out.println("---");
        correntista3.extrato();
        System.out.println("---");
        correntista3.saque(1);
        correntista3.extrato();

    }
}
