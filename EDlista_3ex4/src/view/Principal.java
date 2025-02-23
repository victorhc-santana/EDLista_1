/* Autor: Victor Hugo Campos Santana
 * Fatec Zona Leste
 * Exercicio feito para aula de Estrutura de dados Lecionado por Leandro Colevati
 * 
 * Lista 3 Exercicio 4
 * Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um
 *  número inteiro, converta para binário. Entrada limitada a 2000
 */

package view;
import controller.ClassConvertePraBinario;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//leitura do numero a ser convertido em binário, com limitação a 2000
		System.out.println("Digite o numero a ser convertido, entre 0 e 2000");
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		while((n<0) || (n>2000)){
			System.out.println("O numero não pode ser < 0 ou > 2000");
			n = Integer.parseInt(scanner.nextLine());
		}
		
		scanner.close();
		
		//inicia a variavel e classe para a conversão
		ClassConvertePraBinario Converte = new ClassConvertePraBinario();
		String n_bin;
		
		//inicia conversão e inverte para saida correta
		n_bin = Converte.convertendo(n);
		n_bin = Converte.Inverte(n_bin);
		
		//Saída do numero convertido
		System.out.println("O numero "+ n +" em binário é "+ n_bin);
	}
}
