package aula4;

public class Animal {

    private String nome;
    private String especie;
    private int idade;
    private int peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie () {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Animal() {

    }

    public Animal(String nome, String especie, int idade, int peso) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String toString() {
        return "Animal{" + "nome=" + nome + ", especie=" + especie + ", idade=" + idade + ", peso=" + peso + '}';
    }
}
