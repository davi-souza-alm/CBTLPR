// Davi de Souza Almeida (CB 3038734) & Gustavo Cardoso Muniz (CB 3037045)
// 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
// dois metros e que um quilômetro possui mil metros, fazer um programa para converter milhas marítimas em quilômetros.

import java.util.Scanner;

public class Ex8 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);

		double milha, km, conversao;

		System.out.println("Digite a quantidade de milhas nauticas: ");
		milha = read.nextDouble();

		conversao = milha * 1852;

		km = conversao / 1000;

		System.out.println(milha + " milha(s) sao " + km + " quilometros");

	}
}
