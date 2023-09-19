package Model;

import java.util.Scanner;

public class RegisterClient {

    Scanner teclado = new Scanner(System.in);
    Usuario usuario = new Usuario();
    Livros livros = new Livros();
    OutputPrint outputPrint = new OutputPrint();
    int validarPrint = 0;

    public Usuario RegisterUser() {

        System.out.println("************ CADASTRAR USÚARIO **************");
        System.out.println("Insira seu Nome:  ");
        usuario.nome = teclado.next();
        System.out.println("Insira seu Email: ");
        usuario.email = teclado.next();
        System.out.println("Insira seu número para Contato:  ");
        usuario.telContato = teclado.next();
        System.out.println("Insira seu endereço: ");
        usuario.endereco = teclado.next();
        System.out.println("******* USÚARIO CADASTRADO COM ÊXITO **********");

        if (validarPrint != 1) {
            outputPrint.PrintUser(usuario);
        }

        return RegisterUser();
    }

    public Usuario RegisterLivro() {

        System.out.println("**************** CADASTRADO LIVRO ***********");
        System.out.println("Qual é o título do livro:  ");
        livros.nomeLivro = teclado.next();
        System.out.println("Qual o Autor do Livro:  ");
        livros.autorLivro = teclado.next();
        System.out.println("Qual o gênero do Livro:  ");
        livros.generoLivro = teclado.next();
        System.out.println("Qual o ISBN do livro:  ");
        livros.isbn = teclado.nextInt();
        System.out.println("******* LIVRO CADASTRADO COM ÊXITO **********");

        if (validarPrint != 1) {
            outputPrint.PrintBook(livros);
        }
        return RegisterLivro();
    }

    public void BothRegister() {
        validarPrint = 1;
        RegisterUser();
        RegisterLivro();
        outputPrint.PrintUser(usuario);
        outputPrint.PrintBook(livros);
    }

    public void Decision() {

        String decision;
        System.out.println("Seja Bem Vindo");
        while (true) {

            System.out.println("Deseja Cadastrar:  [ Leitor | Livro | Ambos ]: ");
            decision = teclado.next().toLowerCase();
            switch (decision) {
                case "leitor":
                    RegisterUser();
                    return;
                case "livro":
                    RegisterLivro();
                    return;
                case "ambos":
                    BothRegister();
                    return;
                default:
                    System.out.println("Erro, Insira uma opção válida!!!");
            }

            System.out.println("Deseja Retornar ao Cadastro [ 1- Sim  2- Não ]: ");
            int continuar = teclado.nextInt();

            if (continuar == 1) {
                Decision();

            }
        }
    }
}
