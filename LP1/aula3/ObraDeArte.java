package aula3;

public class ObraDeArte {

    private int id;
    private String nome;
    private String autor;
    private String localizacao;
    private double valor;
    private int ano;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ObraDeArte() {

    }

    public ObraDeArte(int id, String nome, String autor, String localizacao, double valor, int ano) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.localizacao = localizacao;
        this.valor = valor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "ObraDeArte{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", valor=" + valor +
                ", ano=" + ano +
                '}';
    }
}
