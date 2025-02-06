package aula16.exercicioTeste;

import java.util.HashSet;

public class MainT {
    public static void main(String[] args) {
        HashSet<Estudante> hs = new HashSet<Estudante>();
        hs.add(new Estudante("Fulano", 5000, 8));
        hs.add(new Estudante("Ciclana", 7000, 9.5));
        hs.add(new Estudante("Fulana", 20000, 9));
        System.out.println(hs);
    }
}
