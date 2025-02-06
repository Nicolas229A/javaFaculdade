package avaliacao2;

import java.util.Objects;

public class Carro implements Alugavel{

    private String modelo;
    private String tipo;

    public Carro () {}

    public Carro(String modelo, String tipo) {
        this.modelo = modelo;
        this.tipo = tipo.toLowerCase();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toLowerCase();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(modelo, carro.modelo) && Objects.equals(tipo, carro.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, tipo);
    }

    @Override
    public double valorAluguel() {
        return switch (tipo) {
            case "basico" -> 250.00;
            case "compacto" -> 500.00;
            case "familiar" -> 1000.00;
            case "luxo" -> 2000.00;
            default -> throw new IllegalArgumentException("Tipo inválido: " + tipo);
        };
    }
}
