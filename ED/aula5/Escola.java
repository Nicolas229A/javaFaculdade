package aula5;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        
            Aluno alunoNoTopo = null;
            Aluno consultor = null;

            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {
                System.out.println("\n=== SISTEMA DE CADASTRO DE ALUNOS DA ESCOLA ===");
                System.out.println("1. Cadastrar aluno");
                System.out.println("2. Cadastrar nota");
                System.out.println("3. Calcular média das notas dos alunos");
                System.out.println("4. Exibir todos os alunos e suas notas");
                System.out.println("5. Consultar se um aluno está cadastrado");
                System.out.println("6. Excluir aluno");
                System.out.println("7. Sair");
                

                opcao = scanner.nextInt();

                switch (opcao) {

                    case 1:
                        
                        Aluno novoAluno = new Aluno();
                        System.out.println("Qual o código do aluno? ");
//                        scanner.nextLine();
                        novoAluno.codigo = scanner.nextInt();

                        //Esse novo aluno está no topo da linha
                        novoAluno.alunoAbaixoDeste = alunoNoTopo;
                        alunoNoTopo = novoAluno;
                        break;

                    case 2:


                    case 3:


                    case 4:


                    case 5:


                    case 6:


                    case 7:
                        System.out.println("Até mais Professor!");
                        break;    

                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 7);

            scanner.close();

        }
    }

