/* Autor: Victor Hugo Campos Santana
 * Fatec Zona Leste
 * Exercicio feito para aula de Estrutura de dados Lecionado por Leandro Colevati
 * 
 * Lista 3 Exercicio 7
 * Escreva uma função recursiva que calcule a soma dos dígitos de um número inteiro.
 */

package view;
import java.util.Scanner;
import controller.ClassSomaDigitos;

public class Principal {

	public static void main(String[] args) {
		//pergunta o digito para a soma
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o numero que deseja saber a soma dos digitos:");
		int n_soma = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		//chama a classe feita para a soma e então efetua o calculo
		ClassSomaDigitos somando = new ClassSomaDigitos();
		int soma =  somando.SomaDigitos(n_soma);
		
		//saida pedida
		System.out.println("A soma dos digitos de '"+n_soma+"' é = "+soma);
		

	}

}
