package aula9;

import java.util.Scanner;

public class SomaDeGrandesNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Caracter auxiliador1;
        Caracter primeiro1 = null;
        Caracter ultimo1 = null;
        Caracter anterior1;

        Caracter auxiliador2;
        Caracter primeiro2 = null;
        Caracter ultimo2 = null;
        Caracter anterior2;

        Caracter auxiliador3;
        Caracter primeiro3 = null;
        Caracter ultimo3 = null;
        Caracter anterior3;

        String na1;
        int tamanhoNa1;

        String na2;
        int tamanhoNa2;

        String na3;
        int tamanhoNa3;


        System.out.println("Insira o primeiro número absurdo:");
        na1 = scanner.next();
        tamanhoNa1 = na1.length();

        for (int i = 0; i < tamanhoNa1; i++) {
            Caracter novo = new Caracter();
            novo.carc = na1.charAt(i);
            novo.valor = Character.getNumericValue(novo.carc);

            if (primeiro1 == null) {
                primeiro1 = novo;
                ultimo1 = novo;
                novo.proximo = null;
            } else {
                novo.proximo = primeiro1;
                primeiro1 = novo;
            }
//            System.out.print(novo.valor);
        }

        System.out.println("Insira o segundo número absurdo:");
        na2 = scanner.next();
        tamanhoNa2 = na2.length();
        for (int i = 0; i < tamanhoNa2; i++) {
            Caracter novo = new Caracter();
            novo.carc = na2.charAt(i);
            novo.valor = Character.getNumericValue(novo.carc);

            if (primeiro2 == null) {
                primeiro2 = novo;
                ultimo2 = novo;
                novo.proximo = null;
            } else {
                novo.proximo = primeiro2;
                primeiro2 = novo;
            }
//            System.out.print(novo.valor);
        }

        auxiliador1 = primeiro1;
        auxiliador2 = primeiro2;

        int levaUm = 0;

        while (auxiliador1 != null || auxiliador2 != null) {

            int valor1 = 0;
            if (auxiliador1 != null) {
                valor1 = auxiliador1.valor;
                auxiliador1 = auxiliador1.proximo;
            }

            int valor2 = 0;
            if (auxiliador2 != null) {
                valor2 = auxiliador2.valor;
                auxiliador2 = auxiliador2.proximo;
            }

            int soma = valor1 + valor2 + levaUm;
            levaUm = soma / 10;
            soma = soma % 10;

            Caracter novo = new Caracter();
            novo.valor = soma;

            if (primeiro3 == null) {
                primeiro3 = novo;
                ultimo3 = novo;
            } else {
                ultimo3.proximo = novo;
                ultimo3 = novo;
            }
        }

        if (levaUm > 0) {
            Caracter novo = new Caracter();
            novo.valor = levaUm;
            ultimo3.proximo = novo;
            ultimo3 = novo;
        }

        StringBuilder resultado = new StringBuilder();
        auxiliador3 = primeiro3;
        while (auxiliador3 != null) {
            resultado.insert(0, auxiliador3.valor);
            auxiliador3 = auxiliador3.proximo;
        }
        System.out.println("Resultado: ");
        System.out.println(resultado.toString());
    }
}
