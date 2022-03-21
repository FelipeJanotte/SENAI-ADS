package lista3;

import javax.swing.JOptionPane;

public class ex01 {

	public static void main(String[] args) {
//		Fa�a um programa que solicite o ano de nascimento de um usu�rio e seja mostrada a sua idade em 2021. 
//		N�o � necess�rio considerar se o usu�rio j� fez ou n�o anivers�rio. 
//		Um m�todo deve ser criado para solicitar o ano de nascimento ao usu�rio e retorn�-lo, 
//		e outro m�todo deve ser criado para receber o ano de nascimento, calcular a idade atual e mostr�-la.

		JOptionPane.showMessageDialog(null, "No ano de 2021, voc� tem/ter�/teve " + calculateAge(getBirthYear()) + " anos completados.");
	}
	
	private static int calculateAge(int birthYear) {
		return (2021 - birthYear);
	};

	private static int getBirthYear() {
		int birthYear = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu ano de nascimento?"));
		while(birthYear < 0) {
			birthYear = Integer.parseInt(JOptionPane.showInputDialog("O ano de nascimento n�o pode ser menor que zero.\nQual o seu ano de nascimento?"));
		}
		return birthYear;
	};
}
