package avaliacao1;

import java.util.Objects;

public class Equipamento {
    private String nome;
    private String fabricante;
    private double preco;

    public Equipamento() {}

    public Equipamento(String nome, String fabricante, double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        final Equipamento equipamento = (Equipamento) obj;
        return Double.compare(preco, equipamento.preco) == 0 && Objects.equals(nome, equipamento.nome) && Objects.equals(fabricante, equipamento.fabricante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, fabricante, preco);
    }
}
