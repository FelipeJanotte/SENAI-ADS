package lista1;

import javax.swing.JOptionPane;

public class ex02 {

	public static void main(String[] args) {
// Desenvolva um programa que pergunte qual é a maioridade civil do seu 
// “estado/país” e que posteriormente o usuário informe sua idade. 
// Como resultado, o programa deve informar se ele é ou não maior de idade.
		int age = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		while(age < 0) {
			age = Integer.parseInt(JOptionPane.showInputDialog("Idade informada é inválida.\nInforme sua idade"));
		};
		
		int adulthood = Integer.parseInt(JOptionPane.showInputDialog("Informe a maioridade de seu estado/país"));
		while(adulthood < 0) {
			adulthood = Integer.parseInt(JOptionPane.showInputDialog("Maioridade informada é inválida.\nInforme a maiordade de seu estado/país"));
		}
		
		if (age >= adulthood) {
			JOptionPane.showMessageDialog(null, "Você é maior de idade");
		}else {
			JOptionPane.showMessageDialog(null, "Você é menor de idade");
		}
		
	}

}
