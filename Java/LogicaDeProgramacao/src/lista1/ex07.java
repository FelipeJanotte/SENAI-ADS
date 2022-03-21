package lista1;

import javax.swing.JOptionPane;

public class ex07 {

	public static void main(String[] args) {
		// Fa�a uma solu��o que alimente um vetor com 10 valores inteiros e tamb�m que solicite 
		// ao usu�rio a entrada de dados de um valor inteiro qualquer. 
		// A solu��o dever� fazer uma busca do valor, informado pelo usu�rio, no vetor e imprima 
		// a posi��o em que este foi encontrado ou se n�o foi encontrado.

		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "� n�mero:"));
		};
		
		int searchNum = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero que deseja encontrar"));
		String haveNum = haveItemInArray(nums, searchNum)[0];
		
		if(haveNum == "1") {
			String numPosition = haveItemInArray(nums, searchNum)[1];
			JOptionPane.showMessageDialog(null, "O n�mero " + searchNum + " foi encontrado e est� na " + (numPosition+1) + "� posi��o");
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero " + searchNum + " n�o foi encontrado.");
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
