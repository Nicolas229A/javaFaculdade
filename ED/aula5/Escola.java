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
                        novoAluno.codigo = scanner.nextInt();

                        //Esse novo aluno está no topo da linha
                        novoAluno.alunoAbaixoDeste = alunoNoTopo;
                        alunoNoTopo = novoAluno;
                        break;

                    case 2:

                        int codigo;
                        int contTemp = 0;
                        consultor = alunoNoTopo;
                        if (alunoNoTopo == null) {
                            System.out.println("Não há alunos!");
                        } else {
                            System.out.println("Qual o código deste aluno?");
                            codigo = scanner.nextInt();
                            while (consultor != null) {
                                if (consultor.codigo == codigo) {
                                    System.out.println("Endereço de memória: " + consultor);
                                    System.out.println("Código: " + consultor.codigo);
                                    System.out.println("======");
                                    System.out.println("Cadastre a nota deste aluno");
                                    consultor.nota = scanner.nextDouble();
                                    contTemp++;
                                }
                                    consultor = consultor.alunoAbaixoDeste;
                            }
                            if (contTemp == 0) {
                                System.out.println("Esse aluno não está cadastrado!");
                            }
                        }
                        break;

                    case 3:

                        double somaDasNotas = 0;
                        int numeroDeAlunos = 0;
                        consultor = alunoNoTopo;
                        if (alunoNoTopo == null) {
                            System.out.println("Não há alunos!");
                        } else {
                            while (consultor != null) {
                                if (consultor.nota != 0) {
                                    somaDasNotas += consultor.nota;
                                    numeroDeAlunos++;
                                }
                                    consultor = consultor.alunoAbaixoDeste;
                                }
                            }
                        if (numeroDeAlunos > 0) {
                            System.out.println("A Média das notas é: " + somaDasNotas / numeroDeAlunos);
                        } else  {
                            System.out.println("Não há alunos com notas cadastradas!");
                        }
                        break;

                    case 4:
                        consultor = alunoNoTopo;
                        if (alunoNoTopo == null) {
                            System.out.println("Não há alunos!");
                        } else {
                            while (consultor != null) {
                                    System.out.println("Endereço de memória: " + consultor);
                                    System.out.println("Código: " + consultor.codigo);
                                    System.out.println("Nota: " + consultor.nota);
                                    System.out.println("======");
                                    consultor = consultor.alunoAbaixoDeste;
                                }
                            }
                        break;

                    case 5:
                        int codigo2;
                        int contTemp2 = 0;
                        consultor = alunoNoTopo;
                        if (alunoNoTopo == null) {
                            System.out.println("Não há alunos!");
                        } else {
                            System.out.println("Qual o código deste aluno?");
                            codigo2 = scanner.nextInt();
                            while (consultor != null) {
                                if (consultor.codigo == codigo2) {
                                    System.out.println("Aluno está cadastrado!");
                                    contTemp2++;
                                }
                                consultor = consultor.alunoAbaixoDeste;
                            }
                            if (contTemp2 == 0) {
                                System.out.println("Esse aluno não está cadastrado!");
                            }
                        }
                        break;

                    case 6:
                        if (alunoNoTopo == null) {
                            System.out.println("Todos os alunos JÁ foram excluídos!");
                        } else {
                            alunoNoTopo = alunoNoTopo.alunoAbaixoDeste;
                        }
                        break;
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

