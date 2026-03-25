import java.util.Scanner;

public class Ex8 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);

		double milha, km, conversao;

		System.out.println("Digite a quantidade de milhas nauticas: ");
		milha = read.nextDouble();

		conversao = milha * 1852;

		km = conversao / 1000;

		System.out.println(milha + " milha(s) sao " + km + " quilometros");

	}
}