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