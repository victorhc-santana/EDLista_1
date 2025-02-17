package main;
import somanegativos.Class_SomaNegativos;

public class Principal_SomaNegativos {
	public static void main(String[] args) {
		Class_SomaNegativos soman = new Class_SomaNegativos();
		int [] vetor = {1 ,5 -9, 6, -1, -3, -5};
		int Soma_N = soman.SomaNegs(vetor, vetor.length);
		
		System.out.println("Há "+ Soma_N + " numeros negativos no vetor");
	}
}
