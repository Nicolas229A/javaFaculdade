package aula11.exercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPessoas {

    //    3) Crie uma classe que represente as pessoas. A classe Pessoa possui os atributos: nome, salario e
    //    altura. Faça um ArrayList da classe Pessoa e implemente as funcionalidades.
        //        • Adicione 5 pessoas;
        //        • Apresente os dados do ArrayList;
        //        • Ordene de forma crescente o ArrayList, para isso implemente a interface Comparable na
        //          classe Pessoa;
        //        • Apresente o ArrayList Ordenado;
        //        • Ordene o ArrayList de forma decrescente.
        //        • Ordene de forma crescente o ArrayList, para isso implemente a interface Comparator em uma
        //          nova classe CompararPessoa

    public static void main(String[] args) {
        ArrayList <Pessoa> pessoas = new ArrayList<>();
        CompararPessoa comp = new CompararPessoa();

        pessoas.add(new Pessoa("Thales Lindo", 99999.99, 2.80));
        pessoas.add(new Pessoa("Ryan Padilha", 7000.00, 1.80));
        pessoas.add(new Pessoa("Lucas Guimaro", 6500.00, 1.50));
        pessoas.add(new Pessoa("Murilo dos Pokemon", 9009.09, 1.82));
        pessoas.add(new Pessoa("Endi Queiroz", 20000.00, 1.85));

        System.out.println(pessoas);

        Collections.sort(pessoas);

        System.out.println(pessoas);

        Collections.reverse(pessoas);

        System.out.println(pessoas);

        Collections.sort(pessoas, comp);

        System.out.println(pessoas);
    }
}
