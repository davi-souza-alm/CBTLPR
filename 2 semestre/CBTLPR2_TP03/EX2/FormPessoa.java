import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

// Davi de Souza Almeida & Henrique Meira 

public class FormPessoa extends JFrame {
    public enum TipoSexo { CAMPO_TEXTO, COMBO_BOX, RADIO_BUTTON }

    private final TipoSexo tipoSexo;
    private final JTextField txtNumero = new JTextField(18);
    private final JTextField txtNome = new JTextField(18);
    private final JTextField txtIdade = new JTextField(18);
    private final JComponent componenteSexo;

    private JTextField txtSexo;
    private JComboBox<String> comboSexo;
    private JRadioButton radioMasculino;
    private JRadioButton radioFeminino;
    private ButtonGroup grupoSexo;
    
    private Pessoa UmaPessoa;

    public FormPessoa(TipoSexo tipoSexo) {
        super(titulo(tipoSexo));
        this.tipoSexo = tipoSexo;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        if (tipoSexo == TipoSexo.CAMPO_TEXTO) {
            txtSexo = new JTextField(18);
            configurarCampoSexo();
            componenteSexo = txtSexo;
        } else if (tipoSexo == TipoSexo.COMBO_BOX) {
            comboSexo = new JComboBox<>(new String[] { "M", "F" });
            comboSexo.setSelectedIndex(-1);
            componenteSexo = comboSexo;
        } else {
            JPanel painelRadios = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
            radioMasculino = new JRadioButton("M");
            radioFeminino = new JRadioButton("F");
            grupoSexo = new ButtonGroup();
            grupoSexo.add(radioMasculino);
            grupoSexo.add(radioFeminino);
            painelRadios.add(radioMasculino);
            painelRadios.add(radioFeminino);
            componenteSexo = painelRadios;
        }

        montarInterface();
    }

    private static String titulo(TipoSexo tipo) {
        if (tipo == TipoSexo.CAMPO_TEXTO) return "FormPessoa - Versao 01 (TextField)";
        if (tipo == TipoSexo.COMBO_BOX) return "FormPessoa - Versao 02 (JComboBox)";
        return "FormPessoa - Versao 03 (JRadioButton)";
    }

    private void montarInterface() {
        txtNumero.setEditable(false);
        txtNumero.setFocusable(false);

        JPanel painelDados = new JPanel(new GridLayout(4, 2, 6, 7));
        painelDados.setBorder(BorderFactory.createEmptyBorder(12, 12, 8, 12));
        painelDados.add(new JLabel("Numero:"));
        painelDados.add(txtNumero);
        painelDados.add(new JLabel("Nome:"));
        painelDados.add(txtNome);
        painelDados.add(new JLabel("Sexo:"));
        painelDados.add(componenteSexo);
        painelDados.add(new JLabel("Idade:"));
        painelDados.add(txtIdade);

        JButton btnOk = new JButton("OK");
        JButton btnLimpar = new JButton("Limpar");
        JButton btnMostrar = new JButton("Mostrar");
        JButton btnSair = new JButton("Sair");

        btnOk.addActionListener(e -> salvarPessoa());
        btnLimpar.addActionListener(e -> limparCampos());
        btnMostrar.addActionListener(e -> mostrarPessoa());
        btnSair.addActionListener(e -> dispose());

        JPanel painelBotoes = new JPanel(new GridLayout(1, 4, 4, 4));
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(0, 12, 12, 12));
        painelBotoes.add(btnOk);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnMostrar);
        painelBotoes.add(btnSair);

        JPanel principal = new JPanel(new BorderLayout(4, 4));
        principal.add(painelDados, BorderLayout.CENTER);
        principal.add(painelBotoes, BorderLayout.SOUTH);
        setContentPane(principal);
        getRootPane().setDefaultButton(btnOk);
        pack();
        setSize(480, 235);
        setLocationRelativeTo(null);
    }

    private void configurarCampoSexo() {
        AbstractDocument documento = (AbstractDocument) txtSexo.getDocument();
        documento.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String texto,
                                     AttributeSet attr) throws BadLocationException {
                replace(fb, offset, 0, texto, attr);
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String texto,
                                AttributeSet attrs) throws BadLocationException {
                String atual = fb.getDocument().getText(0, fb.getDocument().getLength());
                String digitado = texto == null ? "" : texto.toUpperCase();
                String novo = atual.substring(0, offset) + digitado
                    + atual.substring(offset + length);
                if (novo.isEmpty() || "M".equals(novo) || "F".equals(novo)) {
                    super.replace(fb, offset, length, digitado, attrs);
                }
            }
        });
    }

    private char lerSexoSelecionado() {
        if (tipoSexo == TipoSexo.CAMPO_TEXTO) {
            String texto = txtSexo.getText().trim().toUpperCase();
            return texto.isEmpty() ? '\0' : texto.charAt(0);
        }
        if (tipoSexo == TipoSexo.COMBO_BOX) {
            Object selecionado = comboSexo.getSelectedItem();
            return selecionado == null ? '\0' : selecionado.toString().charAt(0);
        }
        if (radioMasculino.isSelected()) return 'M';
        if (radioFeminino.isSelected()) return 'F';
        return '\0';
    }

    private void selecionarSexo(char sexo) {
        char normalizado = Character.toUpperCase(sexo);
        if (tipoSexo == TipoSexo.CAMPO_TEXTO) {
            txtSexo.setText(String.valueOf(normalizado));
        } else if (tipoSexo == TipoSexo.COMBO_BOX) {
            comboSexo.setSelectedItem(String.valueOf(normalizado));
        } else if (normalizado == 'M') {
            radioMasculino.setSelected(true);
        } else if (normalizado == 'F') {
            radioFeminino.setSelected(true);
        }
    }

    private void limparSexo() {
        if (tipoSexo == TipoSexo.CAMPO_TEXTO) {
            txtSexo.setText("");
        } else if (tipoSexo == TipoSexo.COMBO_BOX) {
            comboSexo.setSelectedIndex(-1);
        } else {
            grupoSexo.clearSelection();
        }
    }

    private void salvarPessoa() {
        try {
            String nome = txtNome.getText().trim();
            String textoIdade = txtIdade.getText().trim();
            char sexo = lerSexoSelecionado();

            if (nome.isEmpty() || sexo == '\0' || textoIdade.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Preencha todos os campos obrigatorios: Nome, Sexo e Idade.",
                    "Validacao", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int idade = Integer.parseInt(textoIdade);
            if (idade < 0) {
                JOptionPane.showMessageDialog(this, "A idade nao pode ser negativa.",
                    "Validacao", JOptionPane.WARNING_MESSAGE);
                return;
            }

            UmaPessoa = new Pessoa(nome, sexo, idade);
            UmaPessoa.setKp();
            JOptionPane.showMessageDialog(this, "Dados registrados com sucesso.",
                "OK", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(this, "Digite uma idade inteira valida.",
                "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
        }
    }

    private void mostrarPessoa() {
        if (UmaPessoa == null) {
            JOptionPane.showMessageDialog(this, "Nenhuma pessoa foi registrada ainda.",
                "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        txtNumero.setText(String.valueOf(UmaPessoa.getKp()));
        txtNome.setText(UmaPessoa.getNome());
        selecionarSexo(UmaPessoa.getSexo());
        txtIdade.setText(String.valueOf(UmaPessoa.getIdade()));
    }

    private void limparCampos() {
        txtNumero.setText("");
        txtNome.setText("");
        limparSexo();
        txtIdade.setText("");
        txtNome.requestFocusInWindow();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FormPessoa(TipoSexo.CAMPO_TEXTO).setVisible(true));
    }
}
