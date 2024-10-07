package aula2;

public class ExerciciosRec {
    public static int fun1(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * fun1(x, n - 1);
    }

    public static int fun2(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + fun2(a, b - 1);
    }
    public static void main(String[] args) {
        int res1 = fun1(3, 2);
        System.out.println(res1);
        int res2 = fun2(4, 3);
        System.out.println(res2);
    }
}

/*
a) Dados dois números inteiros x e n, calcular o valor de xn
. Exemplo fun(3,2) retorna
de resultado 9.
b) Construa uma função recursiva que multiplica um dado inteiro “a” por um inteiro
“b”, usando somas sucessivas. Exemplo: fun(4,3) retorna 12, pois 3+3+3+3=12.
Exemplo2: fun(3,5) retorna 15, pois 5+5+5=15.
 */
