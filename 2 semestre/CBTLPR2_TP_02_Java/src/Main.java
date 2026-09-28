import javax.swing.SwingUtilities;

// Davi de Souza Almeida & Guilherme Francisco

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CadastroAlunos tela = new CadastroAlunos();
            tela.setVisible(true);
        });
    }
}
