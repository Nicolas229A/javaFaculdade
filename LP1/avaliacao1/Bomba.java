package avaliacao1;

import java.util.Objects;

public class Bomba extends Equipamento{
    private int vazao;
    private double profundidade;

    public Bomba() {}

    public Bomba(String nome, String fabricante, double preco, int vazao, double profundidade) {
        super(nome, fabricante, preco);
        this.vazao = vazao;
        this.profundidade = profundidade;
    }

    public int getVazao() {
        return vazao;
    }

    public void setVazao(int vazao) {
        this.vazao = vazao;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return super.toString() + " - Bomba{" +
                "vazao=" + vazao +
                ", profundidade=" + profundidade +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (super.equals(obj)) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            final Bomba bomba = (Bomba) obj;
            return vazao == bomba.vazao && Double.compare(profundidade, bomba.profundidade) == 0;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), vazao, profundidade);
    }
}
