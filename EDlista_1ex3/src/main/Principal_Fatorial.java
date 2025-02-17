package main;
import fatorial.Class_Fatorial;
import javax.swing.JOptionPane;
public class Principal_Fatorial {

	public static void main(String[] args) {
		int i, N;
		i = 0;
		N = 0;
		Class_Fatorial fat = new Class_Fatorial();
		//O valor está chumbado pela simplificação, pode-se alterar no futuro
		while (i == 0) {
		N = Integer.parseInt(JOptionPane.showInputDialog("digito o numero a ser fatorado: "));
			if (N >12) {
				JOptionPane.showMessageDialog(null, "O numero a ser fatorado não pode ser maior que 12!");
			}
			else {
				i = 1;
			}
		}
		int fator = fat.fatoracao(N);
		
		System.out.println("O fatorial de "+ N +" é "+fator);
			

	}

}