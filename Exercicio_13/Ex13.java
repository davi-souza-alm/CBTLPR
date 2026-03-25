import java.util.Scanner;

public class Ex13{
	public static void main(String args[]){
		double Vf, Vi, aceleracao, tempo;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a velociade inicial(m/s): ");
		Vi = ler.nextDouble();

		System.out.println("Digite a aceleracao(m/s²): ");
		aceleracao = ler.nextDouble();

		System.out.println("Digite o tempo do percurso(s): ");
		tempo = ler.nextDouble();

		Vf = (Vi + (aceleracao * tempo)) * 3.6;
		
		System.out.printf("A velocidade final e igual a: %.2f Km/h%n ", Vf);
	}
}