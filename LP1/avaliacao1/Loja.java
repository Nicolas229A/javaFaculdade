package avaliacao1;

import java.util.ArrayList;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    public ArrayList<Equipamento> produtos;

    public Loja () {}

    public Loja(String nome, int quantidadeFuncionarios, ArrayList<Equipamento> produtos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void listar () {
        for (Equipamento eq : produtos) {
            System.out.println(eq);
        }
    }

    public void listarFuradeiras () {
        for (Equipamento eq : produtos) {
            if (eq instanceof Furadeira) {
                System.out.println(eq);
            }
        }
    }

    public void listarBombas () {
        for (Equipamento eq : produtos) {
            if (eq instanceof Bomba) {
                System.out.println(eq);
            }
        }
    }

    public void addFuradeira () {

    }

    public void addBomba () {

    }

    public void removeProduto (String nome) {
        Equipamento encontrado = null;

        for (Equipamento eq : produtos) {
            if (eq.getNome().equals(nome)) {
                encontrado = eq;
                break;
            }
        }
        produtos.remove(encontrado);
    }

    public void quantidadeProdutos () {

    }

//    public boolean buscaProduto (String nome) {
//
//    }
}
