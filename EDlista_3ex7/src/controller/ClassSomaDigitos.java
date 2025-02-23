package controller;

public class ClassSomaDigitos {
	public ClassSomaDigitos() {
		super();
	}
	public int SomaDigitos(int n) {
		int aux;
		/*(condição de parada quando n/10 é menor que 0, não é possivel diminuir
		 *  mais que isso
		 */
		if(n/10 == 0) {
			return n%10;
		}
		/*registra o resto atual para o calculo antes de diminuir n, registra 
		 * pra calculo e então chama a recursão
		 */
		else {
			aux = n%10;
			n = n/10;
			return aux + SomaDigitos(n);
		}
	}
}
