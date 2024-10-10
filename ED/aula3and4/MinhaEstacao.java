package aula3and4;

import java.util.Scanner;

public class MinhaEstacao {

	public static void main(String[] args) {
		/**
		 * Aqui, a estação está vazia, ou seja, sem nenhum vagão. E o maquinista
		 * não aponta para ninguém
		 */
		Vagao maquinista = null;
		System.out.println("Maquinista: " + maquinista);

		Vagao auditor = null;

		int op;
		do {
			System.out.println("\n=== Minha Estação ===");
			System.out.println("0. Sair");
			System.out.println("1. Comprar vagão");
			System.out.println("2. Auditar vagões");
			System.out.println("3. Vender vagão");
			System.out.println("4. Vender trem");

			Scanner entrada = new Scanner(System.in);
			op = entrada.nextInt();

			switch (op) {

				case 0:
					System.out.println("Tchau!");
					break;

				case 1:
					Vagao novoVagao = new Vagao();
					System.out.println("Informe o tipo: ");
					novoVagao.tipo = entrada.nextInt();

					novoVagao.engate = maquinista;
					maquinista = novoVagao;
					System.out.println("maquinista: "+maquinista);
					System.out.println("maquinista.engate: "+maquinista.engate);
					break;

				case 2:
					auditor = maquinista;
					if (maquinista == null)
						System.out.println("Todos os vagões foram vendidos!");
					else
					{
						while (auditor != null) {
							System.out.println("endereço: "+auditor);
							System.out.println("tipo: "+auditor.tipo);
							System.out.println("======");
							auditor = auditor.engate;
						}
					}
					break;

				case 3:
					if (maquinista == null)
						System.out.println("Todos os vagões foram vendidos!");
					else
						maquinista = maquinista.engate;
					break;

				case 4:
					maquinista = null;
					System.out.println("Todos os vagões foram vendidos!");
					break;

				default:
					System.out.println("Opção inválida!");
			}

		}while(op!=0);

	}

}

