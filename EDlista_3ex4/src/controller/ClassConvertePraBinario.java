package controller;

public class ClassConvertePraBinario {
	public ClassConvertePraBinario() {
		super();
	}
	public String convertendo(int num) {
		//inicia string auxiliar para conversão
		String add_bin;
		
		// A condição de parada é alcançada quando a divisão do numero por dois é 0
		if (num/2 == 0) {
			add_bin = String.valueOf(num % 2);
			return add_bin ;	
		}
		
		/*Divide o numero por 2, adiciona o resto ao numero binário e diminui o 
		 * numero atual pela metade
		 */
		else {
			add_bin = String.valueOf(num % 2);
			num = num / 2;
			return add_bin + convertendo(num);
		}
		
	}
	
	//Algoritmo reutilizado do exercicio anterior
	public String Inverte(String word) {
		/*condição de parada é quando o comprimento da palavra
		 *  for menor que 0, assim chegando a primera letra da palavra
		 */
		if ((word.length()-1) < 0) {
			return word.substring((word.length()));
		}
		
		/*Retorna a ultima letra da palavra e chama recursão com a palavra 
		 * sem a ultima letra
		 */
		else {
			return word.substring((word.length() - 1)) 
					+ Inverte(word.substring(0,(word.length()-1)));
		}
	}
}
