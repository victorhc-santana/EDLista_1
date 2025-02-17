package main;
import menor.Class_Menor;

public class Principal_Menor {

	public static void main(String[] args) {
		Class_Menor men = new Class_Menor();
		//Os valores está chumbado pela simplificação, pode-se alterar no futuro
		int [] vetor = {4,5,1,2,7,3};
		int tamanho = vetor.length;
		int menor = men.menor(vetor, tamanho);
		System.out.println("O menor valor do vetor é "+ menor);	
	}

}
