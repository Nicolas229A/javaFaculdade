package aula4;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Animal[][] matrizAnimal = new Animal[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matrizAnimal.length; i++) {
            for (int j = 0; j < matrizAnimal[0].length; j++) {

                matrizAnimal[i][j] = new Animal();

                System.out.println("Escreva o nome do animal: ");
                matrizAnimal[i][j].setNome(scanner.nextLine());
                System.out.println("Escreva a espécie do animal: ");
                matrizAnimal[i][j].setEspecie(scanner.nextLine());
                System.out.println("Quantos anos seu animal tem? ");
                matrizAnimal[i][j].setIdade(scanner.nextInt());
                System.out.println("Quantos quilos seu animal pesa? ");
                matrizAnimal[i][j].setPeso(scanner.nextInt());

                scanner.nextLine();
            }
        }

        for (int i = 0; i < matrizAnimal.length; i++) {
            for (int j = 0; j < matrizAnimal[0].length; j++) {
                System.out.println(matrizAnimal[i][j].toString());
            }
        }

        int somaPeso = 0;

        for (int i = 0; i < matrizAnimal.length; i++) {
            for (int j = 0; j < matrizAnimal[0].length; j++) {
                somaPeso+=matrizAnimal[i][j].getPeso();
            }
        }

        System.out.println("Soma dos pesos: " + somaPeso);

    }
}
