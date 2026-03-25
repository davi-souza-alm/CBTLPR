import java.util.Scanner;

public class Ex11{
	public static void main(String args[]){
		double diametro, raio, area;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o diametro do circulo");
		diametro = ler.nextDouble();
		
		raio = diametro / 2;

		area = Math.PI * (raio * raio);
		
		System.out.printf("A area do circulo e igual a: %.2f ", area);
	}
}