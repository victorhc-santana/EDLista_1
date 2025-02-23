/* Autor: Victor Hugo Campos Santana
 * Fatec Zona Leste
 * Exercicio feito para aula de Estrutura de dados Lecionado por Leandro Colevati
 * 
 * Lista 3 Exercicio 3
 *  Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de
 *  caracteres. 
 */

package view;
import java.util.Scanner;
import controller.ClassInvertePalavra;

public class Principal {
	public static void main(String[] args) {
		//chama funções a ser usadas
		ClassInvertePalavra Invertendo = new ClassInvertePalavra();				
		Scanner scanner = new Scanner(System.in);
		
		//Capta a palavra a inverte
		System.out.println("Digite a palavra a inverter");
		String AInverter = scanner.nextLine();
		
		//fechar o scanner
		scanner.close();
		
		//Inverte a palavra
		String Invertido = Invertendo.Inverte(AInverter);
		
		//Sistema de Saída
		System.out.println("O inverso de '"+AInverter+"' é '"+Invertido+"'");
		
	}
}
