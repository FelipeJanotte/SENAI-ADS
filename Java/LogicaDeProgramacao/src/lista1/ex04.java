package lista1;

import javax.swing.JOptionPane;

public class ex04 {

	public static void main(String[] args) {
//		Faça um algoritmo que mostre a soma de todos os valores 
//		pares entre o intervalo de dois números digitados pelo usuário.
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º número:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º número:"));
		int sumEven = 0;
		
		if(num1 > num2) {
			for(int i = num2; i < num1; i+=2) {
				if(i % 2 != 0) i--;
				sumEven += i;
			}
		}
		
		if(num1 < num2) {
			for(int i = num1; i < num2; i+=2) {
				if(i % 2 != 0) i--;
				sumEven += i;
			}
		}
		
		JOptionPane.showMessageDialog(null, "A soma de todos os número pares entre " + num1 + " e " + num2 + " é igual a " + sumEven);
	}

}
