package aula1;

import java.util.Scanner;

public class Exercicio2 {
    
    public static String[] abaixoAcimaMedia (double[] notaEstudantes) {
        int soma = 0;
        for (int i = 0; i < notaEstudantes.length; i++) {
            soma += notaEstudantes[i];
        }
        
        double media = soma / notaEstudantes.length;
       
        String[] resultado = new String[notaEstudantes.length];
        
        for (int i = 0; i < notaEstudantes.length; i++) {
            if (notaEstudantes[i] > media) {
                resultado[i] = "Esta ACIMA da media";
            } else if (notaEstudantes[i] < media) {
                resultado[i] = "Esta ABAIXO da media";
            } else if (notaEstudantes[i] == media) {
                resultado[i] = "Esta NA media";
            }
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        double[] notas = new double[10];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Qual a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }
        
        String[] resultado = abaixoAcimaMedia(notas);
        
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }
}
