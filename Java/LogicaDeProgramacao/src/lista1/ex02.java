package lista1;

import javax.swing.JOptionPane;

public class ex02 {

	public static void main(String[] args) {
// Desenvolva um programa que pergunte qual � a maioridade civil do seu 
// �estado/pa�s� e que posteriormente o usu�rio informe sua idade. 
// Como resultado, o programa deve informar se ele � ou n�o maior de idade.
		int age = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		while(age < 0) {
			age = Integer.parseInt(JOptionPane.showInputDialog("Idade informada � inv�lida.\nInforme sua idade"));
		};
		
		int adulthood = Integer.parseInt(JOptionPane.showInputDialog("Informe a maioridade de seu estado/pa�s"));
		while(adulthood < 0) {
			adulthood = Integer.parseInt(JOptionPane.showInputDialog("Maioridade informada � inv�lida.\nInforme a maiordade de seu estado/pa�s"));
		}
		
		if (age >= adulthood) {
			JOptionPane.showMessageDialog(null, "Voc� � maior de idade");
		}else {
			JOptionPane.showMessageDialog(null, "Voc� � menor de idade");
		}
		
	}

}
