package lista1;

import javax.swing.JOptionPane;

public class ex03 {
	public static void main(String[] args) {
		// Fa�a um programa que pe�a ao usu�rio para informar 03 n�meros 
		// e mostre o menor entre eles. 
		// Considere que o usu�rio n�o poder� informar n�meros iguais.

		float[] nums = new float[3];
		float minorNumber = 0;
		
		for(int i = 0; i < nums.length; i++) {
			float newNum = Float.parseFloat(JOptionPane.showInputDialog("Informe o " + (i+1) + "� n�mero"));
			if(haveItemInArray(nums, newNum)) {
				JOptionPane.showMessageDialog(null, "Esse n�mero j� foi informado!");
				i--;
			};
			nums[i] = newNum;
			for(int j = 0; j < nums.length; j++) {
				if(newNum < nums[j]) minorNumber = newNum;
			};
		}
		
		JOptionPane.showMessageDialog(null, "O menor n�mero informado foi: " + minorNumber);
	}
	
	private static boolean haveItemInArray(float[] array, float item) {
		for(int i = 0; i < array.length; i++) {
			if(item == array[i]) return true;
		}
		
		return false;
	}
}


