import javax.swing.SwingUtilities;

// Davi de Souza Almeida & Henrique Meira 

public class FormPessoaCombo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new FormPessoa(FormPessoa.TipoSexo.COMBO_BOX).setVisible(true));
    }
}
