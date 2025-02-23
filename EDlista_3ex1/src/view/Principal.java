/* Autor: Victor Hugo Campos Santana
 * Fatec Zona Leste
 * Exercicio feito para aula de Estrutura de dados Lecionado por Leandro Colevati
 * 
 * Lista 3 Exercicio 1
 * Crie uma função recursiva que exiba a quan�dade de dígitos de um número 
 * inteiro passado como parâmetro
 */

package view;
import controller.ClassDigitoCont;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		//Chama a classe de controle feita
		ClassDigitoCont Contador = new ClassDigitoCont();
		
		//Captura N para contar a quantia de digitos
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		//Chama classe feita para contar a quantia de digitos
		int Quantia =  Contador.Conta(N);
		
		//Saída pedida
		System.out.println("A quantia de digitos neste numero é "+ Quantia);
	}
}
