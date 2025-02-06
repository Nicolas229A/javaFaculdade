package aula15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Main {
    private static Queue<Processo> fila = new LinkedList<>();
    private static Stack<Processo> pilha = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Inserir Processo na Fila");
            System.out.println("2 - Mostrar Fila");
            System.out.println("3 - Executar um Processo");
            System.out.println("4 - Finalizar um Processo");
            System.out.println("5 - Finalizar todos os Processos em Execução");
            System.out.println("6 - Mostrar Processos em Execução");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    inserirProcesso(scanner);
                    break;
                case 2:
                    mostrarFila();
                    break;
                case 3:
                    executarProcesso();
                    break;
                case 4:
                    finalizarProcesso();
                    break;
                case 5:
                    finalizarTodosProcessos();
                    break;
                case 6:
                    mostrarProcessosEmExecucao();
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

    private static void inserirProcesso(Scanner scanner) {
        System.out.print("Digite o ID do processo: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a descricao do processo: ");
        String descricao = scanner.nextLine();

        Processo processo = new Processo(id, descricao);
        fila.add(processo);
        System.out.println("Processo adicionado na fila com sucesso.");
    }

    private static void mostrarFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila de processos está vazia.");
        } else {
            System.out.println("\n--- FILA DE PROCESSOS ---");
            for (Processo processo : fila) {
                System.out.println(processo);
            }
        }
    }

    private static void executarProcesso() {
        if (fila.isEmpty()) {
            System.out.println("A fila de processos está vazia. Nada para executar.");
        } else {
            Processo processo = fila.poll();
            pilha.push(processo);
            System.out.println("Processo " + processo + " movido para a pilha de execucao.");
        }
    }

    private static void finalizarProcesso() {
        if (pilha.isEmpty()) {
            System.out.println("Nao há processos em execução para finalizar.");
        } else {
            Processo processo = pilha.pop();
            System.out.println("Processo " + processo + " finalizado.");
        }
    }

    private static void finalizarTodosProcessos() {
        if (pilha.isEmpty()) {
            System.out.println("Não há processos em execução para finalizar.");
        } else {
            pilha.clear();
            System.out.println("Todos os processos em execução foram finalizados.");
        }
    }

    private static void mostrarProcessosEmExecucao() {
        if (pilha.isEmpty()) {
            System.out.println("Não há processos em execução.");
        } else {
            System.out.println("\n--- PROCESSOS EM EXECUCAO ---");
            for (Processo processo : pilha) {
                System.out.println(processo);
            }
        }
    }
}
