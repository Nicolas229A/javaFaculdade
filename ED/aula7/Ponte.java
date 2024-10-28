package aula7;

import java.util.Scanner;

public class Ponte {
    public static void main(String[] args) {
        Pessoa primeiroFila1 = null; Pessoa ultimoFila1 = null;
        Pessoa fiscalFila1 = null;

        Pessoa primeiroFila2 = null; Pessoa ultimoFila2 = null;
        Pessoa fiscalFila2 = null;

        double pesoTotal = 0;

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n=== Controle da Fila ===");
            System.out.println("1. Inserir uma pessoa na Fila de Pessoas (FILA1)");
            System.out.println("2. Exibir quantas pessoas estão sobre a ponte (FILA2) e somatório de peso atual na ponte");
            System.out.println("3. Inserir uma pessoa na Fila sobre a Ponte (FILA2)");
            System.out.println("4. Excluir uma pessoa da Fila sobre a Ponte (FILA2)");
            System.out.println("5. Listar todas as pessoas e seus atributos da Fila 1");
            System.out.println("6. Listar todas as pessoas e seus atributos da Fila 2");
            System.out.println("7. Sair");


            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    Pessoa novaPessoa = new Pessoa();
                    System.out.println("Informe o codigo: ");
                    novaPessoa.codigo = scanner.nextInt();
                    System.out.println("Informe o nome: ");
                    novaPessoa.nome = scanner.next();
                    System.out.println("Informe o peso: ");
                    novaPessoa.peso = scanner.nextDouble();
                    novaPessoa.proximo = null;

                    if (primeiroFila1 == null) {
                        primeiroFila1 = novaPessoa;
                        ultimoFila1 = novaPessoa;

                    } else {
                        ultimoFila1.proximo = novaPessoa;
                        ultimoFila1 = novaPessoa;
                    }
                    System.out.println(novaPessoa.nome + " inserido(a) na fila");
                    break;

                case 2:
                    int contadorDePessoas = 0;
                    double soma = 0.00;

                    if (primeiroFila2 == null) {
                        System.out.println("Não tem ninguém na fila");
                    } else {
                        fiscalFila2 = primeiroFila2;
                        while (fiscalFila2 != null) {
                            contadorDePessoas++;
                            soma+=fiscalFila2.peso;
                            fiscalFila2 = fiscalFila2.proximo;
                        }

                        System.out.println("Número de Pessoas: " + contadorDePessoas);
                        System.out.println("Soma dos pesos (kg): " + soma);
                    }
                    break;

                case 3:
                    double pesoAdicao;

                    if (primeiroFila1 != null) {
                        if (pesoTotal + primeiroFila1.peso <= 400) {
                            // Se FILA2 estiver vazia, inicializamos
                            if (primeiroFila2 == null) {
                                primeiroFila2 = primeiroFila1; // A primeira pessoa da FILA1 vai para a FILA2
                                ultimoFila2 = primeiroFila2; // Atualiza o último da FILA2
                                pesoAdicao = primeiroFila2.peso;
                                pesoTotal += pesoAdicao; // Atualiza o peso total
                                primeiroFila1 = primeiroFila1.proximo; // Move a FILA1 para o próximo
                                ultimoFila2.proximo = null; // Termina a lista
                                System.out.println(primeiroFila2.nome + " inserido(a) na ponte");
                            } else {
                                // Se FILA2 já tem pessoas, adicionamos ao final
                                ultimoFila2.proximo = primeiroFila1; // Adiciona a pessoa do início da FILA1 ao final da FILA2
                                ultimoFila2 = primeiroFila1; // Atualiza o último da FILA2
                                pesoAdicao = ultimoFila2.peso;
                                pesoTotal += pesoAdicao; // Atualiza o peso total
                                primeiroFila1 = primeiroFila1.proximo; // Move a FILA1 para o próximo
                                ultimoFila2.proximo = null; // Termina a lista
                                System.out.println(ultimoFila2.nome + " inserido(a) na ponte");
                            }
                        } else {
                            System.out.println("IMPOSSÍVEL INSERIR, LIMITE MÁXIMO DE PESO ALCANÇADO, REMOVER ALGUÉM DA PONTE ANTES");
                        }
                    } else {
                        System.out.println("Não há pessoas na FILA1 para inserir na ponte.");
                    }
                    break;

                    /*
                    case 3:
                    double pesoAdicao;

                    if (primeiroFila1 != null) {
                        if (pesoTotal + primeiroFila1.peso <= 400) {
                            if (primeiroFila2 == null) {
                                primeiroFila2 = primeiroFila1;
                                ultimoFila2 = primeiroFila1; ++++++
                                pesoAdicao = primeiroFila2.peso;
                                pesoTotal+=pesoAdicao;
                                primeiroFila1 = primeiroFila1.proximo;
                                ++++++
                                System.out.println(primeiroFila2.nome + " inserido(a) na ponte");

                            } else {

                                ultimoFila2.proximo = primeiroFila1;
                                ultimoFila2 = primeiroFila1;
                                pesoAdicao = ultimoFila2.peso;
                                pesoTotal += pesoAdicao;
                                primeiroFila1 = primeiroFila1.proximo;
                                ++++++
                                System.out.println(ultimoFila2.nome + " inserido(a) na ponte");
                            }
                        } else {
                            System.out.println("IMPOSSÍVEL INSERIR, LIMITE MÁXIMO DE PESO ALCANÇADO, REMOVER ALGUÉM DA PONTE ANTES");
                        }
                    } else {
                        System.out.println("Não há pessoas na FILA1 para inserir na ponte.");
                    }
                    break;
                     */

                case 4:
                    if (primeiroFila2 == null) {
                        System.out.println("Não tem ninguém na ponte!");
                    } else {
                        System.out.println(primeiroFila2.nome + " foi removido da ponte");
                        pesoTotal -= primeiroFila2.peso;
                        primeiroFila2 = primeiroFila2.proximo;
                    }
                    break;

                case 5:
                    if (primeiroFila1 == null) {
                        System.out.println("Não tem ninguém na fila");
                    } else {
                        fiscalFila1 = primeiroFila1;
                        while (fiscalFila1 != null) {
                            System.out.println("Código: " + fiscalFila1.codigo);
                            System.out.println("Nome: " + fiscalFila1.nome);
                            System.out.println("Peso (kg): " + fiscalFila1.peso);
                            fiscalFila1 = fiscalFila1.proximo;
                        }
                    }
                    break;

                case 6:
                    if (primeiroFila2 == null) {
                        System.out.println("Não tem ninguém na fila");
                    } else {
                        fiscalFila2 = primeiroFila2;
                        while (fiscalFila2 != null) {
                            System.out.println("Código: " + fiscalFila2.codigo);
                            System.out.println("Nome: " + fiscalFila2.nome);
                            System.out.println("Peso (kg): " + fiscalFila2.peso);
                            fiscalFila2 = fiscalFila2.proximo;
                        }
                    }
                    break;

                case 7:
                    System.out.println("Tchau!");
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }


        } while (opcao != 7);

    }
}

/*
Faça uma aplicação que simule uma Fila de Pessoas (FILA1) que estão aguardando para
subir em uma ponte. Cada pessoa tem um código, um nome e um peso (em kg).
Considere que esta pontetambém tem uma segunda Fila de Pessoas que estão passando
por ela (FILA2).

Considere ainda que, para uma pessoa que está na FILA1 poder entrar na Fila sobre a
ponte (FILA2), o limite máximo de peso sobre a ponte, de 400kg, deve ser respeitado.
O programa deve conter um menu com as seguintes opções:

a) Opção 1 – Inserir uma pessoa na Fila de Pessoas (FILA1);
a. Esta pessoa vai para o final da fila, aguardando sua vez para subir na ponte;

b) Opção 2 – Exibir quantas pessoas estão sobre a ponte (FILA2) e o
somatório depeso atual na ponte.

c) Opção 3 – Inserir uma pessoa na Fila sobre a Ponte (FILA2);
a. Esta opção insere, na Fila da Ponte (FILA2), quem está no início da
FILA1; Esta inserção:

i. Só pode acontecer caso o peso limite da ponte não exceda o peso
máximoda ponte (peso atual da soma das pessoas da ponte +
peso desta pessoa a ser inserida <= limite de peso da ponte);
Caso não seja possível, exibir a mensagem "IMPOSSÍVEL
INSERIR, LIMITE MÁXIMO DE PESO ALCANÇADO, REMOVER
ALGUÉM DA PONTE ANTES";

ii. Caso a inserção em FILA2 seja possível, ela resultará na remoção
desta pessoa da FILA1;

d) Opção 4 – Excluir uma pessoa da Fila sobre a Ponte (FILA2);
a. Esta opção simula a saída da pessoa da ponte;

e) Opção 5 – Listar todas as pessoas e seus atributos da Fila 1;

f) Opção 6 – Listar todas as pessoas e seus atributos da Fila 2;

g) Opção 7 - Sair
 */
