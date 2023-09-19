package Model;

import java.util.ArrayList;

public class CatalogarLivros {

    private ArrayList<Livros> livrosCatalogados = new ArrayList<>();
    private ArrayList<Livros> livrosEmprestados = new ArrayList<>();

    public void CatalogoDeLivros() {

        Livros livro1 = new Livros();
        Livros livro2 = new Livros();
        Livros livro3 = new Livros();
        Livros livro4 = new Livros();
        Livros livro5 = new Livros();

        livrosCatalogados.add(livro1);
        livrosCatalogados.add(livro2);
        livrosCatalogados.add(livro3);
        livrosCatalogados.add(livro4);
        livrosCatalogados.add(livro5);

    }

    public void piggybackBook(Livros livros) {
        livrosCatalogados.add(livros);
    }

    public Livros tituloDoLivro(String titulo) {
        for (Livros livro : livrosCatalogados) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void ListenBookUnworn() {     //

        ArrayList<Livros> BookSpare = new ArrayList<>();

        for (Livros livros : livrosCatalogados) {
            if (!livros.isEmprestado()) {
                BookSpare.add(livros);
            }
        }

        if (BookSpare.isEmpty()) {
            System.out.println("Não Há Livros Disponível Para Empréstimos!");
        } else {
            System.out.println("Lista de Livros Disponível para Empréstimos:  ");
            for (Livros livros : BookSpare) {
                System.out.println("********************************************");
                System.out.println("Título do livro: " + livros.getTitulo());
                System.out.println("Autor do livro: " + livros.getAutor());
                System.out.println("Gênero do livro: " + livros.getGenero());
                System.out.println("ISBN do livro: " + livros.getIsbn());
                System.out.println("Status do livro: Disponível para Empréstimo");
                System.out.println("*********************************************");
            }
        }
    }

    public void listenBook() {
        if (livrosCatalogados.isEmpty()) {
            System.out.println("O Catálogo está Vazio.");
        } else {
            System.out.println("Catálogo de livros: ");
            for (Livros livros : livrosCatalogados) {
                System.out.println("Título do livro: " + livros.getTitulo());
                System.out.println("Autor do Livro: " + livros.getAutor());
                System.out.println("Gênero do Livro: " + livros.getGenero());
                System.out.println("ISBN do Livro: " + livros.getIsbn());
                if (livros.isEmprestado()) {
                    System.out.println("Status do Livro: Emprestado");
                } else {
                    System.out.println("Status do Livro: Disponível par Empréstimo");
                }
            }
        }
    }

    public void ShowBookSpare() {
        if (livrosEmprestados.isEmpty()) {
            System.out.println("Não Há Livros Emprestados No Momento!");
        } else {
            System.out.println("Livros Emprestados: ");
            for (Livros livros : livrosEmprestados) {
                System.out.println("***************************************");
                System.out.println("Título do Livro: " + livros.getTitulo());
                System.out.println("Autor do Livro: " + livros.getAutor());
                System.out.println("Gênero do Livro: " + livros.getGenero());
                System.out.println("ISBN do Livro: " + livros.getIsbn());
                System.out.println("***************************************");
            }
        }
    }

    public boolean LoonBook(Livros livros) {
        if (!livros.isEmprestado()) {
            livros.emprestar();
            livrosEmprestados.add(livros);
            return true;
        } else {
            return false;
        }
    }

    public boolean ReturnBook(Livros livros) {
        if (livrosEmprestados.contains(livros)) {
            livros.devolver();
            livrosEmprestados.remove(livros);
            return true;
        } else {
            return false;
        }
    }
}




