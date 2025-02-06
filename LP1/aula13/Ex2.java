package aula13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 1, c;

        while (true) {
            try {
                System.out.print("Entre com um numero: ");
                a = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("Entrada inválida!");
                sc.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("Entre com o segundo numero: ");
                b = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("Entrada inválida!");
                sc.nextLine();
            }
        }

        try{
            c = a / b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }



    }
}
