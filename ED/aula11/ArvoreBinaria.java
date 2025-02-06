package aula11;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ArvoreBinaria {
    /*
    Considerando o código de Árvore Binária a Seguir, implemente as buscas:

        - pré-ordem;
        - en-ordem;
        - pós-ordem;
*/

        static class No {
            No esquerda;
            No direita;
            int valor;

            //Método construtor para inicializar um nó com valor
            public No(int valor) {
                this.valor = valor;
            }

        }

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            No raiz = null;

            int op, n;

            do{
                System.out.println("\n-- ÁRVORE BINÁRIA -- ");
                System.out.println("1 - Inserir");
                System.out.println("2 - Remover");
                System.out.println("3 - Busca breadthfirst");
                System.out.println("4 - Pré-ordem");
                System.out.println("5 - Em-ordem");
                System.out.println("6 - Pós-ordem");
                System.out.println("7 - Sair");

                op = entrada.nextInt();

                switch (op) {

                    case 1:
                        System.out.println("Digite um número a ser inserido: ");
                        n = entrada.nextInt();
                        if (raiz == null)
                            raiz = inserir(raiz, n);
                        else
                            inserir(raiz, n);
                        break;
                    case 2:
                        System.out.println("Digite um número a ser removido: ");
                        n = entrada.nextInt();
                        //remover(raiz, n);
                        break;
                    case 3:
                        System.out.println("Busca Breadth-first");
                        breadthFirst(raiz);
                        break;
                    case 4:
                        System.out.println("Busca Pré-ordem");
                        //preOrdem(raiz);
                        break;
                    case 5:
                        System.out.println("Busca Em-ordem");
                        break;
                    case 6:
                        System.out.println("Busca Pós-ordem");
                        break;
                    case 7:
                        System.out.println("Tchau!!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }while (op != 7);
        }


        private static void breadthFirst(No raiz) {
            if (raiz == null) {
                System.out.println("A árvore está vazia.");
                return;
            }

            Queue<No> filaNos = new ArrayDeque<No>();
            filaNos.add(raiz);

            while (!filaNos.isEmpty()) {
                No atual = filaNos.remove();
                System.out.print(atual.valor + " ");

                if (atual.esquerda != null)
                    filaNos.add(atual.esquerda);
                if (atual.direita != null)
                    filaNos.add(atual.direita);
            }
        }


        public static No inserir(No no, int valor) {

            if (no == null) {
                no = new No(valor);
            }
            else {
                if (valor < no.valor) {
                    no.esquerda = inserir(no.esquerda, valor);
                }
                else if (valor > no.valor) {
                    no.direita = inserir(no.direita, valor);
                }

            }

            //System.out.println("Inserindo "+ valor + " no nó: " + imprimeSerie(no));
            return no;
        }

        public static String imprimeSerie(No no) {
            if (no == null)
                return null;
            String endCompleto = no.toString();
            int tam = endCompleto.length();
            return endCompleto.substring(tam-8,tam);
        }

    }
