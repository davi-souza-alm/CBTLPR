// Davi de Souza Almeida (CB 3038734) & Gustavo Cardoso Muniz (CB 3037045)
// 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.

import java.util.Scanner;
public class Ex7 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double a, b, media;
		
		System.out.println("Digite o primeiro numero: ");
		a = ler.nextDouble();

		System.out.println("Digite o primeiro numero: ");
		b = ler.nextDouble();

		media = Math.sqrt(a * b);

		System.out.printf("a media geometrica e igual a :%.2f", media);
	}
}
