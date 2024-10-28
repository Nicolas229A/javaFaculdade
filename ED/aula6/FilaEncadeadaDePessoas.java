package aula6;

import java.util.Scanner;

public class FilaEncadeadaDePessoas {
    public static void main(String[] args) {

        Pessoa primeiro = null;
        Pessoa ultimo = null;

        Pessoa fiscal = null;

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n=== Controle da Fila ===");
            System.out.println("0. Sair");
            System.out.println("1. Incluir pessoa na fila");
            System.out.println("2. Conferir pessoas que estão na fila");
            System.out.println("3. Procurar por alguém na fila");
            System.out.println("4. Retirar pessoa da fila");
            System.out.println("5. Liberar todos da fila");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 0:
                    System.out.println("Tchau!");
                    break;

                case 1:
                    Pessoa novaPessoa = new Pessoa();
                    System.out.println("Informe o nome: ");
                    novaPessoa.nome = scanner.next();
                    novaPessoa.proximo = null;


                    if (primeiro == null) {
                        primeiro = novaPessoa;
                        ultimo = novaPessoa;
                    } else {
                        ultimo.proximo = novaPessoa;
                        ultimo = novaPessoa;
                    }
                    System.out.println(novaPessoa.nome + " inserido(a) na fila");
                    break;

                case 2:
                    if (primeiro == null) {
                        System.out.println("Não tem ninguém na fila!");
                    } else {
                        fiscal = primeiro;
                        while (fiscal != null) {
                            System.out.println("Nome: " + fiscal.nome);
                            fiscal = fiscal.proximo;
                        }

                    }
                    break;

                case 3:
                    if (primeiro == null) {
                        System.out.println("Não tem ninguém na fila!");
                    } else {
                        System.out.println("Digite o nome a pesquisar:");
                        String nome = scanner.next();

                        fiscal = primeiro;
                        while (fiscal != null && !fiscal.nome.equals(nome)) {
                            fiscal = fiscal.proximo;
                        }
                        if (fiscal == null) {
                            System.out.println(nome + " não está na fila");
                        } else {
                            System.out.println(nome + " está na fila");
                        }

                    }
                    break;

                case 4:
                    if (primeiro == null) {
                        System.out.println("Não tem ninguém na fila!");
                    } else {
                        System.out.println(primeiro.nome + " foi removido da fila");
                        primeiro = primeiro.proximo;
                    }
                    break;

                case 5:
                    if (primeiro == null) {
                        System.out.println("Não tem ninguém na fila!");
                    } else {
                        System.out.println("Fila liberada");
                        primeiro = null;
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }


        }while(opcao!=0);

    }

    }
