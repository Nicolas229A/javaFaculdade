package aula12.exercicio2;

public class Divisao extends OperacaoMatematica{

    public Divisao(int x, int y) {
        super.x = x;
        super.y = y;
    }

    @Override
    public int calcula() {
        return x / y;
    }
}
