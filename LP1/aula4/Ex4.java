package aula4;

import aula3.ObraDeArte;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        ObraDeArte[][] matrizObras = new ObraDeArte[4][2];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matrizObras.length; i++) {
            for (int j = 0; j < matrizObras[0].length; j++) {

                matrizObras[i][j] = new ObraDeArte();

                matrizObras[i][j].setId(i + j);
                System.out.println("Escreva o nome da obra: ");
                matrizObras[i][j].setNome(scanner.nextLine());
                System.out.println("Escreva o nome do autor: ");
                matrizObras[i][j].setAutor(scanner.nextLine());
                System.out.println("Onde a obra " + matrizObras[i][j].getNome() + " foi criada? ");
                matrizObras[i][j].setLocalizacao(scanner.nextLine());
                System.out.println("Quanto a obra custa? ");
                matrizObras[i][j].setValor(scanner.nextDouble());
                System.out.println("Quando a obra foi criada? ");
                matrizObras[i][j].setAno(scanner.nextInt());

                scanner.nextLine();
            }
        }

        for (int i = 0; i < matrizObras.length; i++) {
            for (int j = 0; j < matrizObras[0].length; j++) {
                System.out.println(matrizObras[i][j].toString());
            }
        }

        double somaValor = 0.0;

        for (int i = 0; i < matrizObras.length; i++) {
            for (int j = 0; j < matrizObras[0].length; j++) {
                if (i % 2 == 0) {
                    somaValor += matrizObras[i][j].getValor();
                }
            }
        }

        System.out.println("Soma dos valores das linhas pares: " + somaValor);
    }
}
