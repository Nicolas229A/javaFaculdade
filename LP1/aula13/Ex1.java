package aula13;

public class Ex1 {

    public static void main(String[] args) {
        int v[] = new int[10];
        for (int i = 0; i < 15; i++) {

            try {
                v[i] = i;
                System.out.println(v[i]);
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println(a.getMessage());
                a.printStackTrace();
                System.out.println("Problemas tecnicos!");
            }finally{
                System.out.println("sempre executa");
            }

            System.out.println("continua");
        }
    }
}
