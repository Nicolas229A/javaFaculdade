package pokemonBox;

import avaliacao1.Equipamento;

import java.util.Objects;

public class Pokemon {
    private int numeroPokedex;
    private String nome;
    private int totalStats;
    private String tipo1;
    private String tipo2;
    private boolean evolui;
    private boolean megaEvolui;

    public Pokemon() {}

    public Pokemon(int numeroPokedex, String nome, int totalStats, String tipo1, String tipo2, boolean evolui, boolean megaEvolui) {
        this.numeroPokedex = numeroPokedex;
        this.nome = nome;
        this.totalStats = totalStats;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.evolui = evolui;
        this.megaEvolui = megaEvolui;
    }

    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalStats() {
        return totalStats;
    }

    public void setTotalStats(int totalStats) {
        this.totalStats = totalStats;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public boolean isEvolui() {
        return evolui;
    }

    public void setEvolui(boolean evolui) {
        this.evolui = evolui;
    }

    public boolean isMegaEvolui() {
        return megaEvolui;
    }

    public void setMegaEvolui(boolean megaEvolui) {
        this.megaEvolui = megaEvolui;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "numeroPokedex=" + numeroPokedex +
                ", nome='" + nome + '\'' +
                ", totalStats=" + totalStats +
                ", tipo1='" + tipo1 + '\'' +
                ", tipo2='" + tipo2 + '\'' +
                ", evolui=" + evolui +
                ", megaEvolui=" + megaEvolui +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return numeroPokedex == pokemon.numeroPokedex && totalStats == pokemon.totalStats && evolui == pokemon.evolui && megaEvolui == pokemon.megaEvolui && Objects.equals(nome, pokemon.nome) && Objects.equals(tipo1, pokemon.tipo1) && Objects.equals(tipo2, pokemon.tipo2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroPokedex, nome, totalStats, tipo1, tipo2, evolui, megaEvolui);
    }
}

