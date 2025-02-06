package aula11.exercicio1;

public class TestesFormas {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(7.6);
        Quadrado quadrado1 = new Quadrado(16);

        System.out.println("Área do Círculo: " + circulo1.area());
        System.out.println("Comprimento do Círculo: " +circulo1.comprimento());
        System.out.println("Área do Quadrado: " +quadrado1.area());
        System.out.println("Comprimento do Quadrado: " +quadrado1.comprimento());
    }
}
