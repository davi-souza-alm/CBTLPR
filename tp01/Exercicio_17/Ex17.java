// Davi de Souza Almeida (CB 3038734) & Gustavo Cardoso Muniz (CB 3037045)
// 17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
// cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.

import java.util.Scanner;

public class Ex17 {

    public static void main(String args[]) {
        double x, y, resultado;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da base (X): ");
        x = ler.nextDouble();

        System.out.println("Digite o valor do expoente (Y): ");
        y = ler.nextDouble();

        if (x <= 0) {
            System.out.println("Erro: A base X deve ser maior que zero para usar Exp e Ln.");
        } else {
            resultado = Math.exp(y * Math.log(x));

            System.out.printf("%.2f elevado a %.2f e igual a: %.2f%n", x, y, resultado);
        }

        ler.close();
    }
}
