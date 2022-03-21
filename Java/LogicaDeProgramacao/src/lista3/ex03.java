package lista3;

import javax.swing.JOptionPane;

public class ex03 {
//	Faça um programa que a partir do valor de uma compra, faça o cálculo de um desconto para o usuário. 
//	O programa deve solicitar o valor total da compra por meio de um método, que deverá retorná-lo. 
//	Um método deve ser criado para receber o valor da compra e mostrar o valor final com desconto, considerando:
	//	Até R$100 - sem desconto, o valor permanece o mesmo
	//	De R$100,01 a R$200 - desconto de 20%
	//	Acima de R$200 - desconto de 30%
	
//	criar métodos:
	// ?
		// * Receber e enviar valores;
	public static void main(String[] args) {
		float sale = saleReceive() ;
		float[] saleDiscount = saleDiscount(sale);
		
		saleDiscountSend(saleDiscount, sale);

	}
	
	private static float[] saleDiscount(float sale) {
		// sale * discount / 100;
		float[] discount = new float[2];
		if(sale <= 100) {
			// No discount;
			discount[1] = 0;
		} else if (sale > 100 && sale <=200) {
			// Discount - 20%;
			discount[0] = (float) (sale * 0.2);
			discount[1] = 20;
		} else {
			// Discount - 30%;
			discount[0] = (float) (sale * 0.3);
			discount[1] = 30;
		}
		return discount;
	}
	
	private static float saleReceive() {
		float sale = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da compra?"));
		while(sale < 0) {
			sale = Float.parseFloat(JOptionPane.showInputDialog("Não é possível ter uma compra com valor menor que zero. \n Qual o valor da compra?"));
		};
		return sale;
	}

	private static void saleDiscountSend(float[] discount, float sale) {
		if(discount[0] <= 0) {
			JOptionPane.showMessageDialog(null, "Sua compra de R$" + String.format("%.2f", sale) + " não teve desconto.");
		} else {
			JOptionPane.showMessageDialog(null, "Sua compra de R$" + String.format("%.2f", sale) 
				+ " teve um desconto de " + discount[1] + "%, assim sua compra ficará apenas R$" + String.format("%.2f", (sale - discount[0])));
		}
	}
}
