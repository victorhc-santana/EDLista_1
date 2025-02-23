/* Autor: Victor Hugo Campos Santana
 * Fatec Zona Leste
 * Exercicio feito para aula de Estrutura de dados Lecionado por Leandro Colevati
 * 
 * Lista 3 Exercicio 2
 *  Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um 
 *  número inteiro de 10 a 999999 e recebendo um 2º número inteiro (de 0 a 9),
 *  tenha uma função recursiva que apresente quantasvezes o 2º número aparece
 *  no primeiro
 */

package view;
import javax.swing.JOptionPane;
import controller.ClassConta;

public class Principal {
	public static void main(String[] args) {
		int N_Ver = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 10 e 999999"));
		while((N_Ver < 10) || (N_Ver > 999999)){
			N_Ver = Integer.parseInt(JOptionPane.showInputDialog("Numero invalido, Digite um numero entre 10 e 999999"));
		}
		
		int N_Quant = Integer.parseInt(JOptionPane.showInputDialog("Digite qual numero deseja contar no primeiro, deve ser entre 0 e 9"));
		while((N_Quant <0) || (N_Quant >9)){
			N_Quant = Integer.parseInt(JOptionPane.showInputDialog("Numero invalido, Digite qual numero deseja contar no primeiro, deve ser entre 0 e 9"));
		}
		
		ClassConta Contagem = new ClassConta();
		
		int Counter = Contagem.VerificaXemN(N_Ver, N_Quant);
		
		System.out.println("há " +Counter+" '"+N_Quant+"' em "+N_Ver);
		
	}
}
