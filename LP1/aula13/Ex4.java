package aula13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
    public double calcula(int a, int b) throws ArithmeticException{
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        Divisao d = new Divisao();

        try {
            System.out.println("Entre um número: ");
            x = scanner.nextInt();
            System.out.println("Entre outro número: ");
            y = scanner.nextInt();
            try {
                d.calcula(x, y);
            } catch (ArithmeticException a) {
                System.out.println(a.getMessage());
                System.out.println("Erro aritmético!");
            }
        }catch(InputMismatchException b){
            System.out.println(b.getMessage());
            System.out.println("Tipo de variável está errado!");
        }
    }
}
