package aula7;

import java.util.ArrayList;

public class Oficina {
    private String nome;
    private int quantidadeCarros;
    public ArrayList<Carro> car;


    public Oficina () {

    }

    public Oficina(String nome, int quantidadeCarros, ArrayList<Carro> car) {
        this.nome = nome;
        this.quantidadeCarros = quantidadeCarros;
        this.car = car;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeCarros() {
        return quantidadeCarros;
    }

    public void setQuantidadeCarros(int quantidadeCarros) {
        this.quantidadeCarros = quantidadeCarros;
    }

    public void listar () {
        for (Carro c: car) {
            System.out.println(c);
        }
    }

    public void listarArrumados () {
        for (Carro c: car) {
            if (c.isArrumado()) {
                System.out.println(c);
            }
        }
    }

    public void listarEstragados () {
        for (Carro c: car) {
            if (!c.isArrumado()) {
                System.out.println(c);
            }
        }
    }

    public void arrumarCarro (int idLocalizador) {
        for (Carro c: car) {
            if (c.getId() == idLocalizador) {
                c.arrumado();
            }
        }
    }

    public void removerCarro (int idLocalizador) {
        for (Carro c: car) {
            if (c.getId() == idLocalizador) {
                car.remove(c);
            }
        }
    }
}
