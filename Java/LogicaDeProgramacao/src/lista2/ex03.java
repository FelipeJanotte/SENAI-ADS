package lista2;

import javax.swing.JOptionPane;

public class ex03 {

	public static void main(String[] args) {
		// Escreva um programa que leia um número inteiro e apresente um menu para o usuário escolher:
		// 1-Verificar se o número é múltiplo de algum outro número (pedir ao usuário esse número);
		// 2-Verificar se o número é par;
		// 3-Verificar se o número está entre 0 e 1000;
		// 4-Sair
		// Após as entradas de dados, deve ser mostrado ao usuário o resultado da respectiva opção escolhida, e novamente o menu. 
		// Para a opção “4- Sair”, utilize System.exit(0);

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
		int num2;
		int option = 0;
		
		do {
			option = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja fazer?"
					+ "1 - Verificar se o número é múltiplo de algum outro número.\n"
					+ "2 - Verificar se o número é par.\n"
					+ "3 - Verificar se o número está entre 0 e 1000.\n"
					+ "4 - Sair."));
			while(option <= 0 || option > 4) {
				option = Integer.parseInt(JOptionPane.showInputDialog("Opção inválida\nO que você deseja fazer?"
						+ "1 - Verificar se o número é múltiplo de algum outro número (pedir ao usuário esse número).\n"
						+ "2 - Verificar se o número é par.\n"
						+ "3 - Verificar se o número está entre 0 e 1000.\n"
						+ "4 - Sair."));
			}
			
			switch(option) {
				case 1:{
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número."));
					if(num2 / num2 == 0) {
						JOptionPane.showMessageDialog(null, "O número " + num1 + " é múltiplo de" + num2);
					}
					else {
						JOptionPane.showMessageDialog(null, "O número " + num1 + " não é múltiplo de" + num2);
					}
				}
				case 2:{
					if(num1 % 2 == 0) {
						JOptionPane.showMessageDialog(null, "O número " + num1 + " é par");
					} 
					else {
						JOptionPane.showMessageDialog(null, "O número " + num1 + " não é par");
					}
				}
				case 3:{
					if(num1 >= 0 && num1 <= 1000) {
						JOptionPane.showMessageDialog(null, "O número " + num1 + " está dentro do intervalo de 0 á 1000.");
					}
				}
				case 4:{
					JOptionPane.showMessageDialog(null, "Saindo do programa...");
					System.exit(0);
				}
				default:{
					JOptionPane.showMessageDialog(null, "Opção não encontrada...\nVoltando ao menu.");
				}
					
			}
			
		}while(true);
		
	}

}
