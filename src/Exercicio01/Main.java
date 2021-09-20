package Exercicio01;

public class Main {

    public static void main(String[] args) {
	Carro carro1 = new Carro("Fusca", 2000, "Volkswagen", "Vermelha", 40000);
	Carro carro2 = new Carro("Opala", 1500, "Chevrolet", "Preto", 53235);

	carro1.exibeDadosCarro();
	carro1.descontadoDado(2569);
		System.out.println("_____________");
		carro1.exibeDadosCarro();

		// Testando os métodos criados
		System.out.println("_____________");
		carro1.pintura("Azul");

		// Testando os métodos criados
		System.out.println("_____________");
		carro2.exibeDadosCarro();
		carro2.descontadoDado(2000);


    }
}
