// Davi de Souza Almeida (CB 3038734) & Gustavo Cardoso Muniz (CB 3037045)
//13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
//valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso (em s) que serão digitados.

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
