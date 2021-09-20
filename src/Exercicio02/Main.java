package Exercicio02;

public class Main {
    public static void main(String[] args) {
        ContaBancaria correntista1 = new ContaBancaria(12319, 3698, "Maria J");
        ContaBancaria correntista2 = new ContaBancaria(78897, 985, "Joana Maria Flor");
        ContaBancaria correntista3 = new ContaBancaria(96321,100, "Paulo Alfredo Maques");
        correntista1.extrato();
        System.out.println("_____________");
        correntista2.extrato();
        System.out.println("_____________");
        correntista3.extrato();
    }
}
