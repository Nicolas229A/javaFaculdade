package aula9;

public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo () {}

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAno(String ano) {
        this.ano = Integer.parseInt(ano);
    }
    public void exibirDados () {
        System.out.println();
        System.out.print(

                "Veiculo{" +
                "placa='" + placa + '\'' +
                ", ano=" + ano +
                '}'
        );
    }
}
