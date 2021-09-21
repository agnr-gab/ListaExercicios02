package Exercicio04;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cliente1 = new CartaoCredito(1500, 0, "Mari Maria");

        cliente1.imprimeFatura();
        cliente1.aumentaLimite(692);
        cliente1.imprimeFatura();
        cliente1.realizaCompra(699);
        cliente1.imprimeFatura();
        cliente1.diminuiLimite(500);
        cliente1.imprimeFatura();
    }
}
