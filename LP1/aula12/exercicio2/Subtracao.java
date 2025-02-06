package aula12.exercicio2;

public class Subtracao extends OperacaoMatematica{

    public Subtracao(int x, int y) {
        super.x = x;
        super.y = y;
    }

    @Override
    public int calcula() {
        return x - y;
    }
}
