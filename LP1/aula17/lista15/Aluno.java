package aula17.lista15;

public class Aluno implements Mediavel{

    private float nota1;
    private float nota2;
    private int idade;
    private String nome;

    public Aluno () {}

    public Aluno(float nota1, float nota2, int idade, String nome) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.idade = idade;
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public float media() {
        return (nota1 + nota2) / 2;
    }
}
