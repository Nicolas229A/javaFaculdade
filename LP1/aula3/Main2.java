package aula3;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        ObraDeArte o1 = new ObraDeArte(1, "O Jamal Gunn", "James Gamal", "Fortaleza, Ceará", 9800.80, 2017);
        ObraDeArte o2 = new ObraDeArte(2, "Thales del Banco", "Lucas Guimaro", "Campo Grande, MS", 100000.00, 2024);
        ObraDeArte o3 = new ObraDeArte(3, "Pemba Nenhuma", "Nicolas Valente", "Campo Grande, MS", 0.45, 2013);

        List<ObraDeArte> obras = new ArrayList<>();

        obras.add(o1);
        obras.add(o2);
        obras.add(o3);

        System.out.println("Obras criadas a partir de 2020: ");
        for (ObraDeArte obra : obras) {
            if (obra.getAno() > 2020) {
                System.out.println(obra);
            }
        }
    }
}
