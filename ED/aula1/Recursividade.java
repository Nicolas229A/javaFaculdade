package aula1;

public class Recursividade {
    public static void main(String[] args) {
        int n = 5;
        long res = fatorial(n);
        System.out.println("Fatorial de " + n + " : " + res);
    }
    public static long fatorial (int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
