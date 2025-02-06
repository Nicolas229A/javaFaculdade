package aula17.lista15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {
    private static HashMap<String, String> hm = new HashMap<String, String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Cor/Fruta");
            System.out.println("2 - Imprimir todos os dados");
            System.out.println("3 - Quantidade de dados");
            System.out.println("4 - Buscar o nome da fruta a partir da cor");
            System.out.println("5 - Remover uma cor/fruta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    inserirCorFruta(scanner);
                    break;
                case 2:
                    mostrarHashMap();
                    break;
                case 3:
                    int qt = quantidadeDados();
                    System.out.println("Há " + qt + " de dados!");
                    break;
                case 4:
                    System.out.println("Insira uma cor (chave) pra encontrar a fruta");
                    String corBusca = scanner.next();
                    buscarPorChave(corBusca);
                    break;
                case 5:
                    removerCorFruta(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void inserirCorFruta (Scanner scanner) {
        String cor, fruta;
        System.out.println("Insira uma fruta");
        fruta = scanner.next();
        System.out.println("Insira a cor desta fruta");
        cor = scanner.next();

        hm.put(cor, fruta);
    }

    private static void mostrarHashMap () {
        System.out.println("Elementos do Hash Map: ");
        for (Map.Entry i : hm.entrySet()) {
            System.out.println(i.getKey() + " - " + i.getValue());
        }
    }

    private static int quantidadeDados () {
        return hm.size();
    }

    private static void buscarPorChave (String cor) {
        System.out.println(hm.get(cor));
    }

    private static void removerCorFruta (Scanner scanner) {
        String corRemover, frutaRemover;
        System.out.println("Insira uma fruta");
        frutaRemover = scanner.next();
        System.out.println("Insira a cor desta fruta");
        corRemover = scanner.next();

        hm.remove(corRemover, frutaRemover);
    }
}
