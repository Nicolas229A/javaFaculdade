package aula12.exercicio2;

public class Soma extends OperacaoMatematica{

    public Soma(int x, int y) {
        super.x = x;
        super.y = y;
    }

    @Override
    public int calcula() {
        return x + y;
    }
}
