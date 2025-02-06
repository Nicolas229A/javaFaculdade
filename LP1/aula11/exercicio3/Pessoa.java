package aula11.exercicio3;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private double salario;
    private double altura;

    public Pessoa() {}

    public Pessoa(String nome, double salario, double altura) {
        this.nome = nome;
        this.salario = salario;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "\nPessoa{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa p) {
        return this.nome.compareTo(p.getNome());
    }
}
