import javax.swing.SwingUtilities;

// Davi de Souza Almeida & Henrique Meira 

public class FormPessoaRadio {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new FormPessoa(FormPessoa.TipoSexo.RADIO_BUTTON).setVisible(true));
    }
}
