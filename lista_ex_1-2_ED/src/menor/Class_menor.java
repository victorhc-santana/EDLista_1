package menor;

public class Class_menor {
	public Class_menor(){
		super();	
	}
	
	public int menor(int[] vetor_ref, int tamanho, int menor) {
		//condição de parada tamanho = 0
		if (tamanho == 0) {
			return menor;
		}
		else {
			int ultima_posicao = tamanho - 1;
			menor = vetor_ref[vetor_ref.length - 1];
			if (vetor_ref[ultima_posi] < menor) {
				return ;
			}
		}
	}

}
