// Davi de Souza Almeida (CB3038734)
// Reescreva as propriedades e métodos da classe Data, deixando-os de acordo com
// o padrão UML (Getter e Setter).

import java.util.Scanner;
import java.time.LocalDate;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    private static final Scanner teclado = new Scanner(System.in);

    public Data() {
        entraAno();
        entraMes();
        entraDia();
    }

    public Data(int d, int m, int a) {
        if (!dataValida(d, m, a)) {
            throw new IllegalArgumentException("Data invalida.");
        }

        dia = d;
        mes = m;
        ano = a;
    }

    // getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // setters
    public void setDia(int d) {
        if (dataValida(d, mes, ano)) {
            dia = d;
        }
    }

    public void setMes(int m) {
        if (dataValida(dia, m, ano)) {
            mes = m;
        }
    }

    public void setAno(int a) {
        if (dataValida(dia, mes, a)) {
            ano = a;
        }
    }


    public void entraDia() {
        int d;

        do {
            try {
                System.out.print("Digite o dia: ");
                d = Integer.parseInt(teclado.nextLine());

                if (dataValida(d, mes, ano)) {
                    dia = d;
                    break;
                }

                System.out.println("Dia invalido!");
            } catch (Exception e) {
                System.out.println("Digite um numero valido.");
            }
        } while (true);
    }

    public void entraMes() {
        int m;

        do {
            try {
                System.out.print("Digite o mes: ");
                m = Integer.parseInt(teclado.nextLine());

                if (m >= 1 && m <= 12) {
                    mes = m;
                    break;
                }

                System.out.println("Mes invalido!");
            } catch (Exception e) {
                System.out.println("Digite um numero valido.");
            }
        } while (true);
    }

    public void entraAno() {
        int a;

        do {
            try {
                System.out.print("Digite o ano: ");
                a = Integer.parseInt(teclado.nextLine());

                if (a > 0) {
                    ano = a;
                    break;
                }

                System.out.println("Ano invalido!");
            } catch (Exception e) {
                System.out.println("Digite um numero valido.");
            }
        } while (true);
    }

    public String mostra1() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String mostra2() {

        String[] meses = {
            "Janeiro", "Fevereiro", "Março",
            "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro",
            "Outubro", "Novembro", "Dezembro"
        };

        return dia + "/" + meses[mes - 1] + "/" + ano;
    }

    public boolean bissexto() {
        return (ano % 400 == 0)
                || (ano % 4 == 0 && ano % 100 != 0);
    }

    public int diasTranscorridos() {

        int[] diasMes = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (bissexto())
            diasMes[1] = 29;

        int total = dia;

        for (int i = 0; i < mes - 1; i++) {
            total += diasMes[i];
        }

        return total;
    }

    public void apresentaDataAtual() {

        LocalDate hoje = LocalDate.now();

        System.out.println(
            hoje.getDayOfMonth() + "/"
            + hoje.getMonthValue() + "/"
            + hoje.getYear()
        );
    }

    private boolean dataValida(int d, int m, int a) {

        if (a <= 0)
            return false;

        if (m < 1 || m > 12)
            return false;

        int[] diasMes = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0))
            diasMes[1] = 29;

        return d >= 1 && d <= diasMes[m - 1];
    }
}