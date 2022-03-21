package lista2;

import javax.swing.JOptionPane;

public class ex03 {

	public static void main(String[] args) {
		// Escreva um programa que leia um n�mero inteiro e apresente um menu para o usu�rio escolher:
		// 1-Verificar se o n�mero � m�ltiplo de algum outro n�mero (pedir ao usu�rio esse n�mero);
		// 2-Verificar se o n�mero � par;
		// 3-Verificar se o n�mero est� entre 0 e 1000;
		// 4-Sair
		// Ap�s as entradas de dados, deve ser mostrado ao usu�rio o resultado da respectiva op��o escolhida, e novamente o menu. 
		// Para a op��o �4- Sair�, utilize System.exit(0);

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro: "));
		int num2;
		int option = 0;
		
		do {
			option = Integer.parseInt(JOptionPane.showInputDialog("O que voc� deseja fazer?"
					+ "1 - Verificar se o n�mero � m�ltiplo de algum outro n�mero.\n"
					+ "2 - Verificar se o n�mero � par.\n"
					+ "3 - Verificar se o n�mero est� entre 0 e 1000.\n"
					+ "4 - Sair."));
			while(option <= 0 || option > 4) {
				option = Integer.parseInt(JOptionPane.showInputDialog("Op��o inv�lida\nO que voc� deseja fazer?"
						+ "1 - Verificar se o n�mero � m�ltiplo de algum outro n�mero (pedir ao usu�rio esse n�mero).\n"
						+ "2 - Verificar se o n�mero � par.\n"
						+ "3 - Verificar se o n�mero est� entre 0 e 1000.\n"
						+ "4 - Sair."));
			}
			
			switch(option) {
				case 1:{
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero."));
					if(num2 / num2 == 0) {
						JOptionPane.showMessageDialog(null, "O n�mero " + num1 + " � m�ltiplo de" + num2);
					}
					else {
						JOptionPane.showMessageDialog(null, "O n�mero " + num1 + " n�o � m�ltiplo de" + num2);
					}
				}
				case 2:{
					if(num1 % 2 == 0) {
						JOptionPane.showMessageDialog(null, "O n�mero " + num1 + " � par");
					} 
					else {
						JOptionPane.showMessageDialog(null, "O n�mero " + num1 + " n�o � par");
					}
				}
				case 3:{
					if(num1 >= 0 && num1 <= 1000) {
						JOptionPane.showMessageDialog(null, "O n�mero " + num1 + " est� dentro do intervalo de 0 � 1000.");
					}
				}
				case 4:{
					JOptionPane.showMessageDialog(null, "Saindo do programa...");
					System.exit(0);
				}
				default:{
					JOptionPane.showMessageDialog(null, "Op��o n�o encontrada...\nVoltando ao menu.");
				}
					
			}
			
		}while(true);
		
	}

}
