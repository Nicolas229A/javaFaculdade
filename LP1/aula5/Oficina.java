package aula5;

public class Oficina {
    private String nome;
    private int quantidadeCarros;
    public CarroAula5[] car;

    public Oficina(String nome, int quantidadeCarros) {
        this.nome = nome;
        this.quantidadeCarros = quantidadeCarros;
        car = new CarroAula5[quantidadeCarros];
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

    public CarroAula5[] getCar() {
        return car;
    }

    public void setCar(CarroAula5[] car) {
        this.car = car;
    }

    public void listar () {
        for (int i = 0; i < getQuantidadeCarros(); i++) {
            System.out.println(this.car[i]);
        }
    }

    public void listarArrumados () {
        for (int i = 0; i < getQuantidadeCarros(); i++) {
            if (this.car[i].isArrumado()) {
                System.out.println(this.car[i]);
            }
        }
    }

    public void listarEstragados () {
        for (int i = 0; i < getQuantidadeCarros(); i++) {
            if (!this.car[i].isArrumado()) {
                System.out.println(this.car[i]);
            }
        }
    }
}
