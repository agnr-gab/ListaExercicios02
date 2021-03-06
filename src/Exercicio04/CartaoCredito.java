package Exercicio04;

/*
4. Crie uma classe que represente um cartão de crédito, que deve ter como
atributos o seu limite, o saldo da fatura e nome do cliente. Crie também os métodos
aumentaLimite(), diminuiLimite(), realizaCompra() que não deve permitir uma
compra caso o limite tenha sido atingido e o imprimeFatura() que imprime na tela o
valor da fatura.
 */
public class CartaoCredito {
    double limiteCredito;
    double saldoFatura;
    String nomeCliente;

    public CartaoCredito(double limiteCredito, double saldoFatura, String nomeCliente) {
        this.limiteCredito = limiteCredito;
        this.saldoFatura = saldoFatura;
        this.nomeCliente = nomeCliente;
    }

    public void aumentaLimite(double maisLimite) {
        limiteCredito = limiteCredito + maisLimite;
    }

    public void diminuiLimite(double menosLimite) {
        limiteCredito = limiteCredito - menosLimite;
    }

    public void realizaCompra(double compra) {
        if (limiteCredito >= compra) {
            saldoFatura = saldoFatura + compra;
            limiteCredito = limiteCredito - compra;
        } else {
            System.out.println("Não possui limite de crédito para realização de compras!");
        }
    }

    public void imprimeFatura() {
        System.out.println("____Sistema Cartão de Crédito ZuCard____");
        System.out.println("Cliente " + nomeCliente + " seja bem-vinde!");
        System.out.println("Valor da fatura: R$" + saldoFatura);
        System.out.println("Limite de Crédito: R$ " + limiteCredito);


    }

}
