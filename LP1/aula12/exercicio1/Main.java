package aula12.exercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CartaoWeb> cartoes = new ArrayList<>();

        cartoes.add(new Natal("Ciclano"));
        cartoes.add(new Aniversario("Thales"));
        cartoes.add(new DiaDosNamorados("Fulano"));

        for (CartaoWeb c : cartoes) {
           c.showMessage();
        }
    }
}
