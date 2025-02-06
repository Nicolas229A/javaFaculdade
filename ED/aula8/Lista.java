package aula8;

import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ItemDaLista aux;
        ItemDaLista inicio = null;
        ItemDaLista fim = null;
        ItemDaLista anterior;

        int opcao;

        do{
            System.out.println(" -- LISTA -- ");
            System.out.println("OPÇÃO 1 -- Inserir no início da lista ");
            System.out.println("OPÇÃO 2 -- Inserir no fim da lista ");
            System.out.println("OPÇÃO 3 -- Consultar lista");
            System.out.println("OPÇÃO 4 -- Remover da lista");
            System.out.println("OPÇÃO 5 -- Esvaziar lista");
            System.out.println("OPÇÃO 6 - Sair");

            opcao = scanner.nextInt();

            if(opcao < 1 || opcao > 6)
                System.out.println("Opção inválida");

            if(opcao == 1){
                System.out.println("Digite o num a ser inserido no início da lista: ");

                ItemDaLista novo = new ItemDaLista();
                novo.num = scanner.nextInt();

                if(inicio == null){
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                }
                else{ //não é o primeiro elemento
                    novo.prox = inicio;
                    inicio = novo;
                }
                System.out.println("Número " + novo.num + " foi inserido.");


            }
            if (opcao == 2){
                System.out.println("Digite o num a ser inserido no final da lista: ");

                ItemDaLista novo = new ItemDaLista();
                novo.num = scanner.nextInt();

                if(inicio == null){
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                }
                else{
                    fim.prox = novo;
                    fim = novo;
                    fim.prox = null;
                }
                System.out.println("Número inserido");

            }
            if(opcao == 3){
                if(inicio == null){
                    System.out.println("Lista vazia");
                }else{
                    aux = inicio;
                    while(aux != null){
                        System.out.println("Número: " + aux.num);
                        aux = aux.prox;
                    }
                }

            }
            if(opcao == 4){
                if(inicio == null){
                    System.out.println("Lista vazia");
                }else{
                    System.out.println("Digite o num a ser removido: ");
                    int numero = scanner.nextInt();

                    aux = inicio;
                    anterior = null;

                    while(aux != null){
                        if(aux.num == numero){

                            if(aux == inicio){ // Número está no início
                                inicio = aux.prox;
                                aux = inicio;
                            }
                            else if(aux == fim){ // Número está no fim
                                anterior.prox = null;
                                fim = anterior;
                                aux = null;
                            }
                            else{ // Número está entre 2 nums
                                anterior.prox = aux.prox;
                                aux = aux.prox;
                            }

                        }
                        else{ // Não é o número
                            anterior = aux;
                            aux = aux.prox;
                        }


                    }
                }

            }
            if(opcao == 5){
                if(inicio == null){
                    System.out.println("Lista vazia");
                }else{
                    inicio = null;
                    System.out.println("Lista vazia");
                }

            }

        } while(opcao != 6);

    }




}
