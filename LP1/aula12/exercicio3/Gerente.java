package aula12.exercicio3;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super.setNome(nome);
        super.setSalario(salario);
    }

    @Override
    public void aumentaSalario() {
        super.setSalario(getSalario() * 1.10);
    }
}
