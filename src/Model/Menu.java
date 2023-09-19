package Model;

import java.util.Scanner;

public class Menu {
    public void Menu() {
        Scanner teclado = new Scanner(System.in);
        RegisterClient registerClient = new RegisterClient();

        boolean left = false;

        while (!left) {
            System.out.println("----------- Seja Bem Vindo a LibraryJS -----------");

            System.out.println("Escolha uma das Opções para prosseguir:  ");
            System.out.print("");
            System.out.println(" 1 - Cadastro / Registro de Usuario e Livro");
            System.out.println(" 2 - Catalogo de Livros: ");
            System.out.println(" 3 - Sair ");

            System.out.println("-------------------------------------------------");

            int selectOption = teclado.nextInt();

            switch (selectOption){

                case 1:
                    registerClient.Decision();
                    break;

                case 2:
                    break;

                case 3:
                left = true;
                    break;


            }
        }
    }
}
