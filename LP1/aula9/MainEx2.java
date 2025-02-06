package aula9;

public class MainEx2 {
    public static void main(String[] args) {
        Veiculo c1 = new Caminhao("THALES", 2008, 9);
        Veiculo o1 = new Onibus("LUCAS", 2004, 30);

        c1.exibirDados();
        o1.exibirDados();

        Caminhao c2 = new Caminhao("ENDI", 2000, 3);
        Onibus o2 = new Onibus("MURILO", 1990, 10);

        c2.exibirDados();
        o2.exibirDados();

        Veiculo[] veiculos = new Veiculo[4];

        veiculos[0] = c1;
        veiculos[1] = c2;
        veiculos[2] = o1;
        veiculos[3] = o2;

        System.out.println();
        System.out.println("Vetor: ");

        for (Veiculo v : veiculos) {
            v.exibirDados();
        }
    }
}
