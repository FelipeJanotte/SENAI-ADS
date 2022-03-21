package lista2;

import javax.swing.JOptionPane;

public class ex04 {

	public static void main(String[] args) {
		// Sabe-se que o latão é constituído de 70% de cobre e 30% de zinco. 
		// Faça um programa que permita ao usuário informar uma quantidade de latão em quilos 
		// e forneça o total de cobre e zinco necessários para fabricar essa quantidade.

		double brass = Double.parseDouble(JOptionPane.showInputDialog("Informe(em quilos) a quantidade de latão que deseja fazer: "));
		double copper = brass * 0.7; // 70% - brass = 70 / 100 * brass = 0.7 * brass;
		double zinc = brass * 0.3; // 30% - brass = 30 / 100 * brass = 0.3 * brass;
		
		JOptionPane.showMessageDialog(null, "Para se obter " + brass + "Kg de latão precisasse:\n"
				+ copper + "Kg de cobre.\n"
				+ zinc + "Kg de zinco" );

	}

}
