import java.util.Scanner;

public class Ex18 {

    public static void main(String args[]) {
        double x1, x2, x3, x4, x5, totalPagar, totalRecebido, troco;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro produto: ");
        x1 = ler.nextDouble();

        System.out.println("Digite o valor do segundo produto: ");
        x2 = ler.nextDouble();

	System.out.println("Digite o valor do terceiro produto: ");
        x3 = ler.nextDouble();

	System.out.println("Digite o valor do quarto produto: ");
        x4 = ler.nextDouble();

	System.out.println("Digite o valor do quinto produto: ");
        x5 = ler.nextDouble();

        totalPagar = x1 + x2 + x3 + x4 + x5;

	System.out.println("Valor a receber: R$" + totalPagar);

	System.out.print("Valor recebido: R$");
	totalRecebido = ler.nextDouble();

	if (totalRecebido == totalPagar){
		System.out.println("Sem troco a ser devolvido");
        }
        else if (totalRecebido < totalPagar){
		System.out.println("Valor insuficiente");
        }
	else {
		troco = totalRecebido - totalPagar;		

		System.out.println("Troco a devolver: R$" + troco);
	}

    }
}