package avaliacao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa primeiroDaFila = null;
        Pessoa ultimoDaFila = null;
        Pessoa fiscalDaFila = null;

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n=== Sistema de Inserção de Pessoa e Documentos ===");
            System.out.println("1. Inserir pessoa com documentos na fila");
            System.out.println("2. Exibir toda a fila");
            System.out.println("3. Exibir documentos de uma pessoa (pesquisar pelo nome)");
            System.out.println("4. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    Pessoa novaPessoa = new Pessoa();
                    System.out.println("Informe qual o seu nome: ");
                    scanner.nextLine();
                    novaPessoa.nome = scanner.nextLine();
                    novaPessoa.proximaDaFila = null; //DD

                    if (primeiroDaFila == null) {
                        primeiroDaFila = novaPessoa;
                        ultimoDaFila = novaPessoa;
                    } else {
                        ultimoDaFila.proximaDaFila = novaPessoa;
                        ultimoDaFila = novaPessoa;
                    }

                    for (int i = 0; i < 1; i++) {
                        Documento novoDocumento = new Documento();
                        System.out.println("Informe a descrição do documento: ");
                        novoDocumento.descricao = scanner.nextLine();
                        System.out.println("Informe o número do documento: ");
                        novoDocumento.numero = scanner.nextInt();

                        novoDocumento.abaixoDeste = novaPessoa.documentos;
                        novaPessoa.documentos = novoDocumento;
                    }

                    String resposta;

                    do {

                    System.out.println("Deseja inserir mais documentos? (Digite Sim ou Não)");
                    resposta = scanner.next();

                    switch (resposta) {

                        case "Sim":
                            System.out.println("Quantos documentos você deseja inserir: ");
                            int numDocumentos = scanner.nextInt();

                            for (int i = 0; i < numDocumentos; i++) {
                                Documento novoDocumento = new Documento();
                                System.out.println("Informe a descrição do documento: ");
                                scanner.nextLine();
                                novoDocumento.descricao = scanner.nextLine();
                                System.out.println("Informe o número do documento: ");
                                novoDocumento.numero = scanner.nextInt();

                                novoDocumento.abaixoDeste = novaPessoa.documentos;
                                novaPessoa.documentos = novoDocumento;
                            }
                            break;

                        case "Não":
                            System.out.println("Finalizando inserção...");
                            break;

                        default:
                            System.out.println("Opção Inválida!");
                    }

                    } while (!resposta.equals("Não"));

                    System.out.println(novaPessoa.nome + " inserido(a) na fila com sucesso!");
                    break;

                case 2:
                    if (primeiroDaFila == null) {
                        System.out.println("Não há ninguém na fila.");
                    } else {
                        fiscalDaFila = primeiroDaFila;

                        while (fiscalDaFila != null) {
                            System.out.println("============");
                            System.out.println("INFORMAÇÕES DA PESSOA: ");
                            System.out.println("============");
                            System.out.println("Nome: " + fiscalDaFila.nome);

                            Documento documentosDaPessoa = fiscalDaFila.documentos;

                            if (documentosDaPessoa == null) {
                                System.out.println("Essa pessoa não inseriu nenhum documento");
                            } else {
                                System.out.println("============");
                                System.out.println("INFORMAÇÕES DO(S) DOCUMENTOS: ");
                                while (documentosDaPessoa != null) {
                                    System.out.println("============");
                                    System.out.println("Descrição: " + documentosDaPessoa.descricao);
                                    System.out.println("Número: " + documentosDaPessoa.numero);
                                    documentosDaPessoa = documentosDaPessoa.abaixoDeste;
                                }
                            }
                            System.out.println("============");
                            System.out.println();
                            fiscalDaFila = fiscalDaFila.proximaDaFila;
                        }
                    }
                    break;

                case 3:
                    if (primeiroDaFila == null) {
                        System.out.println("Não há ninguém na fila.");
                    } else {
                        System.out.println("Insira o nome que deseja pesquisar: ");
                        scanner.nextLine();
                        String nomeBusca = scanner.nextLine();

                        fiscalDaFila = primeiroDaFila;
                        while (fiscalDaFila != null && !fiscalDaFila.nome.equals(nomeBusca)) {
                            fiscalDaFila = fiscalDaFila.proximaDaFila;
                        }
                        if (fiscalDaFila == null) {
                            System.out.println(nomeBusca + " não está na fila");
                        } else {
                            Documento documentosDaPessoa = fiscalDaFila.documentos;

                            if (documentosDaPessoa == null) {
                                System.out.println("Essa pessoa não inseriu nenhum documento");
                            } else {
                                System.out.println("============");
                                System.out.println("INFORMAÇÕES DO(S) DOCUMENTOS: ");
                                while (documentosDaPessoa != null) {
                                    System.out.println("============");
                                    System.out.println("Descrição: " + documentosDaPessoa.descricao);
                                    System.out.println("Número: " + documentosDaPessoa.numero);
                                    documentosDaPessoa = documentosDaPessoa.abaixoDeste;
                                }
                            }
                            System.out.println("============");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Até Mais!");
                    break;

                default:
                    System.out.println("Opção Inválida! Retornando ao menu...");
            }

        } while (opcao != 4);
    }
}
