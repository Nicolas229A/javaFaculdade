package aula14;

import java.util.*;

public class MainVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudante> estudantes = new Vector<>();
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1- Cadastrar Estudante");
            System.out.println("2- Imprimir Estudantes");
            System.out.println("3- Quantidade de estudantes");
            System.out.println("4- Média geral da disciplina");
            System.out.println("5- Remover um estudante pelo nome");
            System.out.println("0- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do estudante: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a renda: ");
                    double renda = scanner.nextDouble();
                    System.out.print("Digite a média: ");
                    double media = scanner.nextDouble();
                    estudantes.add(new Estudante(nome, renda, media));
                    System.out.println("Estudante cadastrado com sucesso!");
                    break;

                case 2:
                    if (estudantes.isEmpty()) {
                        System.out.println("Nenhum estudante cadastrado.");
                    } else {
                        System.out.println("\nLista de Estudantes:");
                        for (Estudante e : estudantes) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Quantidade de estudantes: " + estudantes.size());
                    break;

                case 4:
                    if (estudantes.isEmpty()) {
                        System.out.println("Nenhum estudante cadastrado para calcular a média.");
                    } else {
                        double somaMedias = 0;
                        for (Estudante e : estudantes) {
                            somaMedias += e.media;
                        }
                        System.out.println("Média geral da disciplina: " + (somaMedias / estudantes.size()));
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome do estudante a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    boolean removido = estudantes.removeIf(e -> e.nomeEstudante.equalsIgnoreCase(nomeRemover));
                    if (removido) {
                        System.out.println("Estudante removido com sucesso!");
                    } else {
                        System.out.println("Estudante não encontrado.");
                    }
                    break;

                case 0: // Sair
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
