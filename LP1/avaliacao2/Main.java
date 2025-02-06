package avaliacao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alugavel> bens = new ArrayList<>();
        Empresa monopolioDoThales = new Empresa(bens);

        int op;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar Imóvel");
            System.out.println("2 - Adicionar Apartamento");
            System.out.println("3 - Adicionar Carro");
            System.out.println("4 - Listar Bens");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    String endereco, tipoImovel = null;

                    System.out.println("Onde ficá este imóvel? ");
                    endereco = scanner.nextLine();
                    
                    boolean tipoValido = false;
                    while (!tipoValido) {
                        System.out.println("Qual o tipo deste imóvel? Pequeno, Médio (não use acento) ou Grande");
                        tipoImovel = scanner.next().toLowerCase();

                        if (tipoImovel.equals("pequeno") || tipoImovel.equals("medio") || tipoImovel.equals("grande")) {
                            tipoValido = true;
                        } else {
                            System.out.println("Tipo Inválido! Tente novamente...");
                        }
                    }

                    Imovel imovel = new Imovel(endereco, tipoImovel);

                    monopolioDoThales.adicionarBens(imovel);
                    break;
                case 2:
                    String endereco2, tipoApartamento = null;
                    double taxaCondominio;

                    System.out.println("Onde fica este apartamento? ");
                    endereco2 = scanner.nextLine();

                    boolean tipoValido2 = false;
                    while (!tipoValido2) {
                        System.out.println("Qual o tipo deste apartamento? Pequeno, Médio (não use acento) ou Grande");
                        tipoApartamento = scanner.next().toLowerCase();

                        if (tipoApartamento.equals("pequeno") || tipoApartamento.equals("medio") || tipoApartamento.equals("grande")) {
                            tipoValido2 = true;
                        } else {
                            System.out.println("Tipo Inválido! Tente novamente...");
                        }
                    }

                    System.out.println("Qual o valor da taxa de condomínio? ");
                    taxaCondominio = scanner.nextDouble();

                    Apartamento apartamento = new Apartamento(endereco2, tipoApartamento, taxaCondominio);

                    monopolioDoThales.adicionarBens(apartamento);
                    break;
                case 3:
                    String modelo, tipoCarro = null;

                    System.out.println("Qual o modelo deste carro? ");
                    modelo = scanner.nextLine();

                    boolean tipoValido3 = false;
                    while (!tipoValido3) {
                        System.out.println("Qual o tipo deste carro? Básico (não use acento), Compacto, Familiar ou Luxo");
                        tipoCarro = scanner.next().toLowerCase();

                        if (tipoCarro.equals("basico") || tipoCarro.equals("compacto") || tipoCarro.equals("familiar") || tipoCarro.equals("luxo")) {
                            tipoValido3 = true;
                        } else {
                            System.out.println("Tipo Inválido! Tente novamente...");
                        }
                    }

                    Carro carro = new Carro(modelo, tipoCarro);

                    monopolioDoThales.adicionarBens(carro);
                    break;
                case 4:
                    monopolioDoThales.listarBens();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (op != 5);

        scanner.close();
    }
}
