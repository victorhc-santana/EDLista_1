package somanatural;

public class Class_SomaNatural {
	public Class_SomaNatural() {
		super();
	}
	
	public int SomaN (int N) {
		//quando N chega a 0 ou é negativo, retorna 0 e finaliza a soma
		if (N <= 0) {
			return 0;
		}
		/* Diminui N em 1 para o calculo ja que 0 é numero 
		 * natural e adiciona a soma
		 */
		else {
			--N;
			return N + SomaN(N);
		}
	}
}
