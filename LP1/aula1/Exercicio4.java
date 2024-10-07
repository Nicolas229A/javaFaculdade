package aula1;

import java.util.Scanner;

public class Exercicio4 {
    
    public static double somaLinha (double[][] matriz, int linha) {
        int i, j;
        double soma = 0;
        
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                if (i == linha) {
                    soma += matriz[i][j];
                }
            }
        }
        
        return soma;
    }
    
    public static double somaColuna (double[][] matriz, int coluna) {
        int i, j;
        double soma = 0;
        
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                if (j == coluna) {
                    soma += matriz[i][j];
                }
            }
        }
        
        return soma;
    }
    
    public static double somaDiagonalPrincipal(double[][] matriz) {
        int i, j;
        double soma = 0;
        
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }
        
        return soma;
    }
    
    public static double somaDiagonalSecundaria(double[][] matriz) {
        int i, j;
        double soma = 0;
        
          for (i = 0; i < matriz.length; ) {
            for (j = (matriz[0].length - 1); j > -1; j--) {
                soma += matriz[i][j];
                i++;
            }
        }
          
          return soma;
    }
    
    public static double somaMatrizInteira(double[][] matriz) {
        int i, j;
        double soma = 0;
        
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                    soma += matriz[i][j];
            }
        }
        
        return soma;
    }
    
    public static void imprimeMatriz (double[][] matriz) {
        int i, j;
    
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                if (j == 0) {System.out.println();}
                System.out.print(matriz[i][j] + " ");
            }
            }
        } 

    
    public static void main(String[] args) {
        int i, j;
        double[][] matriz = new double[5][5];
        Scanner scanner = new Scanner(System.in);
        
        double s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;;
        
            System.out.println("Insira os elementos da matriz " + 5 + " x " + 5 + "...");
            for (i = 0; i < matriz.length; i++) {
                for (j = 0; j < matriz[0].length; j++) {
                    matriz[i][j] = scanner.nextDouble();
                }
            }
        System.out.println("Soma Linha: " + somaLinha(matriz, 4));
        System.out.println("Soma Coluna: " + somaColuna(matriz, 2));
        System.out.println("Soma Diagonal Principal: " + somaDiagonalPrincipal(matriz));
        System.out.println("Soma Diagonal Secundaria: " + somaDiagonalSecundaria(matriz));
        System.out.println("Soma Matriz Inteira: " + somaMatrizInteira(matriz));
        
        imprimeMatriz(matriz);
    }
}
