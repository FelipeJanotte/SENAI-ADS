package lista2;

import javax.swing.JOptionPane;

public class ex04 {

	public static void main(String[] args) {
		// Sabe-se que o lat�o � constitu�do de 70% de cobre e 30% de zinco. 
		// Fa�a um programa que permita ao usu�rio informar uma quantidade de lat�o em quilos 
		// e forne�a o total de cobre e zinco necess�rios para fabricar essa quantidade.

		double brass = Double.parseDouble(JOptionPane.showInputDialog("Informe(em quilos) a quantidade de lat�o que deseja fazer: "));
		double copper = brass * 0.7; // 70% - brass = 70 / 100 * brass = 0.7 * brass;
		double zinc = brass * 0.3; // 30% - brass = 30 / 100 * brass = 0.3 * brass;
		
		JOptionPane.showMessageDialog(null, "Para se obter " + brass + "Kg de lat�o precisasse:\n"
				+ copper + "Kg de cobre.\n"
				+ zinc + "Kg de zinco" );

	}

}
