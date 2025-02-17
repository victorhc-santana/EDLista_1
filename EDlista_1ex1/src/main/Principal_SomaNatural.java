package main;
import somanatural.Class_SomaNatural;

public class Principal_SomaNatural {
	public static void main(String[] args) {
	Class_SomaNatural SomaN = new Class_SomaNatural();
	//Valor Chumbado, pode ser alterado no futuro
	int N = 23;
	int SomaNatural = SomaN.SomaN(N);
	
	System.out.println("A soma dos "+ N +" primeiros numéros naturais é "+ SomaNatural);	
}
}
