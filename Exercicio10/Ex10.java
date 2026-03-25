import java.util.Scanner;

public class Ex10 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);

		double celsius, fahrenheit;

		System.out.println("Digite a temperatura em celsius: ");
		celsius = read.nextDouble();

		fahrenheit = ((celsius * (9.00/5.00)) + 32);

		System.out.println(celsius + " Celsius sao " + fahrenheit + " Fahrenheit");

	}
}