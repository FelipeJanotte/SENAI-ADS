package lista1;

import javax.swing.JOptionPane;

public class ex01 {
// Fa�a um algoritmo que pe�a para o usu�rio inserir uma quantidade em horas, 
// outra em minutos e mais uma em segundos e mostre quantos segundos esse hor�rio cont�m.
	
	public static void main(String[] args) {
		int hours = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas:"));
		while(hours < 0) {
			hours = Integer.parseInt(JOptionPane.showInputDialog("Horas informada � inv�lida.\nInforme a quantidade de horas:"));
		}
		int minutes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de minutos:"));
		while(minutes < 0) {
			minutes = Integer.parseInt(JOptionPane.showInputDialog("Horas informada � inv�lida.\nInforme a quantidade de horas:"));
		}
		int seconds = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de minutos:"));
		while(seconds < 0) {
			seconds = Integer.parseInt(JOptionPane.showInputDialog("Horas informada � inv�lida.\nInforme a quantidade de horas:"));
		}
		seconds += (hours * 60 * 60) + (minutes * 60);
		
		JOptionPane.showMessageDialog(null, "O tempo que voc� informou � igual a " + seconds + " segundos.");
	}
		

}
