package aula9;

public class MainEx1 {
    public static void main(String[] args) {
        Pessoa pf1 = new PessoaFisica("Thales", "111.222.333-44");
        Pessoa pf2 = new PessoaFisica("Lucão", "444.333.222-11");
        Pessoa pj1 = new PessoaJuridica("Ryan", "99.888.777/0001-66");
        Pessoa pj2 = new PessoaJuridica("Endi", "66.777.888/0001-99");

        System.out.println(pf1);
        System.out.println(pf2);
        System.out.println(pj1);
        System.out.println(pj2);

        PessoaFisica pf3 = new PessoaFisica("Murilo", "555.666.777-88");
        PessoaFisica pf4 = new PessoaFisica("Nickzera", "888.777.666-55");
        PessoaJuridica pj3 = new PessoaJuridica("Yuri", "11.222.333/0001-44");
        PessoaJuridica pj4 = new PessoaJuridica("Jamal Gunn", "44.333.222/0001-11");

        System.out.println(pf3);
        System.out.println(pf4);
        System.out.println(pj3);
        System.out.println(pj4);

        Pessoa pes[] = new Pessoa[8];

        pes[0] = pf1;
        pes[1] = pf2;
        pes[2] = pf3;
        pes[3] = pf4;
        pes[4] = pj1;
        pes[5] = pj2;
        pes[6] = pj3;
        pes[7] = pj4;

        System.out.println("Vetor: ");

        for (Pessoa p : pes) {
            System.out.println(p);
        }

    }
}
