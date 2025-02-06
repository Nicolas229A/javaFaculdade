package aula13;

public class Lista {

    int v[] = new int[10];
    public void preencheVetor(int x) {
        for (int i = 0; i < x; i++) {
            try {
                v[i] = i;
                System.out.println(v[i]);
            } catch (ArrayIndexOutOfBoundsException a) {
                break;
//                System.out.println(a.getMessage());
//                System.out.println("Excedida a capacidade do Vetor!!");
            }
        }
    }

    public static void main(String[] args) {

        Lista l = new Lista();

        l.preencheVetor(20);
    }
}
