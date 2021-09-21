package Exercicio03;

/*
3. Crie uma classe denominada Elevador para armazenar as informações de um
elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0),
total de andares no prédio (desconsiderando o térreo), capacidade do elevador e
quantas pessoas estão presentes nele. A classe deve também disponibilizar os
seguintes métodos:

- Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
- Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
- Sobe : para subir um andar (não deve subir se já estiver no último andar);
- Desce : para descer um andar (não deve descer se já estiver no térreo);
 */
public class Elevador {
    int terreo = 0;
    int qtdTotalAndares;
    int capacidadeMaxElevador;
    int qtdPessoasDentro;

    public Elevador(int terreo, int qtdTotalAndares, int capacidadeMaxElevador, int qtdPessoasDentro) {
        this.terreo = terreo;
        this.qtdTotalAndares = qtdTotalAndares;
        this.capacidadeMaxElevador = capacidadeMaxElevador;
        this.qtdPessoasDentro = qtdPessoasDentro;
    }

    public void Entra(int qtdViajantes) {
        int totalViajantes = qtdViajantes + qtdPessoasDentro;
        if (totalViajantes > capacidadeMaxElevador) {
            System.out.println("Capacidade máxima de pessoas já atingida!");
            System.out.println("Quantidade de pessoas além do permitido: " + (totalViajantes - capacidadeMaxElevador));
        } else {
            qtdPessoasDentro = totalViajantes;
        }
    }

    public void Sai(int qtdViajantes) {
        int totalViajantes = qtdPessoasDentro - qtdViajantes;
        if (totalViajantes < 0) {
            System.out.println("Não tem pessoas tem dentro do elevador para descer!");
        } else {
            qtdPessoasDentro = totalViajantes;
        }
    }

    public void Sobe() {


    }

    public void Desce() {

    }
}