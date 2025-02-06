package avaliacao2;

import java.util.Objects;

public class Imovel implements Alugavel{

    private String endereco;
    private String tipo;

    public Imovel() {}

    public Imovel(String endereco, String tipo) {
        this.endereco = endereco;
        this.tipo = tipo.toLowerCase();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toLowerCase();
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "endereco='" + endereco + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imovel imovel = (Imovel) o;
        return Objects.equals(endereco, imovel.endereco) && Objects.equals(tipo, imovel.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endereco, tipo);
    }

    @Override
    public double valorAluguel() {
        return switch (tipo) {
            case "pequeno" -> 2000.00;
            case "medio" -> 3500.00;
            case "grande" -> 7000.00;
            default -> throw new IllegalArgumentException("Tipo inválido: " + tipo);
        };
    }
}
