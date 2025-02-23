package controller;

public class ClassInvertePalavra {
	public ClassInvertePalavra() {
		super();
	}
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
