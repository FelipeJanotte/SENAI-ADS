package lista2;

import javax.swing.JOptionPane;

public class ex01 {

	public static void main(String[] args) {
		// Fa�a um programa que receba um vetor de valores e mostre a quantidade de  valores negativos. 
		// Os valores e o tamanho do vetor devem ser informados pelo usu�rio.

		float[] nums = new float[Integer.parseInt(JOptionPane.showInputDialog("Quantos n�meros ser�o informados"))];
		int negNumQuant = 0;
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o " + (i+1) + "� n�mero:"));
			if(nums[i] < 0) negNumQuant++;
		}
		
		JOptionPane.showMessageDialog(null, "Destre os n�meros informados existem " + negNumQuant + " n�meros negativos.");
		
	}

}
