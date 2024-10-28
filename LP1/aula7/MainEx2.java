package aula7;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MainEx2 {
    public static void main(String[] args) {

        ArrayList<Carro> carros = new ArrayList<>();
        Oficina oficina1 = new Oficina("Thales Del Banco", 5, carros);
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA ===");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Listar Carros");
            System.out.println("3. Listar todos os carros arrumados");
            System.out.println("4. Listar todos os carros estragados");
            System.out.println("5. Arrumar um Carro identificado pelo id");
            System.out.println("6. Remover um carro pelo id");
            System.out.println("7. Remover um carro");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 0:
                    System.out.println("Tchau!");
                    break;

                case 1:
                    int id, ano;
                    String nome;
                    double valor;
                    boolean arrumado = true;

                    System.out.println("Qual o id do carro? ");
                    id = scanner.nextInt();
                    System.out.println("Qual o nome do carro? ");
                    nome = scanner.next();
                    System.out.println("Em que ano esse carro foi lançado? ");
                    ano = scanner.nextInt();
                    System.out.println("Quanto esse carro custa? ");
                    valor = scanner.nextDouble();
                    System.out.println("O carro está arrumado? Responda com (S/N) ");
                    if(Objects.equals(scanner.next(), "S")) {
                        arrumado = true;
                    } else if (Objects.equals(scanner.next(), "N")) {
                        arrumado = false;
                    } else {
                        System.out.println("Opção Inválida!");
                    }

                    carros.add(new Carro(id, nome, ano, valor, arrumado));

                    break;

                case 2:
                    oficina1.listar();
                    break;

                case 3:
                    oficina1.listarArrumados();
                    break;

                case 4:
                    oficina1.listarEstragados();
                    break;

                case 5:
                    int localizaId;
                    System.out.println("Qual o id do carro que deseja arrumar? ");
                    localizaId = scanner.nextInt();
                    oficina1.arrumarCarro(localizaId);
                    break;

                case 6:
                    int localizaId2;
                    System.out.println("Qual o id do carro que deseja remover? ");
                    localizaId2 = scanner.nextInt();
                    oficina1.removerCarro(localizaId2);
                    break;

                case 7:
                    int idR, anoR;
                    String nomeR;
                    double valorR;
                    boolean arrumadoR = true;

                    System.out.println("Qual o id do carro? ");
                    idR = scanner.nextInt();
                    System.out.println("Qual o nome do carro? ");
                    nomeR = scanner.next();
                    System.out.println("Em que ano esse carro foi lançado? ");
                    anoR = scanner.nextInt();
                    System.out.println("Quanto esse carro custa? ");
                    valorR = scanner.nextDouble();
                    System.out.println("O carro está arrumado? Responda com (S/N) ");
                    if(Objects.equals(scanner.next(), "S")) {
                        arrumadoR = true;
                    } else if (Objects.equals(scanner.next(), "N")) {
                        arrumadoR = false;
                    } else {
                        System.out.println("Opção Inválida!");
                    }

                    Carro carroRemover = new Carro(idR, nomeR, anoR, valorR, arrumadoR);

                    for (Carro c : carros) {
                        if (carroRemover.equals(c)) {
                            carros.remove(c);
                            System.out.println("Carro removido!");
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
