package aula12.exercicio1;

public class Natal extends CartaoWeb{

    public Natal(String dest) {
        super.destinatario = dest;
    }
    @Override
    public void showMessage() {
        System.out.println(super.destinatario + ", FELIZ NATAL!!");
    }
}
