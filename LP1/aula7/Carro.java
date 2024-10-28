package aula7;

import java.util.Objects;

public class Carro {
    private int id;
    private String nome;
    private int ano;
    private double valor;
    private boolean arrumado;

    public Carro () {

    }

    public Carro(int id, String nome, int ano, double valor, boolean arrumado) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.valor = valor;
        this.arrumado = arrumado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isArrumado() {
        return arrumado;
    }

    public void setArrumado(boolean arrumado) {
        this.arrumado = arrumado;
    }


    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                ", valor=" + valor +
                ", arrumado=" + arrumado +
                '}';
    }

    public void arrumado () {
        this.arrumado = true;
    }
    public void estragado () { this.arrumado = false; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return id == carro.id && ano == carro.ano && Double.compare(carro.valor, valor) == 0 && arrumado == carro.arrumado && Objects.equals(nome, carro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, ano, valor, arrumado);
    }
}
