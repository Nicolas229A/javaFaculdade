package aula16.exercicioTeste;

import java.util.Objects;
public class Estudante implements Comparable<Estudante> {
    private String nome;
    double renda, media;

    public Estudante() {}
    public Estudante(String nome, double renda, double media) {
        this.nome = nome;
        this.renda = renda;
        this.media = media;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
        return "Estudante{" + "nome=" + nome + ", renda=" + renda + ", media=" +
                media + '}';
    }
    @Override
    public int compareTo(Estudante e) {
        return this.nome.compareTo(e.getNome());
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.renda) ^
                (Double.doubleToLongBits(this.renda) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.media) ^
                (Double.doubleToLongBits(this.media) >>> 32));
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudante other = (Estudante) obj;
        if (Double.doubleToLongBits(this.renda) !=
                Double.doubleToLongBits(other.renda)) {
            return false;
        }
        if (Double.doubleToLongBits(this.media) !=
                Double.doubleToLongBits(other.media)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
}

