package aula12.exercicio2;

public class Multiplicacao extends OperacaoMatematica{

    public Multiplicacao(int x, int y) {
        super.x = x;
        super.y = y;
    }

    @Override
    public int calcula() {
        return x * y;
    }
}
