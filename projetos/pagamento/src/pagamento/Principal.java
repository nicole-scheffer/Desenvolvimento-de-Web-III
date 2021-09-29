package pagamento;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Forma forma = new Forma();

		System.out.println("digite o valor da compra");
		float valor = teclado.nextFloat();

		System.out.println("qual a forma de pagamento?");
		System.out.println("1 à vista");
		System.out.println("2 à prazo (30 dias)");
		System.out.println("3 à prazo parcelado");

		byte opcao = teclado.nextByte();
		teclado.close();
		switch (opcao) {
		case 1:
			System.out.printf("A vista tem desconto de 10 por cento %.2f", forma.aVista(valor));
			break;
		case 2:
			System.out.printf("A prazo em 30 dias tem juros de 3 por cento %.2f", forma.aPrazo30(valor));
			break;
		case 3:
			System.out.printf("A prazo parcelado tem juros de 1.5 por ccento %.2f", forma.aPrazoParcelado(valor));
			break;
		}
	}

}
