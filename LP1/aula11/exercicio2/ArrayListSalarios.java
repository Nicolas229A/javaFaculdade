package aula11.exercicio2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSalarios {
    public static void main(String[] args) {

        // 2) Crie um ArrayList que armazene salários e implemente as funcionalidades.
            //• Adicione 6 salários;
            //• Apresente os dados do ArrayList;
            //• Ordene de forma crescente o ArrayList.
            //• Apresente o ArrayList Ordenado;
            //• Ordene o ArrayList de forma decrescente.
            //• Apresente o ArrayList Ordenado;

        ArrayList <Double> salarios = new ArrayList<>();

        salarios.add(6500.00);
        salarios.add(980.68);
        salarios.add(1412.01);
        salarios.add(788.88);
        salarios.add(450.00);
        salarios.add(9500.99);

        System.out.println(salarios);

        Collections.sort(salarios);

        System.out.println(salarios);

        Collections.reverse(salarios);

        System.out.println(salarios);
    }
}
