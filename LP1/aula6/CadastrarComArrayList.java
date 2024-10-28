package aula6;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarComArrayList {
    public static void main(String[] args) {

        ArrayList <String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA ===");
            System.out.println("1. Cadastrar um Nome");
            System.out.println("2. Imprimir os nomes");
            System.out.println("3. Quantidade de nomes cadastrados");
            System.out.println("4. Buscar um nome");
            System.out.println("5. Remover um nome");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    scanner.nextLine();
                    String nome;
                    System.out.println("Insira o nome: ");
                    nome = scanner.nextLine();
                    nomes.add(nome);
                    break;

                case 2:
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println("Nome da posição " + i + ": " + nomes.get(i));
                    }
                    break;

                case 3:
                    System.out.println("Há " + nomes.size() + " cadastrados!");
                    break;

                case 4:
                    scanner.nextLine();
                    String nomeBusca;
                    System.out.println("Insira o nome que quer buscar: ");
                    nomeBusca = scanner.nextLine();
                    boolean busca = nomes.contains(nomeBusca);
                    if (busca) {
                        System.out.println(nomeBusca + " está presente na lista!");
                    } else {
                        System.out.println(nomeBusca + " NÃO está presente na lista!");
                    }
                    break;

                case 5:
                    scanner.nextLine();
                    String nomeRemover;
                    System.out.println("Insira o nome que será removido: ");
                    nomeRemover = scanner.nextLine();
                    nomes.remove(nomeRemover);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
