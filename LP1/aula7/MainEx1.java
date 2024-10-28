package aula7;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEx1 {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA ===");
            System.out.println("1. Cadastrar Estudante");
            System.out.println("2. Imprimir Estudantes");
            System.out.println("3. Quantidade de Estudantes");
            System.out.println("4. Média geral da disciplina");
            System.out.println("5. Remover um Estudante");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 0:
                    System.out.println("Tchau!");
                    break;

                case 1:
                    String nome;
                    double renda, media;
                    System.out.println("Qual o nome do estudante? ");
                    nome = scanner.next();
                    System.out.println("Qual a renda do estudante? ");
                    renda = scanner.nextDouble();
                    System.out.println("Qual a média desse estudante? ");
                    media = scanner.nextDouble();
                    alunos.add(new Aluno(nome, renda, media));
                    break;

                case 2:
                    for (Aluno a : alunos) {
                        System.out.println(a);
                    }
                    break;

                case 3:
                    System.out.println("Há " + alunos.size() + " estudantes cadastrados!");
                    break;

                case 4:
                    double somaMedias = 0;
                    for (Aluno a : alunos) {
                        somaMedias = somaMedias + a.getMedia();
                    }
                    System.out.println("A média geral da disciplina é: " + somaMedias / alunos.size());
                    break;

                case 5:
                    String nomeR;
                    double rendaR, mediaR;
                    System.out.println("Qual o nome do estudante? ");
                    nomeR = scanner.next();
                    System.out.println("Qual a renda do estudante? ");
                    rendaR = scanner.nextDouble();
                    System.out.println("Qual a média desse estudante? ");
                    mediaR = scanner.nextDouble();

                    Aluno alunoRemover = new Aluno(nomeR, rendaR, mediaR);

                    for (Aluno a : alunos) {
                        if (alunoRemover.equals(a)) {
                            alunos.remove(a);
                            System.out.println("Aluno removido!");
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
