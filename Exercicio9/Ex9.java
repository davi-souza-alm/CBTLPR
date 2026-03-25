// Davi de Souza Almeida (CB 3038734) & Gustavo Cardoso Muniz (CB 3037045)
// 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
// valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.

import java.util.Scanner;

public class Ex9 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);

		double resistencia, corrente, tensao;

		System.out.println("Digite a resistencia do circuito: ");
		resistencia = read.nextDouble();

		System.out.println("Digite a corrente do circuito: ");
		corrente = read.nextDouble();

		tensao = resistencia * corrente;

		System.out.println("A tensao do circuito e igual a: " + tensao + " V");

	}
}
