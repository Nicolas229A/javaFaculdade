package aula5;

public class Livro {
    private String nome;
    private int ano;
    private boolean emprestado;

    public Livro() {
    }

    public Livro(String nome, int ano, boolean emprestado) {
        this.nome = nome;
        this.ano = ano;
        this.emprestado = emprestado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", emprestado=" + emprestado +
                '}';
    }

    public void emprestado () {
        this.emprestado = true;
    }
    public void devolvido () {
        this.emprestado = false;
    }


}




