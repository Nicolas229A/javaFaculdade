package aula17.exemplos;

import java.util.*;
public class LinkedMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linked_hash_map = new
                LinkedHashMap<Integer, String>();
        // inserção de elementos
        linked_hash_map.put(22, "Pedro");
        linked_hash_map.put(11, "João");
        linked_hash_map.put(67, "Ciclano");
        linked_hash_map.put(99, "Ciclana");
        linked_hash_map.put(1, "Maria");
        // impressão
        System.out.println("Elementos do Map: " + linked_hash_map);
        // verificando se existe uma chave
        System.out.println("Verificar se a chave 77 existe: " +
                linked_hash_map.containsKey(0));
        System.out.println("Verificar se a chave 99 existe: " +
                linked_hash_map.containsKey(99));
        // verificando se existe um valor cadastrado
        System.out.println("Verificar se o valor Pedro existe: " +
                linked_hash_map.containsValue("Pedro"));
        // tamanho do map
        System.out.println("O tamanho do map é: " +
                linked_hash_map.size());
        // verificar se o map está vazio
        System.out.println("O map está vazio: " +
                linked_hash_map.isEmpty());
        // pegar valores a partida da chave
        System.out.println("Pegar o valor da chave 11: " +
                linked_hash_map.get(11));
        System.out.println("Pegar o valor da chave 99: " +
                linked_hash_map.get(99));
        // não tem a 77, retorna null
        System.out.println("Pegar o valor da chave 77: " +
                linked_hash_map.get(77));
        // removendo
        linked_hash_map.remove(22, "João");
        // apresentando novamento o map
        System.out.println("Elementos do Map");
        for (Map.Entry i : linked_hash_map.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}

