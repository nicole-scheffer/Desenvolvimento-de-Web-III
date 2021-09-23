package triangulos;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o valor 1");
		float num1 = teclado.nextFloat();
		System.out.println("digite o valor 2");
		float num2 = teclado.nextFloat();
		System.out.println("digite o valor 3");
		float num3 = teclado.nextFloat();
		teclado.close();
		System.out.println(verificar(num1, num2, num3));
	}

	private static String verificar(float num1, float num2, float num3) {
		if (num1 == num2 && num1 == num3 && num2 == num3) {
			return "é um triangulo equilatero,ou seja,todos os lados iguais";
		} else if (num1 != num2 && num1 != num3 && num2 != num3) {
			return "é um triangulo escaleno,ou seja,todos os lados diferentes";
		} else {
			return "é um triangulo isoceles,ou seja,dois lados iguais";
		}
	}
}