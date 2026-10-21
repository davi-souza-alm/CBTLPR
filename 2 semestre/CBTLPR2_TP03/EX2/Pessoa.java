// Davi de Souza Almeida & Henrique Meira 

public class Pessoa {
    protected static int kp = 0;
    protected String nome;
    protected char sexo;
    protected int idade;

    private boolean contabilizada = false;

    public Pessoa() {
        this.nome = "";
        this.sexo = '\0';
        this.idade = 0;
    }

    public Pessoa(String nome, char sexo, int idade) {
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
    }

    public void setKp() {
        if (!contabilizada) {
            kp++;
            contabilizada = true;
        }
    }

    public void setNome(String nome) {
        this.nome = nome == null ? "" : nome.trim();
    }

    public void setSexo(char sexo) {
        char sexoNormalizado = Character.toUpperCase(sexo);
        if (sexoNormalizado != 'M' && sexoNormalizado != 'F') {
            throw new IllegalArgumentException("O sexo deve ser M ou F.");
        }
        this.sexo = sexoNormalizado;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade nao pode ser negativa.");
        }
        this.idade = idade;
    }

    public int getKp() {
        return kp;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }
}
