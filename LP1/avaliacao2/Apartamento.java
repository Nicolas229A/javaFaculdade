package avaliacao2;

import java.util.Objects;

public class Apartamento extends Imovel{

    private double condominio;

    public Apartamento () {}

    public Apartamento(String endereco, String tipo, double condominio) {
        super(endereco, tipo);
        this.condominio = condominio;
    }

    public double getCondominio() {
        return condominio;
    }

    public void setCondominio(double condominio) {
        this.condominio = condominio;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "condominio=" + condominio +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apartamento that = (Apartamento) o;
        return Double.compare(that.condominio, condominio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), condominio);
    }

    @Override
    public double valorAluguel() {
        return switch (super.getTipo()) {
            case "pequeno" -> 2000.00 + condominio;
            case "medio" -> 3500.00 + condominio;
            case "grande" -> 7000.00 + condominio;
            default -> throw new IllegalArgumentException("Tipo inválido: " + super.getTipo());
        };
    }
}
