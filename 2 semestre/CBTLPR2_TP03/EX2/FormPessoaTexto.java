import javax.swing.SwingUtilities;

// Davi de Souza Almeida & Henrique Meira 

public class FormPessoaTexto {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new FormPessoa(FormPessoa.TipoSexo.CAMPO_TEXTO).setVisible(true));
    }
}
