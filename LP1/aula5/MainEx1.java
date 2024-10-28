package aula5;

public class MainEx1 {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca("Minha Biblioteca", 4);
        bib.liv[0] = new Livro("Livro 0", 2020, false);
        bib.liv[1] = new Livro("Livro 1", 2021, false);
        bib.liv[2] = new Livro("Livro 2", 2022, false);
        bib.liv[3] = new Livro("Livro 3", 2023, false);

        bib.liv[0].emprestado();
        bib.liv[3].emprestado();

        bib.listar();
    }
}
