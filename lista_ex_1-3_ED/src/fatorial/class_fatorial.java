package fatorial;

public class class_fatorial {
	
	public class_fatorial() {
		super();}
	
	public int fatoracao(int fatorado) {
		//condição de parada é alcançada quando fatorado = 1
		if (fatorado == 1) {
			return 1;
		}
		//recursao multiplica o fatorado atual e chama o proximo numero
		else {
			return fatorado * fatoracao(fatorado -1);
		}
	}
}
