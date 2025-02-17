package menor;

public class Class_Menor {
	public Class_Menor(){
		super();	
	}
	
	public int menor(int[] vetor_ref, int tamanho) {
		/*   Condição de parada, quando o tamanho = 0 verificou todo o vetor, pega
		 *   a ultima posição do vetor que armazena o menor valor*/
		if (tamanho == 0) {
			return vetor_ref[vetor_ref.length - 1];
		}
		/*   O algoritmo começa por diminuir o numero referento ao tamanho do
		 *   vetor para verifica-lo em seguida ele verifica se a casa atual 
		 *   do vetor é menor que a ultima posição do vetor caso afirmativo
		 *   define o valor da ultima casa como o valor da casa atual e 
		 *   continua a recursão */
		else {
			tamanho = tamanho - 1;
			
			if (vetor_ref[tamanho] < vetor_ref[vetor_ref.length - 1]) {
				vetor_ref[vetor_ref.length - 1] = vetor_ref[tamanho];
			}
			
			return menor(vetor_ref, tamanho);
		}
	}

}
