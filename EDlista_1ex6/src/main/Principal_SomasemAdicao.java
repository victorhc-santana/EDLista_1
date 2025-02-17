package main;
import somasemadicao.Class_SomasemAdicao;

public class Principal_SomasemAdicao {
	public static void main(String[] args) {
		Class_SomasemAdicao function_soma = new Class_SomasemAdicao();
		int A = 5;
		int B = 40;
		int C = function_soma.somasemadicao(A, B);
		
		System.out.println("O resultado da soma é " + C);
	}
}
