// Davi de Souza Almeida (CB 3038734) & Gustavo Cardoso Muniz (CB 3037045)
// 16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
// seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
// Lembre-se que uma função trigonométrica trabalha em radianos.

import java.util.Scanner;

public class Ex16 {

    public static void main(String args[]) {
        double angulo, radiano, seno, cosseno, tangente, secante;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do angulo em graus: ");
        angulo = ler.nextDouble();

        radiano = angulo * (Math.PI / 180);

        seno = Math.sin(radiano);
        cosseno = Math.cos(radiano);
        tangente = Math.tan(radiano);
        secante = 1.0 / cosseno;

        System.out.printf("Valor do seno: %.5f%n", seno);
        System.out.printf("Valor do cosseno: %.5f%n", cosseno);
        System.out.printf("Valor do tangente: %.5f%n", tangente);
        System.out.printf("Valor do secante: %.5f%n", secante);
    }
}
