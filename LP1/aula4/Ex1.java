package aula4;

public class Ex1 {
    public static void main(String[] args) {
        Animal[] vetorAnimal = new Animal[5];

        vetorAnimal[0] = new Animal("James", "Réptil", 13, 80);
        vetorAnimal[1] = new Animal("Schaffrillas", "Crustáceo", 25, 98);
        vetorAnimal[2] = new Animal("Davi", "Mamífero", 31, 76);
        vetorAnimal[3] = new Animal("Schaffrillas", "Crustáceo", 25, 98);
        vetorAnimal[4] = new Animal("Schaffrillas", "Crustáceo", 25, 98);

        for (int i = 0; i < vetorAnimal.length; i++) {
            System.out.println(vetorAnimal[i]);
        }

        double soma = 0;

        for (int i = 0; i < vetorAnimal.length; i++) {
            soma+=vetorAnimal[i].getPeso();
        }

        System.out.println("Soma: " + soma);
    }
}
