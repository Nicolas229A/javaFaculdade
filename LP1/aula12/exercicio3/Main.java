package aula12.exercicio3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcs = new ArrayList<>();

        Funcionario f1 = new Gerente("Carlos", 10000.00);
        Funcionario f2 = new Programador("James", 100.00);

        funcs.add(f1);
        funcs.add(f2);

        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println(
                      "1- Imprimir dados.\n"
                    + "2 - Aumentar salário.\n"
                    + "0 – Sair."
            );
            op = scanner.nextInt();

            if (op == 1) {

                    for (Funcionario f : funcs) {
                        System.out.println(f.toString());
                    }

            } else if (op == 2) {

                    System.out.println("Deseja aumentar o salario do Programador ou do Gerente? (Escreva 'Programador' ou 'Gerente')");
                    String resposta = scanner.next();
                    if (Objects.equals(resposta, "Programador")) {
                        f2.aumentaSalario();
                    }
                    if (Objects.equals(resposta, "Gerente")) {
                        f1.aumentaSalario();
                    }

            } else if (op == 0) {

                    System.out.println("Tchau!");

            } else {

                    System.out.println("Opção Inválida!");

            }

        } while (op != 0);
    }
}
