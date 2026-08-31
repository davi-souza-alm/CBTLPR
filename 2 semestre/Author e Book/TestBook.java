public class TestBook {
    public static void main(String[] args) {
        // Crie e aloque o array de autores.[cite: 1]
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');
        
        // Declarar e alocar a instância de um book.[cite: 1]
        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);
        
        // toString()[cite: 1]
        System.out.println(testeBook.toString()); 
        
        // Testando outros métodos 
        System.out.println("Nomes dos autores concatenados: " + testeBook.getAuthorNames());
    }
}