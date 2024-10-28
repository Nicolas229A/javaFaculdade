package aula6;

import java.util.ArrayList;

public class ArrayListAula6 {
    public static void main(String[] args) {
        ArrayList <Integer> lista = new ArrayList<>();

        lista.add(99);
        lista.add(100);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista.add(101);
        lista.add(102);
        lista.add(103);

        lista.remove((Integer)99);

        for (Integer x : lista) {
            System.out.println((x));
        }

        System.out.println(lista.contains(100));

    }
}
