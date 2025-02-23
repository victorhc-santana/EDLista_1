package controller;

public class ClassDigitoCont {
	public ClassDigitoCont() {
		super();
	}
	public int Conta(int N) {
		/* A condição de parada é quando a divisão por 10 é igual a 10,
		 *  o que signifca que todas as centenas foram zeradas
		 */
		if (N == 0) {
			return 0;
		}
		// divide por 10 o N a fim de reduzir uma centena do numero total
		 
		else {
			N = N/10;
			return 1 + Conta(N);
		}
	}
}
