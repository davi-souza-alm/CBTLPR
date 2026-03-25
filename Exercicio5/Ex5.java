import java.util.Scanner;
public class Ex5 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double diametro, raio, volume;
		
		System.out.println("Digite o diametro da esfera: ");
		diametro = ler.nextDouble();

		raio = diametro / 2;

		volume = (1.3333) * 3.1415 * (raio * raio * raio);

		System.out.printf("O volume da esfera e aproximadamente: %.2f", volume);
	}
}