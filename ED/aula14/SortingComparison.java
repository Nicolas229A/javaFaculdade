package aula14;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static int[] generateSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static int[] generateReversedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i - 1;
        }
        return arr;
    }

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int size = 10000;

        int[] sortedArray = generateSortedArray(size);
        int[] reversedArray = generateReversedArray(size);
        int[] randomArray = generateRandomArray(size);

        System.out.println("Testing Bubble Sort:");
        testSortingAlgorithm("Sorted Array", sortedArray.clone(), SortingComparison::bubbleSort);
        testSortingAlgorithm("Reversed Array", reversedArray.clone(), SortingComparison::bubbleSort);
        testSortingAlgorithm("Random Array", randomArray.clone(), SortingComparison::bubbleSort);

        System.out.println("\nTesting Insertion Sort:");
        testSortingAlgorithm("Sorted Array", sortedArray.clone(), SortingComparison::insertionSort);
        testSortingAlgorithm("Reversed Array", reversedArray.clone(), SortingComparison::insertionSort);
        testSortingAlgorithm("Random Array", randomArray.clone(), SortingComparison::insertionSort);

        System.out.println("\nTesting Selection Sort:");
        testSortingAlgorithm("Sorted Array", sortedArray.clone(), SortingComparison::selectionSort);
        testSortingAlgorithm("Reversed Array", reversedArray.clone(), SortingComparison::selectionSort);
        testSortingAlgorithm("Random Array", randomArray.clone(), SortingComparison::selectionSort);

        System.out.println("\nTesting Merge Sort:");
        testSortingAlgorithm("Sorted Array", sortedArray.clone(), (arr) -> mergeSort(arr, 0, arr.length - 1));
        testSortingAlgorithm("Reversed Array", reversedArray.clone(), (arr) -> mergeSort(arr, 0, arr.length - 1));
        testSortingAlgorithm("Random Array", randomArray.clone(), (arr) -> mergeSort(arr, 0, arr.length - 1));

        System.out.println("\nTesting Quick Sort:");
        testSortingAlgorithm("Sorted Array", sortedArray.clone(), (arr) -> quickSort(arr, 0, arr.length - 1));
        testSortingAlgorithm("Reversed Array", reversedArray.clone(), (arr) -> quickSort(arr, 0, arr.length - 1));
        testSortingAlgorithm("Random Array", randomArray.clone(), (arr) -> quickSort(arr, 0, arr.length - 1));
    }

    public static void testSortingAlgorithm(String arrayType, int[] arr, SortingAlgorithm algorithm) {
        long t;

        t = System.nanoTime();
        algorithm.sort(arr);
        t = System.nanoTime() - t;
        System.out.println("Time to sort " + arrayType + ": " + t + " ns");
    }

    @FunctionalInterface
    interface SortingAlgorithm {
        void sort(int[] arr);
    }
}
