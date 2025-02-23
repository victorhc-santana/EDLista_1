/* Autor: Victor Hugo Campos Santana
 * Fatec Zona Leste
 * Exercicio feito para aula de Estrutura de dados Lecionado por Leandro Colevati
 * 
 * Lista 3 Exercicio 6
 * Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
 * inteiro (N), apresente a saída da somatória
 * S = 1 + 1/2! + 1/3! + ... + 1/n!
 */

package view;
import controller.ClassSomatoriaFatorial;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Pergunta qual n deseja para calculo da somatoria
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o n para a somatoria S = 1 + 1/2! + 1/3! + ... + 1/n!");
		int n_som = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		//Chama a classe feita para o calculo
		ClassSomatoriaFatorial somando = new ClassSomatoriaFatorial();
		double Somatoria = somando.soma(n_som);
		
		//Saida pedida
		System.out.println("A somatoria com '"+n_som+"' é = "+Somatoria);	
	}
}
