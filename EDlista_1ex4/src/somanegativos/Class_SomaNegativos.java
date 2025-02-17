package somanegativos;

public class Class_SomaNegativos {
	public Class_SomaNegativos() {
		super();
	}
	public int SomaNegs(int[] vetorref, int tamanho) {
		/* Quando Tamanho chega a 0, o vetor foi todo verificado,
		 *  returna 0 para n interferir no resultado
		 */
		if (tamanho == 0) {
			return 0;
		}
		/* Verifica a posição atual identificada pelo tamanho do vetor,
		 * se for negativo soma mais e chama a recursão
		 */
		else {
			-- tamanho;
			if (vetorref[tamanho] < 0) {
				return 1 + SomaNegs(vetorref, tamanho);
			}
			else {
				return SomaNegs(vetorref, tamanho);
			}
		}
	}
}
