package main;
import somaserie.Class_SomaSerie;

public class Principal_SomaSerie {
	public static void main(String[] args) {
		Class_SomaSerie somaserie = new Class_SomaSerie();
		int N = 45;
		double soma = somaserie.somaserie(N);
		
		System.out.println("A soma da serie é "+soma);
	}
}
