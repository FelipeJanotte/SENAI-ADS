package lista1;

import javax.swing.JOptionPane;

public class ex07 {

	public static void main(String[] args) {
		// Faça uma solução que alimente um vetor com 10 valores inteiros e também que solicite 
		// ao usuário a entrada de dados de um valor inteiro qualquer. 
		// A solução deverá fazer uma busca do valor, informado pelo usuário, no vetor e imprima 
		// a posição em que este foi encontrado ou se não foi encontrado.

		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "º número:"));
		};
		
		int searchNum = Integer.parseInt(JOptionPane.showInputDialog("Informe o número que deseja encontrar"));
		String haveNum = haveItemInArray(nums, searchNum)[0];
		
		if(haveNum == "1") {
			String numPosition = haveItemInArray(nums, searchNum)[1];
			JOptionPane.showMessageDialog(null, "O número " + searchNum + " foi encontrado e está na " + (numPosition+1) + "ª posição");
		} else {
			JOptionPane.showMessageDialog(null, "O número " + searchNum + " não foi encontrado.");
		}

	}
	
	private static String[] haveItemInArray(int[] array, int item) {
		String[] infos = {"0", "0"};
		for(int i = 0; i < array.length; i++) {
			if(item == array[i]) {
				infos[0] = "1";
				infos[1] = Integer.toString(i);
				return infos;
			}
		}
		
		return infos;
	}

}
