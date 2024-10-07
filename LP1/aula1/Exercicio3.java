package aula1;

import java.util.Scanner;

public class Exercicio3 {
    
    public static void faces (int numeroDeJogadas) {
        int jogada;
        int[] dado = new int[6];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < numeroDeJogadas; i++) {
            //Macete nos indices do vetor
            
            System.out.println("Qual face caiu?");
            jogada = scanner.nextInt();
            
            dado[jogada - 1]++;
        }
        
        for (int i = 0; i < dado.length; i++) {
            System.out.println("Quantidade de faces " + (i + 1) + ": " + dado[i]);
        }
    }
    
    public static void main(String[] args) {
        int i, j, jogadas;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantas vezes o dado sera jogado: ");
        jogadas = scanner.nextInt();
        
        faces(jogadas);
        
    }
    
}
