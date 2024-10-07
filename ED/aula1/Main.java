package aula1;

import java.util.Scanner;

public class Main {

//    public static int fatorial (int n) { int i, finalNumber = n; if (n == 0 || n == 1) { return 1; } for (i = n; i > 2; i--) { finalNumber = finalNumber * (i - 1); } return finalNumber; }

    public static long fatorial (int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

//    public static void fibonacci (int n) { int i, last = 1, beflast = 0; int[] numbers = new int[n]; if (n > 1) {numbers[0] = 0; numbers[1] = 1; System.out.print(numbers[0] + " "); System.out.print(numbers[1] + " "); } else {System.out.println(0);} for (i = 2; i < numbers.length; i++) { numbers[i] = last + beflast; System.out.print(numbers[i] + " "); last = numbers[i]; beflast =  numbers[i - 1]; } }

    public static int fibonacci (int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int[] ordenarVetorCrescente(int[] vetorBaguncado) {
        int temp;
        for (int i = 0; i < vetorBaguncado.length - 1; i++) {
            for (int j = 0; j < vetorBaguncado.length - 1 - i; j++) {
                if (vetorBaguncado[j] > vetorBaguncado[j + 1]) {
                    temp = vetorBaguncado[j];
                    vetorBaguncado[j] = vetorBaguncado[j + 1];
                    vetorBaguncado[j + 1] = temp;
                }
            }
        }
        return vetorBaguncado;
    }

    public static void main(String[] args) {
        int opcao = 0;
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        do {

            if (opcao == 1) {
                for (int i = 0; i < vetor.length; i++) {
                    vetor[i] = (int) (Math.random()*10);
                }
            }

            if (opcao == 2) {
                int numero, indice;


                for (int i = 0; i < vetor.length; i++) {
                    System.out.print(vetor[i] + " ");
                }
                System.out.println();
                System.out.println("Escolha um numero do indice para realizar o fatorial");
                indice = scanner.nextInt();

                numero = vetor[indice];

                long resultado = fatorial(numero);

                System.out.println("Resultado do Fatorial de " + numero + ": " + resultado);
            }

            if (opcao == 3) {
                System.out.println("Ordem do vetor ANTES de ordenar: ");
                for (int i = 0; i < vetor.length; i++) {
                    System.out.print(vetor[i] + " ");
                }
                System.out.println();
                System.out.println("Ordem do vetor DEPOIS de ordenar: ");
                ordenarVetorCrescente(vetor);
                for (int i = 0; i < vetor.length; i++) {
                    System.out.print(vetor[i] + " ");
                }
                System.out.println();

            }

            if (opcao == 3) {
                System.out.println("Ordem do vetor ANTES de ordenar: ");
                for (int i = 0; i < vetor.length; i++) {
                    System.out.print(vetor[i] + " ");
                }
                System.out.println();
                System.out.println("Ordem do vetor DEPOIS de ordenar: ");
                ordenarVetorCrescente(vetor);
                for (int i = 0; i < vetor.length; i++) {
                    System.out.print(vetor[i] + " ");
                }
                System.out.println();

            }

            if (opcao == 4) {

                int numero;

                System.out.println("Escolha um numero do indice para realizar o fatorial");
                numero = scanner.nextInt();

                System.out.println();

                fibonacci(numero);

            }

            System.out.println("Escolha uma opcao: "
                    + "\n1 - Carregar o vetor com valores"
                    + "\n2 - Fazer o fatorial do valor"
                    + "\n3 - Ordenar em ordem crescente"
                    + "\n4 - Fazer o fibonacci até o valor informado"
                    + "\n5 - Sair");


            opcao = scanner.nextInt();
        } while (opcao != 5);
    }

}