package controller;

public class ClassSomatoriaFatorial {
	public ClassSomatoriaFatorial() {
		super();
	}
	
	public double soma(int n) {
		// Condição de para é quando N se torna 1;
		if(n == 1) {
			return 1;
		}
		/* Calcula a soma atual chamando outra função recursiva
		 *  auxiliar e retornado diminuindo 1 de n
		 */
		else {
			return 1/ fatorial(n) + soma(n-1);
		}
	}
	
	//classe auxiliar feita para calculo da somatoria
	public double fatorial(int n) {
		//condição de parada, n = 1
		if(n == 1) {
			return 1;
		}
		// adiciona o n para a multiplicação e chama a recursão diminuindo 1 de n
		else {
			return n * fatorial(n-1);
		}
	}
}
