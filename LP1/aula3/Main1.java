package aula3;

public class Main1 {
    public static void main(String[] args) {
        Animal a1 = new Animal("James", "Réptil", 13, 80);
        Animal a2 = new Animal("Schaffrillas", "Crustáceo", 25, 98);
        Animal a3 = new Animal("Davi", "Mamífero", 31, 76);

        int media = (a1.getPeso() + a2.getPeso() + a3.getPeso()) / 3;

        System.out.println("Média de Peso dos Animais: " + media);


    }
}
