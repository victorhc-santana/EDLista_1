package fatorial;

public class Class_Fatorial {
	
	public Class_Fatorial() {
		super();}
	
	public int fatoracao(int fatorado) {
		//condição de parada é alcançada quando fatorado = 1
		if (fatorado == 1) {
			return 1;
		}
		/*adiciona o numero atual para a multiplicação e então
		 *chama a função reduzindo um do numero a ser faturado */
		else {
			return fatorado * fatoracao(fatorado -1);
		}
	}
}
