package aula12.exercicio1;

public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados (String dest) {
        super.destinatario = dest;
    }
    @Override
    public void showMessage() {
        System.out.println(super.destinatario + ", AMO VOCÊ <3");
    }
}
