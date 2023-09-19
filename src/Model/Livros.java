package Model;

public class Livros {

    private boolean emprestado;
    String nomeLivro;
    String autorLivro;
    String generoLivro;
    int isbn;
    {
        this.nomeLivro = nomeLivro;
        this.generoLivro =generoLivro;
        this.autorLivro = autorLivro;
        this.isbn = isbn;
        this.autorLivro = autorLivro;
        this.emprestado = false;
    }

    public Livros() {

    }

    public String getTitulo() {

        return nomeLivro;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public String getAutor() {

        return autorLivro;
    }

    public String getGenero() {
        return generoLivro;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }
}


