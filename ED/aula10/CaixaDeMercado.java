package aula10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CaixaDeMercado {
    public static void main(String[] args) {
        Pessoa primeiroDaFila = null;
        Pessoa ultimoDaFila = null;
        Pessoa fiscalDessaFila = null;

        Produto produtoNoTopo = null; //SS

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n=== Sistema do Mercado ===");
            System.out.println("1. Inserir uma pessoa na fila do caixa");
            System.out.println("2. Listar a fila do caixa");
            System.out.println("3. Pagar a compra");
            System.out.println("4. Ir embora");

            opcao = scanner.nextInt();

        switch (opcao) {

            case 1:
                Pessoa novaPessoa = new Pessoa();
                System.out.println("Informe o codigo: ");
                novaPessoa.codigo = scanner.nextInt();
                System.out.println("Informe o nome: ");
                novaPessoa.nome = scanner.next();
                System.out.println("Informe o saldo: ");
                novaPessoa.saldo = scanner.nextDouble();
                novaPessoa.proxima = null;

                if (primeiroDaFila == null) {
                    primeiroDaFila = novaPessoa;
                    ultimoDaFila = novaPessoa;

                } else {
                    ultimoDaFila.proxima = novaPessoa;
                    ultimoDaFila = novaPessoa;
                }

                System.out.println("Quantos produtos você comprou? ");
                int numProdutos = scanner.nextInt();
                for (int i = 0; i < numProdutos; i++) {

                    Produto novoProduto = new Produto();
                    System.out.println("Informe o código do produto: ");
                    novoProduto.codigo = scanner.nextInt();
                    System.out.println("Informe o nome do produto: ");
                    novoProduto.nome = scanner.next();
                    System.out.println("Informe o preco do produto: ");
                    novoProduto.preco = scanner.nextDouble();

                    novoProduto.paraBaixo = novaPessoa.produtos; //SS
                    novaPessoa.produtos = novoProduto;
                }

                System.out.println(novaPessoa.nome + " inserido(a) na fila");
                break;

            case 2:
                if (primeiroDaFila == null) {
                    System.out.println("Não tem ninguém na fila");
                } else {
                    fiscalDessaFila = primeiroDaFila;
                    while (fiscalDessaFila != null) {
                        System.out.println("INFORMAÇÕES DA PESSOA: ");
                        System.out.println("Código: " + fiscalDessaFila.codigo);
                        System.out.println("Nome: " + fiscalDessaFila.nome);
                        System.out.println("Saldo: " + fiscalDessaFila.saldo);

                        Produto maquininhaDoCaixa = fiscalDessaFila.produtos;
                        double totalCompra = 0;

                        if (maquininhaDoCaixa == null) {
                            System.out.println("Carrinho vazio!");
                        } else {
                            while (maquininhaDoCaixa != null) {
                                System.out.println("INFORMAÇÕES DO(S) PRODUTOS: ");
                                System.out.println("Código: " + maquininhaDoCaixa.codigo);
                                System.out.println("Nome: " + maquininhaDoCaixa.nome);
                                System.out.println("Preço: " + maquininhaDoCaixa.preco);
                                totalCompra+= maquininhaDoCaixa.preco;
                                maquininhaDoCaixa = maquininhaDoCaixa.paraBaixo;
                            }
                            System.out.println("Valor total da compra: " + totalCompra);
                        }
                        System.out.println("======");
                        fiscalDessaFila = fiscalDessaFila.proxima;
                    }
                }
                break;

            case 3:
                if (primeiroDaFila == null) {
                    System.out.println("A Fila está vazia!");
                } else {
                    Pessoa pessoaAtual = primeiroDaFila;
                    double totalCompra = 0;

                    Produto maquininhaDoCaixa = pessoaAtual.produtos;
                    while (maquininhaDoCaixa != null) {
                        totalCompra+=maquininhaDoCaixa.preco;
                        maquininhaDoCaixa = maquininhaDoCaixa.paraBaixo;
                    }

                    pessoaAtual.saldo -= totalCompra;
                    System.out.println(pessoaAtual.nome + " pagou " + totalCompra + ". Saldo restante: " + pessoaAtual.saldo);

                    primeiroDaFila = primeiroDaFila.proxima;

                    if (primeiroDaFila == null) {
                        ultimoDaFila = null;
                    }
                }
                break;

            default:
                System.out.println("Opção Inválida!");
        }


    } while (opcao != 4);
    }
}
