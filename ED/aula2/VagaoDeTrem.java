package aula2;

public class VagaoDeTrem {

    public static class Vagao {
        public int rodas;
        public int janelas;
        public Vagao proximoVagao;
    }

    public static void main(String[] args) {
        Vagao maquinista = new Vagao();
        maquinista = null;

        Vagao v1 = new Vagao();
        v1.rodas = 6;
        v1.janelas = 4;
//        v1.proximoVagao = null;

        maquinista = v1;


        Vagao v2 = new Vagao();
        v2.rodas = 6;
        v2.janelas = 4;
        v2.proximoVagao = v1;

        maquinista = v2;

        Vagao v3 = new Vagao();
        v3.rodas = 6;
        v3.janelas = 4;


        maquinista = v3;
    }

}
