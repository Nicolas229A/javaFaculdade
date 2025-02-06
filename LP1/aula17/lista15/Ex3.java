package aula17.lista15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        Escola ifms = new Escola(alunos);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Aluno Especial");
            System.out.println("3 - Listar Notas Aluno");
            System.out.println("4 - Obter média das idades");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    String nome;
                    float nota1, nota2;
                    int idade;
                    System.out.println("Insira o nome do aluno: ");
                    nome = scanner.next();
                    System.out.println("Insira a nota 1 do aluno: ");
                    nota1 = scanner.nextFloat();
                    System.out.println("Insira a nota 2 do aluno: ");
                    nota2 = scanner.nextFloat();
                    System.out.println("Insira a idade do aluno: ");
                    idade = scanner.nextInt();

                    Aluno aluno = new Aluno(nota1, nota2, idade, nome);

                    ifms.adicionarAluno(aluno);
                    break;
                case 2:
                    String nomeE;
                    float nota1E, nota2E;
                    int idadeE;
                    System.out.println("Insira o nome do aluno: ");
                    nomeE = scanner.next();
                    System.out.println("Insira a nota 1 do aluno: ");
                    nota1E = scanner.nextFloat();
                    System.out.println("Insira a nota 2 do aluno: ");
                    nota2E = scanner.nextFloat();
                    System.out.println("Insira a idade do aluno: ");
                    idadeE = scanner.nextInt();

                    AlunoEspecial alunoEspecial = new AlunoEspecial(nota1E, nota2E, idadeE, nomeE);

                    ifms.adicionarAluno(alunoEspecial);
                    break;
                case 3:
                    ifms.listarAluno();
                    break;
                case 4:
                    System.out.println("Média de idade: " + ifms.media());
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
