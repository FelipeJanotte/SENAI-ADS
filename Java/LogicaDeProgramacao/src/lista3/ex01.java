package lista3;

import javax.swing.JOptionPane;

public class ex01 {

	public static void main(String[] args) {
//		Faça um programa que solicite o ano de nascimento de um usuário e seja mostrada a sua idade em 2021. 
//		Não é necessário considerar se o usuário já fez ou não aniversário. 
//		Um método deve ser criado para solicitar o ano de nascimento ao usuário e retorná-lo, 
//		e outro método deve ser criado para receber o ano de nascimento, calcular a idade atual e mostrá-la.

		JOptionPane.showMessageDialog(null, "No ano de 2021, você tem/terá/teve " + calculateAge(getBirthYear()) + " anos completados.");
	}
	
	private static int calculateAge(int birthYear) {
		return (2021 - birthYear);
	};

	private static int getBirthYear() {
		int birthYear = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu ano de nascimento?"));
		while(birthYear < 0) {
			birthYear = Integer.parseInt(JOptionPane.showInputDialog("O ano de nascimento não pode ser menor que zero.\nQual o seu ano de nascimento?"));
		}
		return birthYear;
	};
}
