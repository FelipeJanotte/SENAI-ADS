package lista1;

import javax.swing.JOptionPane;

public class ex05 {

	public static void main(String[] args) {
		// Fa�a um algoritmo que pe�a ao usu�rio 10 n�meros e mostre posteriormente quantos s�o 
		// pares e a soma deles, bem como quantos s�o �mpares e a soma deles.
		
		int evenNumbers = 0;
		int sumEven = 0;
		
		int oddNumbers = 0;
		int sumOdd = 0;
		
		for(int i = 0; i < 10; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "� n�mero:"));
			if(num % 2 == 0) {
				evenNumbers++;
				sumEven+=num;
			}
			if(num % 2 != 0) {
				oddNumbers++;
				sumOdd+=num;
			}
		}

		JOptionPane.showMessageDialog(null, "Dentre dos n�meros digitados existem " + evenNumbers 
				+ " n�meros pares e a soma entre eles �: " + sumEven);

		JOptionPane.showMessageDialog(null, "E tamb�m dentre dos n�meros digitados existem " + oddNumbers 
				+ " n�meros pares e a soma entre eles �: " + sumOdd);
	}

}
