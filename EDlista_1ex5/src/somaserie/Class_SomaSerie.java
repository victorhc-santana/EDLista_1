package somaserie;

public class Class_SomaSerie {
	public Class_SomaSerie() {
		super ();
	}
	public double somaserie(int N) {
		//quando N chega a 1 finaliza a soma da serie
		if (N == 1) {
			return 1;
		}
		/* converte N para double para possibilitar a divisão, 
		 * em seguida adiciona o termo 1/N e reduz N em 1 
		 */
		else {
			double soma = 1/ (double) N;
			return soma + somaserie(N- 1);
		}
		
	}
}
