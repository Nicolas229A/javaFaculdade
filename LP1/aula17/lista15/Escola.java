package aula17.lista15;

import java.util.ArrayList;

public class Escola implements Mediavel{
    public ArrayList<Aluno> alunos;

    public Escola () {}

    public Escola(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public float media() {

        if (alunos.isEmpty()) {
            return 0;
        } else {
            int somaMedias = 0;

            for (Aluno a : alunos) {
                somaMedias += a.getIdade();
            }

            return (float) somaMedias / alunos.size();
        }
    }

    public void adicionarAluno (Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAluno () {
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-8s %-8s %-8s\n", "Aluno", "Idade", "Nota1", "Nota2", "Média");
        System.out.println("----------------------------------------------------------------");

        for (Aluno aluno : alunos) {
            System.out.printf("%-20s %-10d %-8.1f %-8.1f %-8.1f\n",
                    aluno.getNome(), aluno.getIdade(), aluno.getNota1(), aluno.getNota2(), aluno.media());
        }
    }
}
