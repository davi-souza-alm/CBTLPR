// Davi de Souza Almeida (CB3038734)
// Crie a classe ConsultaAgendada conforme especificado abaixo

import java.util.Scanner;

public class ConsultaAgendada {

    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;

    private static int quantidade = 0;

    Scanner teclado = new Scanner(System.in);

    public ConsultaAgendada() {

        System.out.println("\n=== Cadastro da Consulta ===");

        data = new Data();
        hora = new Hora();

        System.out.print("Nome do paciente: ");
        nomePaciente = teclado.nextLine();

        System.out.print("Nome do medico: ");
        nomeMedico = teclado.nextLine();

        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s,
                            int d, int m, int a,
                            String p, String med) {

        data = new Data(d, m, a);

        hora = new Hora();
        hora.setHor(h);
        hora.setMin(mi);
        hora.setSeg(s);

        nomePaciente = p;
        nomeMedico = med;

        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h,
                            String p, String med) {

        data = d;
        hora = h;
        nomePaciente = p;
        nomeMedico = med;

        quantidade++;
    }

    public void setData(int d, int m, int a) {
        data = new Data(d, m, a);
    }

    public void setData() {
        data = new Data();
    }

    public void setHora(int h, int mi, int s) {
        hora.setHor(h);
        hora.setMin(mi);
        hora.setSeg(s);
    }

    public void setHora() {
        hora = new Hora();
    }

    public void setNomePaciente(String p) {
        nomePaciente = p;
    }

    public void setNomePaciente() {
        System.out.print("Novo paciente: ");
        nomePaciente = teclado.nextLine();
    }

    public void setNomeMedico(String m) {
        nomeMedico = m;
    }

    public void setNomeMedico() {
        System.out.print("Novo medico: ");
        nomeMedico = teclado.nextLine();
    }

    public static int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return data.mostra1();
    }

    public String getHora() {
        return hora.getHoral();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
}