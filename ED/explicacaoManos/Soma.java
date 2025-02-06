package explicacaoManos;

import java.util.Scanner;

// Classe principal do programa que soma dois números absurdamente grandes.
public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para capturar entrada do usuário.

        // Declaração de variáveis para a lista do primeiro número absurdo.
        Caracter auxiliador1; // Ponteiro auxiliar para percorrer a lista.
        Caracter primeiro1 = null; // Aponta para o primeiro nó da lista.
        Caracter ultimo1 = null; // Aponta para o último nó da lista.
        Caracter anterior1; // Usado para manipulação dos nós.

        // Declaração de variáveis para a lista do segundo número absurdo.
        Caracter auxiliador2;
        Caracter primeiro2 = null;
        Caracter ultimo2 = null;
        Caracter anterior2;

        // Declaração de variáveis para a lista que armazenará o resultado da soma.
        Caracter auxiliador3;
        Caracter primeiro3 = null;
        Caracter ultimo3 = null;
        Caracter anterior3;

        // Declaração de variáveis para armazenar os números como strings.
        String na1;
        int tamanhoNa1;

        String na2;
        int tamanhoNa2;

        String na3;
        int tamanhoNa3;

        int opcao; // Armazena a opção selecionada pelo usuário.

        do {
            // Exibe o menu de opções.
            System.out.println(" -- PROGRAMA DE SOMA -- ");
            System.out.println("OPÇÃO 1 -- Ler primeiro número absurdo");
            System.out.println("OPÇÃO 2 -- Ler segundo número absurdo");
            System.out.println("OPÇÃO 3 -- Resultado da soma entre os dois");

            opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário.

            switch(opcao) {

                case 1:
                    System.out.println("Insira o primeiro número absurdo");
                    na1 = scanner.next(); // Lê o primeiro número absurdo.
                    tamanhoNa1 = na1.length(); // Calcula o tamanho da string.

                    // Converte cada caractere do número em um nó da lista encadeada.
                    for (int i = 0; i < tamanhoNa1; i++) {
                        Caracter novo = new Caracter(); // Cria um novo nó.
                        novo.carc = na1.charAt(i); // Armazena o caractere.
                        novo.valor = Character.getNumericValue(novo.carc); // Converte para número.

                        // Adiciona o nó ao início da lista.
                        if (primeiro1 == null) {
                            primeiro1 = novo; // Inicializa o primeiro nó da lista.
                            ultimo1 = novo; // Define o último nó (apenas um nó no momento).
                            novo.proximo = null; // Aponta para nada, pois é o único nó.
                        } else {
                            novo.proximo = primeiro1; // Liga o novo nó ao início da lista.
                            primeiro1 = novo; // Atualiza o início da lista.
                        }
                        System.out.print(novo.valor); // Imprime o valor para visualização.
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Insira o segundo número absurdo");
                    na2 = scanner.next(); // Lê o segundo número absurdo.
                    tamanhoNa2 = na2.length();

                    for (int i = 0; i < tamanhoNa2; i++) {
                        Caracter novo = new Caracter();
                        novo.carc = na2.charAt(i);
                        novo.valor = Character.getNumericValue(novo.carc);

                        // Adiciona o nó ao início da lista do segundo número.
                        if (primeiro2 == null) {
                            primeiro2 = novo;
                            ultimo2 = novo;
                            novo.proximo = null;
                        } else {
                            novo.proximo = primeiro2;
                            primeiro2 = novo;
                        }
                        System.out.print(novo.valor);
                    }
                    System.out.println();
                    break;

                case 3:
                    // Prepara auxiliares para percorrer as listas dos dois números.
                    auxiliador1 = primeiro1;
                    auxiliador2 = primeiro2;

                    int levaUm = 0; // Guarda o "vai um" para somas que resultam em valores maiores que 9.

                    // Loop para somar cada dígito dos números absurdos.
                    while (auxiliador1 != null || auxiliador2 != null) {

                        int valor1 = 0; // Valor do dígito da lista 1, 0 se a lista acabou.
                        if (auxiliador1 != null) {
                            valor1 = auxiliador1.valor;
                            auxiliador1 = auxiliador1.proximo;
                        }

                        int valor2 = 0; // Valor do dígito da lista 2, 0 se a lista acabou.
                        if (auxiliador2 != null) {
                            valor2 = auxiliador2.valor;
                            auxiliador2 = auxiliador2.proximo;
                        }

                        int soma = valor1 + valor2 + levaUm; // Soma os valores e o "vai um".
                        levaUm = soma / 10; // Calcula o novo "vai um".
                        soma = soma % 10; // Mantém o dígito da unidade.

                        Caracter novo = new Caracter();
                        novo.valor = soma; // Armazena o resultado em um novo nó.

                        if (primeiro3 == null) { // Inicializa a lista de resultado.
                            primeiro3 = novo;
                            ultimo3 = novo;
                        } else {
                            ultimo3.proximo = novo; // Liga o nó ao final da lista.
                            ultimo3 = novo;
                        }
                    }

                    // Adiciona o último "vai um" à lista, se existir.
                    if (levaUm > 0) {
                        Caracter novo = new Caracter();
                        novo.valor = levaUm;
                        ultimo3.proximo = novo;
                        ultimo3 = novo;
                    }

                    StringBuilder resultado = new StringBuilder(); // Monta o resultado como string.
                    auxiliador3 = primeiro3;
                    while (auxiliador3 != null) {
                        resultado.insert(0, auxiliador3.valor); // Insere o valor no início.
                        auxiliador3 = auxiliador3.proximo;
                    }
                    System.out.println(resultado.toString()); // Imprime o resultado final.
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }

        } while (opcao != 3); // Sai do loop ao escolher a opção 3.
    }
}
