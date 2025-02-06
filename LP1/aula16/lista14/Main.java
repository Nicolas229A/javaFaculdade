package aula16.lista14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        long tempoInicial1 = System.currentTimeMillis();

        HashSet<String> hs = new HashSet<String>();

        for (int i = 0; i < 5000; i++) {
            hs.add("Lucas Guimaro joga muito");
        }

        for (int i = 0; i < 2000; i++) {
            hs.remove("Lucas Guimaro joga muito");
        }

        long tempoFinal1 = System.currentTimeMillis();
        System.out.println("O método foi executado em " + (tempoFinal1 - tempoInicial1) + " segundo(s)");

        //

        long tempoInicial2 = System.currentTimeMillis();

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        for (int i = 0; i < 5000; i++) {
            lhs.add("Lucas Guimaro joga muito");
        }

        for (int i = 0; i < 2000; i++) {
            lhs.remove("Lucas Guimaro joga muito");
        }

        long tempoFinal2 = System.currentTimeMillis();
        System.out.println("O método foi executado em " + (tempoFinal2 - tempoInicial2) + " segundo(s)");

        //

        long tempoInicial3 = System.currentTimeMillis();

        TreeSet<String> ts = new TreeSet<String>();

        for (int i = 0; i < 5000; i++) {
            ts.add("Lucas Guimaro joga muito");
        }

        for (int i = 0; i < 2000; i++) {
            ts.remove("Lucas Guimaro joga muito");
        }

        long tempoFinal3 = System.currentTimeMillis();
        System.out.println("O método foi executado em " + (tempoFinal3 - tempoInicial3) + " segundo(s)");

    }
}
