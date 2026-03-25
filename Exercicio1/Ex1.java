import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int base, altura, area;

		System.out.println("Insira a altura do retangulo: ");
		altura = ler.nextInt();

		System.out.println("Insira a base do retangulo: ");
		base = ler.nextInt();

		area = base * altura;

		System.out.print("A area do retangulo e igual a: ");
		System.out.println(area);
	}
} 
    

