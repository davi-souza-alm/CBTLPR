// Davi de Souza Almeida (CB 3038734) & Gustavo Cardoso Muniz (CB 3037045)
// 10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
// exibir sua temperatura equivalente em Fahrenheit.

import java.util.Scanner;

public class Ex10 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);

		double celsius, fahrenheit;

		System.out.println("Digite a temperatura em celsius: ");
		celsius = read.nextDouble();

		fahrenheit = ((celsius * (9.00/5.00)) + 32);

		System.out.println(celsius + " Celsius sao " + fahrenheit + " Fahrenheit");

	}
}
