package aula5;

import java.util.Scanner;

public class PilhaDeJogos {
    public static void main(String[] args) {
        Jogo jogoNoTopo = null;
        System.out.println("Jogo no topo da pilha: " + jogoNoTopo);
        Jogo observadorDeJogos = null;

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Meus Jogos ===");
            System.out.println("0. Sair");
            System.out.println("1. Adicionar jogo");
            System.out.println("2. Verificar jogo(s)");
            System.out.println("3. Apagar jogo");
            System.out.println("4. Apagar todos os jogos");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 0:
                    System.out.println("Até mais Mr Valente!");
                    break;

                case 1:
                    //Adicionou um novo jogo
                    Jogo novoJogo = new Jogo();
                    System.out.println("Qual o nome do jogo? ");
                    scanner.nextLine();
                    novoJogo.nome = scanner.nextLine();

                    //Esse novo jogo está no topo da linha
                    novoJogo.desceu = jogoNoTopo;
                    jogoNoTopo = novoJogo;
                    System.out.println("Jogo no topo: " + jogoNoTopo.nome + ", " + "endereço de memória deste: " + jogoNoTopo);
                    if (jogoNoTopo.desceu != null) {
                        System.out.println("Jogo abaixo: " + jogoNoTopo.desceu.nome + ", endereço de memória deste: " + jogoNoTopo.desceu);
                    }
                    break;

                case 2:
                    observadorDeJogos = jogoNoTopo;
                    if (jogoNoTopo == null) {
                        System.out.println("Todos os jogos foram apagados!");
                    } else {
                        while (observadorDeJogos != null) {
                            System.out.println("Endereço de memória: " + observadorDeJogos);
                            System.out.println("Nome: " + observadorDeJogos.nome);
                            System.out.println("======");
                            observadorDeJogos = observadorDeJogos.desceu;
                        }
                    }
                    break;

                case 3:
                    if (jogoNoTopo == null) {
                        System.out.println("Todos os jogos JÁ foram apagados!");
                    } else {
                        jogoNoTopo = jogoNoTopo.desceu;
                    }
                    break;

                case 4:
                    jogoNoTopo = null;
                    System.out.println("Todos os jogos ACABARAM DE SER apagados!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();

    }
}
