// Davi de Souza Almeida (CB3038734)

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora() {
    setHor();
    setMin();
    setSeg();
}


    public void setHor() {
        this.hora = lerEntradaValida("Digite a hora (0-23): ", 0, 23);
    }

    public void setMin() {
        this.min = lerEntradaValida("Digite os minutos (0-59): ", 0, 59);
    }

    public void setSeg() {
        this.seg = lerEntradaValida("Digite os segundos (0-59): ", 0, 59);
    }

    public void setHor(int h) {
    if(h >= 0 && h <= 23)
        hora = h;
}

public void setMin(int m) {
    if(m >= 0 && m <= 59)
        min = m;
}

public void setSeg(int s) {
    if(s >= 0 && s <= 59)
        seg = s;
}


    public int getHor() {
        return this.hora;
    }

    public int getMin() {
        return this.min;
    }

    public int getSeg() {
        return this.seg;
    }

    public String getHoral() {
        return String.format("%02d:%02d:%02d", this.hora, this.min, this.seg);
    }

    public String getHora2() {
        String periodo = (this.hora < 12) ? "AM" : "PM";
        int horaFormato12 = (this.hora == 0 || this.hora == 12) ? 12 : this.hora % 12;
        
        return String.format("%02d:%02d:%02d (%s)", horaFormato12, this.min, this.seg, periodo);
    }

    public int getSegundos() {
        return (this.hora * 3600) + (this.min * 60) + this.seg;
    }


    private int lerEntradaValida(String mensagem, int minVal, int maxVal) {
        Scanner scanner = new Scanner(System.in);
        int valor = -1;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print(mensagem);
                valor = scanner.nextInt();
                
                if (valor >= minVal && valor <= maxVal) {
                    valido = true;
                } else {
                    System.out.println("Valor fora do intervalo permitido. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida! Por favor, digite um numero inteiro.");
                scanner.nextLine(); 
            }
        }
        return valor;
    }
}