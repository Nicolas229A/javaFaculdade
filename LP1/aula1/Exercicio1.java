package aula1;

import java.util.Scanner;

public class Exercicio1 {
    
        public static boolean divisivel (int x, int y) {
        return (x % y == 0);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero para x: ");
        int x = scanner.nextInt();
        System.out.println("Digite um numero para y: ");
        int y = scanner.nextInt();
        
        boolean verifica = divisivel(x, y);
        
        if (verifica) {
            System.out.println(x + " e divisivel por " + y);
        } else {
            System.out.println(x + " nao e divisivel por " + y);
        }
        
        System.out.println("");
       
    }
}
