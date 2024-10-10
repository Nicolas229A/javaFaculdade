package aula03_estruturas_heterogêneas;

public class Teste {

	public static void main(String[] args) {
		/**
		 * Instancia novo objeto t1 a partir de ClasseTeste.
		 * t1 é um objeto que aponta para um espaço em memória
		 */
		ClasseTeste t1 = new ClasseTeste();
		System.out.println("t1: " + t1);
		/**
		 * Aqui, t1 existe, porém aponta para null, então, não referencia nenhum objeto
		 */
		//t1 = null;
		//System.out.println("t1: " + t1);
		/**
		 * Instancia novo objeto t2 a partir de ClasseTeste.
		 */
		ClasseTeste t2 = new ClasseTeste();
		System.out.println("t2: " + t2);
		/**
		 * Aqui, fizemos t1 apontar para o mesmo espaço de memória que t2
		 * O espaço de memória de t1 após ser igualado a t2, será perdido
		 */
		t1 = t2;
		System.out.println("t1: " + t1);
		System.out.println("t2: " + t2);
		/**
		 * Atribuir dados a t1, altera t2, pois ambos apontam para om mesmo endereço
		 */
		t1.id = 1;
		t1.nome = "Teste 1";
		System.out.println("t2.id: " + t2.id);
		System.out.println("t2.nome: " + t2.nome);
		/**
		 * O mesmo acontece quando passamos o objeto para uma função (método) 
		 * e esta função altera o objeto. Como se trata da referência para o objeto
		 * não é criado uma cópia, mas o próprio objeto é alterado
		 */
		alterarDados(t2);
		System.out.println("t1.id: " + t1.id);
		System.out.println("t1.nome: " + t1.nome);
		
		
		System.out.println("\n========================");
		System.out.println("========================\n");
		
		
		/**
		 * Atributos do mesmo tipo da classe 
		 */
		ClasseTeste t3 = new ClasseTeste();
		ClasseTeste t4 = new ClasseTeste();
		System.out.println("t3: " + t3);
		System.out.println("t4: " + t4);
		System.out.println("t3.proximoT: " + t3.proximoT);
		t3.proximoT = t4;
		System.out.println("t3: " + t3);
		System.out.println("t4: " + t4);
		System.out.println("t3.proximoT: " + t3.proximoT);
		t3.proximoT = null;
		System.out.println("t3: " + t3);
		System.out.println("t4: " + t4);
		System.out.println("t3.proximoT: " + t3.proximoT);
		ClasseTeste t5 = null;
		System.out.println("t5: "+t5);
		criaProximo(t5);
		System.out.println("t5: "+t5);
		System.out.println("t4: " + t4);
		System.out.println("t4.proximoT: " + t4.proximoT);
		
		
	}
	
	public static void alterarDados(ClasseTeste t) {
		t.id = 2;
		t.nome = "Teste 2";
	}
	
	private static void criaProximo(ClasseTeste t5) {
		ClasseTeste t6 = new ClasseTeste();
		t5 = t6;
		System.out.println("t5: "+t5);
	}


}
