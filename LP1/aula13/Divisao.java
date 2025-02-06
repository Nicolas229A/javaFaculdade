package aula13;

public class Divisao {
    public double calcula(int a, int b) throws ArithmeticException{
        return a / b;
    }

    public static void main(String[] args) {
        Divisao d = new Divisao();

        try{
            d.calcula(2, 0);
        }catch(ArithmeticException a){
            System.out.println(a.getMessage());
        }
    }
}
