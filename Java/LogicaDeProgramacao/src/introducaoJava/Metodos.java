package introducaoJava;

import javax.swing.JOptionPane;

public class Metodos {

	public static void main(String[] args) {

		int peso = Integer.parseInt(JOptionPane.showInputDialog("Informe seu peso"));
		
		while(peso <= 0) {
			mostraErroPeso();
			peso = Integer.parseInt(JOptionPane.showInputDialog("Informe seu peso"));
		}
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		
		while(altura <= 0) {
			mostraErroAltura();
			altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		}
		
		double imc = calculaIndice(peso, altura);
		verificaIndice(imc);
		
	}

	
	public static double calculaIndice (int peso, double altura) {
		double imc = peso / (altura*altura);
		
		return imc;
	}
	
	public static void verificaIndice(double imc) {
		if(imc<17) {
			JOptionPane.showMessageDialog(null, "Você está muito abaixo do peso! Índice: " + imc);
		} else if(imc == 17 || imc <= 18.49) {
			JOptionPane.showMessageDialog(null, "Você está abaixo do peso! Índice: " + imc);
		} else if(imc <=  24.99) {
			JOptionPane.showMessageDialog(null, "Você está no peso adequado! Índice: " + imc);
		} else if(imc <= 29.99) {
			JOptionPane.showMessageDialog(null, "Você está acima do peso! Índice: " + imc);
		} else if(imc <= 34.99) {
			JOptionPane.showMessageDialog(null, "Você está com obesidade tipo I! Índice: " + imc);
		} else if(imc <= 39.99) {
			JOptionPane.showMessageDialog(null, "Você está com obesidade tipo II! Índice: " + imc);
		} else if(imc >= 40) {
			JOptionPane.showMessageDialog(null, "Você está obesidade tipo III! Índice: " + imc);
		}
	}
	
	public static void mostraErroPeso() {
		JOptionPane.showMessageDialog(null, "O peso digitado é inválido!");
	}
		
	public static void mostraErroAltura() {
		JOptionPane.showMessageDialog(null, "A altura digitada é inválido!");
	}
}
