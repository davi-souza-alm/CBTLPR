// Davi de Souza Almeida (cb3038734)
// Para testar a classe criada siga os passos abaixo respeitando a ordem em que eles
// serão solicitados:

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {

        StringBuilder relatorio = new StringBuilder();

        ConsultaAgendada p1 =
                new ConsultaAgendada(
                        10,30,15,
                        20,6,2026,
                        "Davi",
                        "Dr. Wellington"
                );

        System.out.println("=== CONSULTA P1 ===");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Medico: " + p1.getNomeMedico());

        relatorio.append("=== CONSULTA P1 ===\n");
        relatorio.append("Data: ").append(p1.getData()).append("\n");
        relatorio.append("Hora: ").append(p1.getHora()).append("\n");
        relatorio.append("Paciente: ").append(p1.getNomePaciente()).append("\n");
        relatorio.append("Medico: ").append(p1.getNomeMedico()).append("\n\n");

        // p2
        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println("\n=== CONSULTA P2 ===");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Paciente: " + p2.getNomePaciente());
        System.out.println("Medico: " + p2.getNomeMedico());

        relatorio.append("=== CONSULTA P2 ===\n");
        relatorio.append("Data: ").append(p2.getData()).append("\n");
        relatorio.append("Hora: ").append(p2.getHora()).append("\n");
        relatorio.append("Paciente: ").append(p2.getNomePaciente()).append("\n");
        relatorio.append("Medico: ").append(p2.getNomeMedico()).append("\n\n");

        System.out.println("\n=== ALTERANDO P1 ===");

        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        System.out.println("\n=== NOVO P1 ===");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Medico: " + p1.getNomeMedico());

        relatorio.append("=== NOVO P1 ===\n");
        relatorio.append("Data: ").append(p1.getData()).append("\n");
        relatorio.append("Hora: ").append(p1.getHora()).append("\n");
        relatorio.append("Paciente: ").append(p1.getNomePaciente()).append("\n");
        relatorio.append("Medico: ").append(p1.getNomeMedico()).append("\n\n");

        System.out.println("\nQuantidade final de consultas: "
                + ConsultaAgendada.getAmostra());

        relatorio.append("Quantidade final de consultas: ")
                 .append(ConsultaAgendada.getAmostra());


// Escreva todo o resultado obtido no exercício 3 em um arquivo texto.
        try {

            FileWriter arquivo =
                    new FileWriter("consultas.txt");

            PrintWriter gravar =
                    new PrintWriter(arquivo);

            gravar.print(relatorio.toString());

            gravar.close();

            System.out.println(
                "\nArquivo consultas.txt gerado com sucesso!"
            );

        } catch(IOException e) {

            System.out.println(
                "Erro ao gravar arquivo."
            );
        }
    }
}