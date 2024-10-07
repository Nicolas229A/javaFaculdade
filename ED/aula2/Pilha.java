package aula2;

import java.util.Scanner;

public class Pilha {

    private static class PILHA {
        public int num;
        public PILHA prox;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PILHA aux;
        PILHA topo = null;

        int op;

        do {
            System.out.println("--OPCOES--\n");
            System.out.println("1 - Inserir na pilha");
            System.out.println("2 - Consultar toda a pilha");
            System.out.println("3 - Remover da pilha");
            System.out.println("4 - Esvaziar a pilha");
            System.out.println("5 - Sair\n");

            op = scanner.nextInt();

            if (op < 1 || op > 5) {
                System.out.println("Opção Inválida!");
            }

            if(op == 1) {

                System.out.println("Digite o numero: \n");
                PILHA novoObjeto = new PILHA();
                novoObjeto.num = scanner.nextInt();

                novoObjeto.prox = topo;
                topo = novoObjeto;

                System.out.println("Numero inserido: ");
            }

        } while (op != 5);
    }
}
