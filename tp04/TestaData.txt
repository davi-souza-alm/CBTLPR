// Davi de Souza Almeida (cb3038734)
// Agora, desenvolva um programa capaz de testar a classe e os métodos 
// desenvolvidos no exercício anterior.

public class TestaData {

    public static void main(String[] args) {

        Data data = new Data();

        System.out.println("\nData formato 1:");
        System.out.println(data.mostra1());

        System.out.println("\nData formato 2:");
        System.out.println(data.mostra2());

        System.out.println("\nAno bissexto?");
        System.out.println(data.bissexto());

        System.out.println("\nDias transcorridos:");
        System.out.println(data.diasTranscorridos());

        System.out.println("\nData atual:");
        data.apresentaDataAtual();
    }
}