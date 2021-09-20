package Exercicio01;

// 1. Crie uma classe que represente um carro, que tenha como características o nome, o peso, a fabricante, a cor e o valor do carro. Crie também o método darDesconto() que servirá para diminuir o preço do carro e o método pintar(), que será responsável por mudar a cor do carro. Crie um carro no seu programa principal, utilize os métodos criados e mostre na tela o preço e a cor do carro antes e depois da utilização dos métodos.

public class Carro {
    String nome;
    double peso;
    String fabricante;
    String cor;
    double valor;

    public Carro(String nome, double peso, String fabricante, String cor, double valor) {
       this.nome = nome;
       this.peso = peso;
       this.fabricante = fabricante;
       this.cor = cor;
       this.valor = valor;
    }

    public void descontadoDado (double valorDesconto) {
        valor = valor - valorDesconto;
    }
    public void pintura (String corEscolhida) {
        cor = corEscolhida;
    }
    public void exibeDadosCarro(){
        System.out.println("Nome: "+nome);
        System.out.println("Peso: "+peso+" kg");
        System.out.println("Fabricante: "+fabricante);
        System.out.println("Cor: "+cor);
        System.out.println("Valor: " +valor);
    }
}


