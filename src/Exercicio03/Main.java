package Exercicio03;

public class Main {
    public static void main(String[] args) {
        Elevador viagem1 = new Elevador(0, 12, 8, 0);
        System.out.println("___ELEVADOR___");
        System.out.println("Pessoas que já estavam dentro do elevador: ");
        System.out.println(viagem1.qtdPessoasDentro);
        System.out.println("Total de pessoas dentro do elevador:");
        viagem1.Entra(6);
        System.out.println(viagem1.qtdPessoasDentro);
        System.out.println("Total de pessoas dentro do elevador:");
        viagem1.Entra(1);
        System.out.println(viagem1.qtdPessoasDentro);
        System.out.println("Total de pessoas dentro do elevador:");
        viagem1.Sai(5);
        System.out.println(viagem1.qtdPessoasDentro);
        System.out.println("Total de pessoas dentro do elevador:");
        viagem1.Sai(2);
        System.out.println(viagem1.qtdPessoasDentro);
    }
}
