package taxas;

import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Taxa taxa = new Taxa();
		
		
		System.out.println("digite o número de crianças nascidas");
		float criancasNascidas = teclado.nextFloat();
		
		System.out.println("digite o número de óbitos");
		float obitos = teclado.nextFloat();
		
		System.out.println("digite o número de habitantes");
		float habitantes = teclado.nextFloat();
		
		System.out.println("escolha a operação");
		System.out.println("1 natalidade");
		System.out.println("2 mortalidade");
		
		byte opcao = teclado.nextByte();
		teclado.close();
		
		switch (opcao) {
		case 1:
			System.out.printf("A natalidade é %.2f", taxa.natalidade(criancasNascidas, habitantes));
			break;
		case 2:
			System.out.printf("A mortalidade é %.2f", taxa.mortalidade(obitos, habitantes));
			break;
		}
	}
}
