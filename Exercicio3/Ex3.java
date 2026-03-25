// Davi de Souza Almeida (CB 3038734) & Gustavo Cardoso Muniz (CB 3037045)
// 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.

import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double diagonal, area;

		System.out.println("Apresente o valor da diagonal do quadrado: ");
		diagonal = ler.nextDouble();

		area = Math.round((diagonal * diagonal) / 2);

		System.out.print("O valor da area do quadrado e igual a: ");
		System.out.println(area);
	}
}
