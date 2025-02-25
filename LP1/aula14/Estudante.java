package aula14;

public class Estudante {
    String nomeEstudante;
    double renda;
    double media;

    public Estudante() {}

    public Estudante(String nomeEstudante, double renda, double media) {
        this.nomeEstudante = nomeEstudante;
        this.renda = renda;
        this.media = media;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeEstudante + ", Renda: " + renda + ", Média: " + media;
    }
}


