package taxas;

import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Taxa taxa = new Taxa();
		
		
		System.out.println("digite o n�mero de crian�as nascidas");
		float criancasNascidas = teclado.nextFloat();
		
		System.out.println("digite o n�mero de �bitos");
		float obitos = teclado.nextFloat();
		
		System.out.println("digite o n�mero de habitantes");
		float habitantes = teclado.nextFloat();
		
		System.out.println("escolha a opera��o");
		System.out.println("1 natalidade");
		System.out.println("2 mortalidade");
		
		byte opcao = teclado.nextByte();
		teclado.close();
		
		switch (opcao) {
		case 1:
			System.out.printf("A natalidade � %.2f", taxa.natalidade(criancasNascidas, habitantes));
			break;
		case 2:
			System.out.printf("A mortalidade � %.2f", taxa.mortalidade(obitos, habitantes));
			break;
		}
	}
}
