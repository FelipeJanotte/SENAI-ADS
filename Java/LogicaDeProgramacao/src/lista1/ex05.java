package lista1;

import javax.swing.JOptionPane;

public class ex05 {

	public static void main(String[] args) {
		// Faça um algoritmo que peça ao usuário 10 números e mostre posteriormente quantos são 
		// pares e a soma deles, bem como quantos são ímpares e a soma deles.
		
		int evenNumbers = 0;
		int sumEven = 0;
		
		int oddNumbers = 0;
		int sumOdd = 0;
		
		for(int i = 0; i < 10; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "º número:"));
			if(num % 2 == 0) {
				evenNumbers++;
				sumEven+=num;
			}
			if(num % 2 != 0) {
				oddNumbers++;
				sumOdd+=num;
			}
		}

		JOptionPane.showMessageDialog(null, "Dentre dos números digitados existem " + evenNumbers 
				+ " números pares e a soma entre eles é: " + sumEven);

		JOptionPane.showMessageDialog(null, "E também dentre dos números digitados existem " + oddNumbers 
				+ " números pares e a soma entre eles é: " + sumOdd);
	}

}
