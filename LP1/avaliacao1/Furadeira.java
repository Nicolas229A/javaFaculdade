package avaliacao1;

import java.util.Objects;

public class Furadeira extends Equipamento{
    private int potencia;
    private int velocidade;

    public Furadeira () {}

    public Furadeira(String nome, String fabricante, double preco, int potencia, int velocidade) {
        super(nome, fabricante, preco);
        this.potencia = potencia;
        this.velocidade = velocidade;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return super.toString() + " - Furadeira{" +
                "potencia=" + potencia +
                ", velocidade=" + velocidade +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (super.equals(obj)) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            final Furadeira furadeira = (Furadeira) obj;
            return potencia == furadeira.potencia && velocidade == furadeira.velocidade; //SL
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), potencia, velocidade);
    }
}
