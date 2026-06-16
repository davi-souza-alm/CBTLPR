// Davi de Souza Almeida (CB 3038734) & Gustavo Cardoso Muniz (CB 3037045)
//15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
//dólares. Calcular e exibir o valor correspondente em Reais (R$).

import java.util.Scanner;

public class Ex15{
	public static void main(String args[]){
		double dolar, cotacao, real;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a cotacao do dolar: ");
		cotacao = ler.nextDouble();

		System.out.println("Digite a quantidade de dolares: ");
		dolar = ler.nextDouble();

		real = cotacao * dolar;
		
		System.out.printf("$%s Dolares sao R$%.2f%n", dolar, real);
	}
}
