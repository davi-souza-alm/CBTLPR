// Davi de Souza Almeida (CB 3038734) & Gustavo Cardoso Muniz (CB 3037045)
// 14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
// “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão digitados.

import java.util.Scanner;

public class Ex14 {

    public static void main(String args[]) {
        double r, a, VolumeCubo, VolumeEsfera, VolumeLivre;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o raio da esfera inscrita: ");
        r = ler.nextDouble();

        System.out.println("Digite a aresta do cubo: ");
        a = ler.nextDouble();

        if ((2 * r) > a) {
            System.out.println("Dados invalidos!");
            System.out.println("O diametro da esfera nao pode ser maior que a aresta do cubo!");
        } else {
            VolumeEsfera = ((4.0 / 3.0) * Math.PI * Math.pow(r, 3));

            VolumeCubo = Math.pow(a, 3);

            VolumeLivre = VolumeCubo - VolumeEsfera;

            System.out.printf("O volume livre do ambiente e igual a %.2f", VolumeLivre);
        }
    }
}
