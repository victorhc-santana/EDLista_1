package controller;

public class ClassConta {
	public ClassConta() {
		super();
	}
	public int VerificaXemN(int n_ver, int n_quant) {
		/*Condição de parada é quando a divisão por 10 é = 0, e então repete
		 * a condição para o algoritmo correto 
		 */
		if (n_ver == 0) {
			if (n_ver % 10 == n_quant) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		/* Verifica se o Resto da divisão do numero por 10 é igual o numero
		 *  que se quer contar, caso positivo retorna 1 e soma a recursãoa 
		 */
		else {
			if (n_ver % 10 == n_quant) {
				n_ver = n_ver/10;
				return 1 + VerificaXemN(n_ver, n_quant);
			}
			else {
				n_ver = n_ver/10;
				return 0 + VerificaXemN(n_ver, n_quant);
			}
		}
	}
}
