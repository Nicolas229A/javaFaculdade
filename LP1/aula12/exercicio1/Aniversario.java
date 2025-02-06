package aula12.exercicio1;

public class Aniversario extends CartaoWeb{

    public Aniversario(String dest) {
        super.destinatario = dest;
    }
    @Override
    public void showMessage() {
        System.out.println(super.destinatario + ", FELIZ NIVER ;)");
    }
}
