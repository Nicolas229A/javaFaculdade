package aula10t;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLista8 {

    public static void main(String[] args) {
        int op = 0;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<>();

        do {
            System.out.println("1- Cadastrar Pessoa Física.\n"
                    + "2 - Cadastrar Pessoa Jurídica.\n"
                    + "3 – Listar todas as Pessoas\n"
                    + "4 – Listar todas as Pessoas Físicas.\n"
                    + "5 – Listar todas as Pessoa Jurídica.\n"
                    + "6- Remover uma Pessoa Física pelo CPF.\n"
                    + "7 – Remover uma Pessoa Jurídica pelo CNPJ.\n"
                    + "0 – Sair.");
            op = sc.nextInt();
            switch (op) {

                case 1:
                    PessoaFisica pf = new PessoaFisica("777774" + cont, "PF" + cont++);
                    lista.add(pf);
                    break;
                case 2:
                    PessoaJuridica pj = new PessoaJuridica("999995" + cont, "PJ" + cont++);
                    lista.add(pj);
                    break;
                case 3:
                    for (Pessoa p : lista) {
                        System.out.println(p);
                    }
                    break;
                case 4:  //deve usar instanceof para verificar se eh pessoa fisica
                    for (Pessoa p : lista) {
                        if (p instanceof PessoaFisica) {
                            System.out.println(p);
                        }

                    }
                    break;
                case 5:
                    //deve usar instanceof para verificar se eh pessoa juridica
                    for (Pessoa p : lista) {
                        if (p instanceof PessoaJuridica) {
                            System.out.println(p);
                        }

                    }
                    break;
                case 6:
                    System.out.println("CPF: ");
                    String cpf = sc.next();
                    PessoaFisica encontrada = null;
                    for (Pessoa p : lista) {
                        if (p instanceof PessoaFisica) { //verifica se eh pf
                            if (((PessoaFisica) p).getCpf().equals(cpf)) { //verifica cpf
                                encontrada = (PessoaFisica) p; //guarda obj
                                break;
                            }
                        }
                    }
                    lista.remove(encontrada); //remove obj

                    break;
                case 7:
                    System.out.println("CNPJ: ");
                    String cnpj = sc.next();
                    PessoaJuridica achou = null;
                    for (Pessoa p : lista) {
                        if (p instanceof PessoaJuridica) { //verifica se eh pessoa juridica
                            if (((PessoaJuridica) p).getCnpj().equals(cnpj)) { //verifica cnpj
                                achou = (PessoaJuridica) p; //encontra obj
                                break;
                            }
                        }
                    }
                    lista.remove(achou);  //remove obj encontrado
                    break;

                case 0:
                    System.out.println("saindo");
                    break;
                default:
                    System.out.println("erradoé");
                    break;

            }
        } while (op != 0);

    }

}
