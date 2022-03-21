package lista2;

import javax.swing.JOptionPane;

public class ex06 {
	public static void main(String[] args) {
		//Uma empresa deseja saber alguns dados sobre suas vendas no passado. 
		//Faça um programa que armazene em um vetor o valor total das vendas de cada um dos 12 meses do ano 
		//(que deverá ser informado pelo usuário) e mostre:
		//	O mês com a maior venda;
		//	O mês com a menor venda;
		//	A média das vendas do ano todo;
		//	A média das vendas dos meses pares;
		//	A média das vendas do 2º semestre.

		float[] monthsSales = new float[12];
		int majorMonth = 0;
		float majorMonthSale = 0;		
		float minorMonth = 0;	
		float minorMonthSale = 0;
		float yearSaleAverage = 0;
		float evenMonthsAverage = 0;
		float secondSemesterAverage = 0;
		
		for(int i = 0; i < monthsSales.length; i++) {
			monthsSales[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor total das vendas do " + i + "º mês:"));
			while(monthsSales[i] < 0) {
				monthsSales[i] = Float.parseFloat(JOptionPane.showInputDialog("Valor de venda inválida.\n"
						+ "Informe o valor total das vendas do " + i + "º mês:"));
			}
		}
		
		for(int i = 0; i < monthsSales.length; i++) {
			yearSaleAverage += monthsSales[i];
			
			if(majorMonth < monthsSales[i] || majorMonth == 0) {
				majorMonth = i+1;
				majorMonthSale = monthsSales[i];
			}
			if(minorMonth < monthsSales[i] || minorMonth == 0) {
				minorMonth = i+1;
				minorMonthSale = monthsSales[i];
			}
			
			if(i % 2 == 0) {
				evenMonthsAverage += monthsSales[i];
			}
			
			if(i > 6) {
				secondSemesterAverage += monthsSales[i];
			}
		}
		
		yearSaleAverage = yearSaleAverage / 12;
		evenMonthsAverage = evenMonthsAverage / 6;
		secondSemesterAverage = secondSemesterAverage / 6;
		
		JOptionPane.showMessageDialog(null, "Análise das vendas do ano:\n"
				+ "Mês com maior venda: " + majorMonth + " com o valor de " + majorMonthSale + "\n"
				+ "Mês com menor venda: " + minorMonth + " com o valor de " + minorMonthSale + "\n"
				+ "Média das vendas do ano: " + yearSaleAverage + "\n"
				+ "Média das vendas dos meses pares: " + evenMonthsAverage + "\n"
				+ "Média das vendas no 2º semestre: " + secondSemesterAverage);
			
		
	}
}
