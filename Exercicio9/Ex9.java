import java.util.Scanner;

public class Ex9 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);

		double resistencia, corrente, tensao;

		System.out.println("Digite a resistencia do circuito: ");
		resistencia = read.nextDouble();

		System.out.println("Digite a corrente do circuito: ");
		corrente = read.nextDouble();

		tensao = resistencia * corrente;

		System.out.println("A tensao do circuito e igual a: " + tensao + " V");

	}
}