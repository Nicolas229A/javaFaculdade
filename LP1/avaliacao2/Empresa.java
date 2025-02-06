package avaliacao2;

import java.util.ArrayList;
import java.util.Objects;

public class Empresa {
    public ArrayList<Alugavel> bens;

    public Empresa () {}

    public Empresa(ArrayList<Alugavel> bens) {
        this.bens = bens;
    }

    public void adicionarBens(Alugavel bem) {
        bens.add(bem);
    }

    public void listarBens () {
        System.out.println("Lista de Bens: ");

        for (Alugavel bem : bens) {
            if (bem instanceof Imovel) {
                System.out.println(bem);
            }
        }

        for (Alugavel bem : bens) {
            if (bem instanceof Apartamento) {
                System.out.println(bem);
            }
        }

        for (Alugavel bem : bens) {
            if (bem instanceof Carro) {
                System.out.println(bem);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(bens, empresa.bens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bens);
    }
}
