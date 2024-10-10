package aula4;

public class Ex2 {
    public static void main(String[] args) {
        ObraDeArte[] vetorObras = new ObraDeArte[4];

        vetorObras[0] = new ObraDeArte(1, "O Jamal Gunn", "James Gamal", "Fortaleza, Ceará", 9800.80, 2017);
        vetorObras[1] = new ObraDeArte(2, "Thales del Banco", "Lucas Guimaro", "Campo Grande, MS", 100000.00, 2024);
        vetorObras[2] = new ObraDeArte(3, "Pemba Nenhuma", "Nicolas Valente", "Campo Grande, MS", 0.45, 2013);
        vetorObras[3] = new ObraDeArte(4, "O Jamal Gunn", "James Gamal", "Fortaleza, Ceará", 9800.80, 2017);

        for (int i = 0; i < vetorObras.length; i++) {
            System.out.println(vetorObras[i]);
        }

        double maiorValor = vetorObras[0].getValor();

        for (int i = 0; i < vetorObras.length; i++) {
            if (vetorObras[i].getValor() > maiorValor) {
                System.out.println("O valor da obra mais cara: " + vetorObras[i].getValor());
            }
        }
    }
}
