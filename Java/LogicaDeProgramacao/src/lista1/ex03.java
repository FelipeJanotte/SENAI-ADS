package lista1;

import javax.swing.JOptionPane;

public class ex03 {
	public static void main(String[] args) {
		// Faça um programa que peça ao usuário para informar 03 números 
		// e mostre o menor entre eles. 
		// Considere que o usuário não poderá informar números iguais.

		float[] nums = new float[3];
		float minorNumber = 0;
		
		for(int i = 0; i < nums.length; i++) {
			float newNum = Float.parseFloat(JOptionPane.showInputDialog("Informe o " + (i+1) + "º número"));
			if(haveItemInArray(nums, newNum)) {
				JOptionPane.showMessageDialog(null, "Esse número já foi informado!");
				i--;
			};
			nums[i] = newNum;
			for(int j = 0; j < nums.length; j++) {
				if(newNum < nums[j]) minorNumber = newNum;
			};
		}
		
		JOptionPane.showMessageDialog(null, "O menor número informado foi: " + minorNumber);
	}
	
	private static boolean haveItemInArray(float[] array, float item) {
		for(int i = 0; i < array.length; i++) {
			if(item == array[i]) return true;
		}
		
		return false;
	}
}


