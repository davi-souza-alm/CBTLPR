public class TestAuthor {
    public static void main(String[] args) {
        // Testar construtor
        Author author = new Author("Wellington Tuler", "tulermoraes@yahoo.com", 'm');
        
        // Verificar o método toString()
        System.out.println("Teste toString: " + author.toString());
        
        // Testar os Getters
        System.out.println("Nome: " + author.getName());
        System.out.println("Email atual: " + author.getEmail());
        System.out.println("Gênero: " + author.getGender());
        
        // Testar o Setter[cite: 1]
        author.setEmail("novoemail@yahoo.com");
        System.out.println("Novo Email: " + author.getEmail());
    }
}