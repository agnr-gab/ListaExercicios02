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
    int qtdAndares = 20;
    int capacidadeElevador = 8;
    int qtdPessoas = 0;

    public void Entra() {
        if (capacidadeElevador >= 8) {
            qtdPessoas++;
        }
    }

    public void Sai() {
        if (capacidadeElevador > 0) {
            qtdPessoas--;
        }
    }

    public void Sobe() {
        if (qtdAndares < 20) {

        }

    }

    public void Desce() {
        if (qtdAndares > 20) ;

    }
}
