package Model;

public class Emprestimo {

    public boolean emprestarLivro(CatalogarLivros catalogarLivros, String titleBook) {
        Livros ShowBookSpare = catalogarLivros.tituloDoLivro(titleBook);

        if ( ShowBookSpare != null && ShowBookSpare.isEmprestado()) {
            catalogarLivros.ListenBookUnworn();
            return true;
        }else {
            return false;
        }
    }

    public boolean returnBook (CatalogarLivros catalogarLivros, String titleBook) {
        Livros livrosDevolvidos = catalogarLivros.tituloDoLivro(titleBook);

        if (livrosDevolvidos != null && livrosDevolvidos.isEmprestado()) {
            catalogarLivros.ReturnBook(livrosDevolvidos);
            return true;
        } else {
            return false;
        }
    }

}
