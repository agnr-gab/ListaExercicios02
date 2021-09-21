package Exercicio03;

public class Main {
    public static void main(String[] args) {
        Elevador viagem1 = new Elevador(0, 12, 8, 0);

        System.out.println("___ELEVADOR___");
        viagem1.exibeDados();
        viagem1.Entra(6);
        viagem1.exibeDados();
        viagem1.Sai(5);
        viagem1.exibeDados();
        viagem1.Sobe(122);
        viagem1.exibeDados();
        viagem1.Desce(12);
        viagem1.exibeDados();
    }
}
