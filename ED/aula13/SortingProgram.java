package aula13;

import java.util.Random;
import java.util.Scanner;

public class SortingProgram {
    public static void preencherArray(int[] array) {
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(150) + 1;
        }
    }
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];

        preencherArray(numbers);

        System.out.println("Array gerado:");
        mostrarArray(numbers);

        System.out.println("\nEscolha um algoritmo de sorteio: ");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Insertion Sort");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                bubbleSort(numbers);
                System.out.println("\nArray sorteado usando Bubble Sort:");
                break;
            case 2:
                insertionSort(numbers);
                System.out.println("\nArray sorteado usando Insertion Sort:");
                break;
            default:
                System.out.println("Opção Inválida!");
                return;
        }
        mostrarArray(numbers);

        scanner.close();
    }
}
