package aula2;

public class Artista {
    
    private String nome;
    private String nomeArtistico;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Artista() {
    }

    public Artista(String nome, String nomeArtistico, int idade) {
        this.nome = nome;
        this.nomeArtistico = nomeArtistico;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Artista{" + "nome=" + nome + ", nomeArtistico=" + nomeArtistico + ", idade=" + idade + '}';
    }
}
