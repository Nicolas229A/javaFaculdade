public class AtividadeRecursividade {

    public static long fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int potencia(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * potencia(x, n - 1);
    }

    public static int multiplicacaoRecursiva(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multiplicacaoRecursiva(a, b - 1);
    }

    public static void torreDeHanoi(int numDeDiscos, char origem, char auxiliar, char destino) {
        if (numDeDiscos == 1) {
            System.out.println("Mova o Disco 1 da Torre " + origem + " para " + destino);
        } else {
            torreDeHanoi(numDeDiscos - 1, origem, destino, auxiliar);
            System.out.println("Mova o Disco " + numDeDiscos + " da Torre " + origem + " para " + destino);
            torreDeHanoi(numDeDiscos - 1, auxiliar, origem, destino);
        }
    }

    public static void main(String[] args) {

        System.out.println("Fatorial de 7" + ": " + fatorial(7));

        System.out.println("Fibonnaci até 3: ");
        int n = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        System.out.println("4 elevado a 3: " + potencia(4,3));
        System.out.println("5 vezes 6: " + multiplicacaoRecursiva(5, 6));

        torreDeHanoi(3, 'A', 'B', 'C');
    }
}
