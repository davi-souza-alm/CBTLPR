import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.math.BigDecimal;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 * Exercicio 1 - Calculadora com as quatro operacoes basicas.
 * Compile com: javac -encoding UTF-8 CalculadoraSwing.java
 * Execute com: java CalculadoraSwing
 */
public class CalculadoraSwing extends JFrame {
    private final JTextField visor = new JTextField("0");
    private double memoria = 0.0;
    private String operadorPendente = null;
    private boolean iniciarNovoNumero = true;

    public CalculadoraSwing() {
        super("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        visor.setHorizontalAlignment(SwingConstants.RIGHT);
        visor.setEditable(false);
        visor.setFont(new Font("SansSerif", Font.PLAIN, 24));
        visor.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        JPanel painelBotoes = new JPanel(new GridLayout(5, 4, 3, 3));
        String[] botoes = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "", "", ""
        };

        for (String texto : botoes) {
            if (texto.isEmpty()) {
                painelBotoes.add(new JLabel(""));
            } else {
                JButton botao = new JButton(texto);
                botao.setFont(new Font("SansSerif", Font.BOLD, 18));
                botao.addActionListener(event -> processarBotao(texto));
                painelBotoes.add(botao);
            }
        }

        JPanel principal = new JPanel(new BorderLayout(5, 5));
        principal.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        principal.add(visor, BorderLayout.NORTH);
        principal.add(painelBotoes, BorderLayout.CENTER);
        setContentPane(principal);
        setSize(270, 330);
        setLocationRelativeTo(null);
    }

    private void processarBotao(String texto) {
        if (texto.length() == 1 && Character.isDigit(texto.charAt(0))) {
            digitarNumero(texto);
        } else if (".".equals(texto)) {
            digitarPonto();
        } else if ("C".equals(texto)) {
            limpar();
        } else if ("=".equals(texto)) {
            calcularResultado();
        } else {
            selecionarOperador(texto);
        }
    }

    private void digitarNumero(String digito) {
        if (iniciarNovoNumero || "0".equals(visor.getText())) {
            visor.setText(digito);
            iniciarNovoNumero = false;
        } else {
            visor.setText(visor.getText() + digito);
        }
    }

    private void digitarPonto() {
        if (iniciarNovoNumero) {
            visor.setText("0.");
            iniciarNovoNumero = false;
        } else if (!visor.getText().contains(".")) {
            visor.setText(visor.getText() + ".");
        }
    }

    private void selecionarOperador(String operador) {
        try {
            double atual = lerValorVisor();
            if (operadorPendente != null && !iniciarNovoNumero) {
                atual = operar(memoria, atual, operadorPendente);
                mostrarValor(atual);
            }
            memoria = atual;
            operadorPendente = operador;
        } catch (NumberFormatException | ArithmeticException erro) {
            mostrarErro(erro.getMessage());
        } finally {
            iniciarNovoNumero = true;
        }
    }

    private void calcularResultado() {
        try {
            if (operadorPendente == null) {
                return;
            }
            double segundoValor = lerValorVisor();
            double resultado = operar(memoria, segundoValor, operadorPendente);
            mostrarValor(resultado);
            memoria = resultado;
        } catch (NumberFormatException | ArithmeticException erro) {
            mostrarErro(erro.getMessage());
        } finally {
            operadorPendente = null;
            iniciarNovoNumero = true;
        }
    }

    private double lerValorVisor() {
        return Double.parseDouble(visor.getText());
    }

    private double operar(double primeiro, double segundo, String operador) {
        switch (operador) {
            case "+": return primeiro + segundo;
            case "-": return primeiro - segundo;
            case "*": return primeiro * segundo;
            case "/":
                if (segundo == 0.0) {
                    throw new ArithmeticException("Nao e possivel dividir por zero.");
                }
                return primeiro / segundo;
            default:
                throw new IllegalArgumentException("Operacao desconhecida: " + operador);
        }
    }

    private void mostrarValor(double valor) {
        if (Double.isNaN(valor) || Double.isInfinite(valor)) {
            throw new ArithmeticException("O resultado nao e um numero finito.");
        }
        visor.setText(BigDecimal.valueOf(valor).stripTrailingZeros().toPlainString());
    }

    private void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(
            this,
            mensagem == null ? "Nao foi possivel realizar a operacao." : mensagem,
            "Erro na calculadora",
            JOptionPane.ERROR_MESSAGE
        );
        limpar();
    }

    private void limpar() {
        memoria = 0.0;
        operadorPendente = null;
        iniciarNovoNumero = true;
        visor.setText("0");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraSwing().setVisible(true));
    }
}
