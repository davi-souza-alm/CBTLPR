import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int aresta, area;

		System.out.println("Digite a aresta do quadrado:");

		aresta = ler.nextInt();

		area = aresta * aresta;

		System.out.print("A area do quadrado e igual a: ");
		System.out.println(area);

	}
}