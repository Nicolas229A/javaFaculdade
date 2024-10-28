package aula5;

public class MainEx2 {
    public static void main(String[] args) {
        Oficina off = new Oficina("Oficina do Thales", 6);
        off.car[0] = new CarroAula5("Carro 0", 2018, 10000.00, true);
        off.car[1] = new CarroAula5("Carro 1", 2019, 20000.00, true);
        off.car[2] = new CarroAula5("Carro 2", 2020, 30000.00, true);
        off.car[3] = new CarroAula5("Carro 3", 2021, 40000.00, true);
        off.car[4] = new CarroAula5("Carro 4", 2022, 50000.00, true);
        off.car[5] = new CarroAula5("Carro 5", 2023, 60000.00, true);

        off.car[4].estragado();
        off.car[5].estragado();

        off.listar();
        System.out.println();
        off.listarArrumados();
        System.out.println();
        off.listarEstragados();
    }
}
