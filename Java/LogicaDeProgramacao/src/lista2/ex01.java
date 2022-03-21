package lista2;

import javax.swing.JOptionPane;

public class ex01 {

	public static void main(String[] args) {
		// Faça um programa que receba um vetor de valores e mostre a quantidade de  valores negativos. 
		// Os valores e o tamanho do vetor devem ser informados pelo usuário.

		float[] nums = new float[Integer.parseInt(JOptionPane.showInputDialog("Quantos números serão informados"))];
		int negNumQuant = 0;
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o " + (i+1) + "º número:"));
			if(nums[i] < 0) negNumQuant++;
		}
		
		JOptionPane.showMessageDialog(null, "Destre os números informados existem " + negNumQuant + " números negativos.");
		
	}

}
