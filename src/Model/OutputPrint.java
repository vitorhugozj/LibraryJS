package Model;

public class OutputPrint {

    public void PrintUser(Usuario usuario) {
        System.out.println("------------------------------------------");
        System.out.println("---------- INFORMAÇÕES DO LEITOR ---------");
        System.out.println("Nome do leitor: " + usuario.nome);
        System.out.println("Telefone para contato: " + usuario.telContato);
        System.out.println("Email parra contato: " + usuario.email);
        System.out.println("Endereço do leitor: " + usuario.endereco);
        System.out.println("------------------------------------------");
    }
    public void PrintBook(Livros livros) {
        System.out.println("-------------------------------------------");
        System.out.println("---------- INFORMAÇÕES DO LIVRO -----------");
        System.out.println("Título do livro: " + livros.nomeLivro);
        System.out.println("Nome do autor do Livro: " + livros.autorLivro);
        System.out.println("Qual o gênero do Livro: " + livros.generoLivro);
        System.out.println("Insira o ISBN do Livro: " + livros.isbn);
        System.out.println("-------------------------------------------");
    }
}
