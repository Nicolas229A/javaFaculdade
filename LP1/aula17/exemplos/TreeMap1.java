package aula17.exemplos;

import java.util.*;
public class TreeMap1 {
        public static void main(String[] args) {
            TreeMap<Integer, String> tree_map = new TreeMap<Integer,
                    String>();
            // inserção de elementos
            tree_map.put(22, "Pedro");
            tree_map.put(11, "João");
            tree_map.put(67, "Ciclano");
            tree_map.put(99, "Ciclana");
            tree_map.put(1, "Maria");
            // impressão
            System.out.println("Elementos do Map: " + tree_map);
            // verificando se existe uma chave
            System.out.println("Verificar se a chave 77 existe: " +
                    tree_map.containsKey(0));
            System.out.println("Verificar se a chave 99 existe: " +
                    tree_map.containsKey(99));
            // verificando se existe um valor cadastrado
            System.out.println("Verificar se o valor Pedro existe: " +
                    tree_map.containsValue("Pedro"));
            // tamanho do map
            System.out.println("O tamanho do map é: " + tree_map.size());
            // verificar se o map está vazio
            System.out.println("O map está vazio: " + tree_map.isEmpty());
            // pegar valores a partida da chave
            System.out.println("Pegar o valor da chave 11: " +
                    tree_map.get(11));
            System.out.println("Pegar o valor da chave 99: " +
                    tree_map.get(99));
            // não tem a 77, retorna null
            System.out.println("Pegar o valor da chave 77: " +
                    tree_map.get(77));
            // removendo
            tree_map.remove(22, "João");
            // apresentando novamento o map
            System.out.println("Elementos do Map");
            for (Map.Entry i : tree_map.entrySet()) {
                System.out.println(i.getKey() + " " + i.getValue());
            }
        }
    }
