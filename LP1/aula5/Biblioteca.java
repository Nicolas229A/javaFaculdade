package aula5;

public class Biblioteca {
    private String nome;
    private int quantidadeLivros;
    public Livro[] liv;

    public Biblioteca(String nome, int livros) {
        this.nome = nome;
        this.quantidadeLivros = livros;
        liv = new Livro[this.quantidadeLivros];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public void setQuantidadeLivros(int quantidadeLivros) {
        this.quantidadeLivros = quantidadeLivros;
    }

    public Livro[] getLiv() {
        return liv;
    }

    public void setLiv(Livro[] liv) {
        this.liv = liv;
    }

    public void listar () {
        for (int i = 0; i < getQuantidadeLivros(); i++) {
            System.out.println(this.liv[i]);
        }
    }
}
