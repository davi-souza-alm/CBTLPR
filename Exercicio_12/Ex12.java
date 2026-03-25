import java.util.Scanner;

public class Ex12{
	public static void main(String args[]){
		double altura, raio, volume;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a altura do cone");
		altura = ler.nextDouble();

		System.out.println("Digite o raio da base do cone");
		raio = ler.nextDouble();

		volume = (1.0 / 3.0) * Math.PI * (raio * raio) * altura;
		
		System.out.printf("O volume do cone e igual a: %.2f ", volume);
	}
}