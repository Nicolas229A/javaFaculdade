package aula12.exercicio3;

public class Programador extends Funcionario{

    public Programador(String nome, double salario) {
        super.setNome(nome);
        super.setSalario(salario);
    }

    @Override
    public void aumentaSalario() {
        super.setSalario(getSalario() * 1.20);
    }
}
