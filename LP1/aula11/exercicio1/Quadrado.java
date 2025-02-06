package aula11.exercicio1;

public class Quadrado implements FormaGeometrica{

    private double lado;

    public Quadrado () {}

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return (lado * lado);
    }

    public double comprimento() {
        return lado;
    }
}
