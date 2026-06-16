// Davi de Souza Almeida (CB 3038734) & Gustavo Cardoso Muniz (CB 3037045)
// 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

import java.util.Scanner;
public class Ex4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int base, altura, area;
		
		System.out.println("Digite a base do triangulo: ");
		base = ler.nextInt();

		System.out.println("Digite a altura do triangulo: ");
		altura = ler.nextInt();

		area = (base * altura) / 2 ;

		System.out.print("A area do triangulo e igual a :");
		System.out.println(area);
	}
}
