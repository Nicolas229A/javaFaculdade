package aula8;

public class Main {
    public static void main(String[] args) {
        Pessoa pf1 = new PessoaFisica("James", "000-000-000-00");
        System.out.println(pf1);
        Pessoa pj1 = new PessoaJuridica("Jamal", "000-000-000-01");
        System.out.println(pj1);

        Pessoa pes[] = new Pessoa[2];

        pes[0] = pf1;
        pes[1] = pj1;

        System.out.println("Vetor: ");

        for (Pessoa p : pes) {
            System.out.println(p);
        }
    }
}
