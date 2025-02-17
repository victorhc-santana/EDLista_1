package somasemadicao;

public class Class_SomasemAdicao {
	public Class_SomasemAdicao() {
		super ();
	}
	public int somasemadicao(int a, int b) {
		//Após o termino de incrementos a b, retorna b
		if (a == 0) {
			return b;
		}
		/* tira 1 de a e bota 1 em b, até alcançar condição de parada
		 */
		else {
			return somasemadicao(a - 1, b + 1);
		}
		
	}
}

