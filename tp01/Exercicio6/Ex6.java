// Davi de Souza Almeida (CB 3038734) & Gustavo Cardoso Muniz (CB 3037045)
// 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

import java.util.Scanner;

public class Ex6 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);

		double a, b, c, d, media;

		System.out.println("Digite o Primeiro valor: ");
		a = read.nextDouble();

		System.out.println("Digite o Segundo valor: ");
		b = read.nextDouble();

		System.out.println("Digite o Terceiro valor: ");
		c = read.nextDouble();

		System.out.println("Digite o Quarto valor: ");
		d = read.nextDouble();

		media = (a + b + c + d) / 4;

		System.out.println("A media aritmetica dos valores e igual a: " + media);

	}
}
