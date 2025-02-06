package aula17.lista15;

public class AlunoEspecial extends Aluno{

    public AlunoEspecial(float nota1, float nota2, int idade, String nome) {
        super(nota1, nota2, idade, nome);
    }

    @Override
    public float media() {
        return (super.getNota1() + 2 * super.getNota2()) / 3;
    }
}
