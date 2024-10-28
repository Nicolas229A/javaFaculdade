package aula5;

public class CarroAula5 {
    private String nome;
    private int ano;
    private double valor;
    private boolean arrumado;

    public CarroAula5 () {

    }

    public CarroAula5(String nome, int ano, double valor, boolean arrumado) {
        this.nome = nome;
        this.ano = ano;
        this.valor = valor;
        this.arrumado = arrumado;
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
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", valor=" + valor +
                ", arrumado=" + arrumado +
                '}';
    }

    public void arrumado () {
        this.arrumado = true;
    }
    public void estragado () {
        this.arrumado = false;
    }
}
