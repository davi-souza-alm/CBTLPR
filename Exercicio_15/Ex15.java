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