package pokemonBox;

import java.util.ArrayList;

public class Box {
    private String nome;
    private int quantPokemons;
    public ArrayList<Pokemon> pokemons;

    public Box () {}

    public Box(String nome, int quantPokemons, ArrayList<Pokemon> pokemons) {
        this.nome = nome;
        this.quantPokemons = quantPokemons;
        this.pokemons = pokemons;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantPokemons() {
        return quantPokemons;
    }

    public void setQuantPokemons(int quantPokemons) {
        this.quantPokemons = quantPokemons;
    }

    public void listarTodos () {
        for (Pokemon p : pokemons) {
            System.out.println(p);
        }
    }

    public void listarGen (Class<?> geracao) {
        for (Pokemon p : pokemons) {
            if (geracao.isInstance(p)) {
                System.out.println();
            }
        }
    }

    public boolean addGen1 (Gen1 gen1) {return pokemons.add(gen1);}
    public boolean addGen2 (Gen2 gen2) {return pokemons.add(gen2);}

    public void removePokemon (int numeroPokedex) {
        Pokemon encontrado = null;

        for (Pokemon p : pokemons) {
            if (p.getNumeroPokedex() == numeroPokedex) {
                encontrado = p;
                break;
            }
        }

        pokemons.remove(encontrado);
        if (encontrado == null) {
            System.out.println("Não há pokemons com este número da Pokedex na Box!");
        } else {
            System.out.println(encontrado + " foi removido da Box!");
        }
    }

    public int quantidadePokemons () {
        int contagem = 0;
        for (Pokemon p : pokemons) {
            contagem++;
        }

        return contagem;
    }

    public boolean buscarPokemon (String nome) {
        Pokemon encontrado;

        for (Pokemon p : pokemons) {
            if(p.getNome().equals(nome)) {
                encontrado = p;
                System.out.println("Pokemon encontrado: " + encontrado);
                return true;
            }
        }

        System.out.println("Pokemon NÃO encontrado");
        return false;
    }
}
