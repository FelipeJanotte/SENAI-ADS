package lista1;

import javax.swing.JOptionPane;

public class ex08 {

	public static void main(String[] args) {
		//Faça um programa que carregue os valores das vendas de uma loja no primeiro semestre do ano. 
		// Considere para tal uma matriz [6,4], sendo que são 06 meses e 04 semanas por mês. Ao final, mostre na tela: 
		//	● Total de vendas do semestre
		//	● Total vendido em cada mês

		int[][] sales = new int[6][4];
		int[] totalSaleMonth = new int[6];
		int totalSaleSemester = 0;
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; i < 4; i++) {
				sales[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de venda no: "
						+(i+1) + "º mês," + (j+1) + "ª semana: "));;
				while(sales[i][j] < 0) {
					sales[i][j] = Integer.parseInt(JOptionPane.showInputDialog("O total de vendas não pode ser menor que zero.\n"
							+ "Informe o total de venda no: \n"
							+(i+1) + "º mês," + (j+1) + "ª semana: "));
				}
				totalSaleMonth[i] += sales[i][j];
			}
			totalSaleSemester += totalSaleMonth[i];
		}
		
		JOptionPane.showMessageDialog(null, "● Total de vendas do semestre: " + totalSaleSemester + "\n" +
			"● Total vendido no 1º mês: " + totalSaleMonth[0] + "\n" +
			"● Total vendido no 2º mês: " + totalSaleMonth[1] + "\n" +
			"● Total vendido no 3º mês: " + totalSaleMonth[2] + "\n" +
			"● Total vendido no 4º mês: " + totalSaleMonth[3] + "\n" +
			"● Total vendido no 5º mês: " + totalSaleMonth[4] + "\n" +
			"● Total vendido no 6º mês: " + totalSaleMonth[5]);
	}

}
