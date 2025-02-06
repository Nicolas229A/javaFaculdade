package aula15;

public class Processo {
    private int id;
    private String descricao;

    public Processo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "[ID: " + id + ", Descrição: " + descricao + "]";
    }
}
