package aula2;

public class TestandoClasses {
    public static void main(String[] args) {
        Artista a = new Artista();
        
        a.setNome("James");
        System.out.println(a.getNome());
        
        Artista b = new Artista("Jamal", "Gunn Tunn", 987);
        
//        System.out.println(b.getNome());
//        System.out.println(b.getNomeArtistico());
//        System.out.println(b.getIdade());

        System.out.println(b.toString());
        
    }
}
