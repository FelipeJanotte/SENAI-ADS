package lista2;

import javax.swing.JOptionPane;

public class ex05 {

	public static void main(String[] args) {
		// Fa�a um programa que solicite alguns dados dos usu�rios que frequentam um clube. 
		// O programa deve solicitar a idade, se a pessoa � fumante ou n�o (1- SIM, 2- N�O), 
		// seu sal�rio l�quido e h� quanto tempo frequenta o clube (em meses). 
		// O usu�rio dever� digitar �encerrar� quando n�o tiver mais pessoas para registrar.  
		// Como dados de sa�da, o programa deve exibir:
		// 	A m�dia das idades das pessoas;
		// 	A m�dia salarial das pessoas;
		// 	Quantos s�o fumantes e quantos n�o s�o fumantes;
		// 	A porcentagem de pessoas que frequentam o clube h� mais de 03 meses. 

		int interviewedQuant = 0;
		float averageAge = 0;
		float averageSalary = 0;
		int smokersQuant = 0;
		int frequentersQuant = 0;
		
		int programRuning = 1;
		
		do {
			interviewedQuant++;
			
			int requestAge = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos completados t�m o entrevistado?"));
			while(requestAge < 0){
				averageAge += Integer.parseInt(JOptionPane.showInputDialog("A idade n�o pode ser menor que zero.\nQuantos anos completados t�m o entrevistado?"));
			}
			
			int requestSmokers = JOptionPane.showConfirmDialog(null, "O entrevistado � fumante?");
			if(requestSmokers == 0) smokersQuant++;
			
			float requestSalary = Integer.parseInt(JOptionPane.showInputDialog("Qual o sal�rio l�quido do entrevistado?"));
			while(requestSalary < 0){
				averageSalary += Integer.parseInt(JOptionPane.showInputDialog("O sal�rio n�o pode ser menor que zero.\nQual o sal�rio l�quido do entrevistado?"));
			}
			
			int requestFrequenter = JOptionPane.showConfirmDialog(null, "O entrevistado frequenta a mais de 3 meses?");
			if(requestFrequenter == 0) {
				frequentersQuant++;
			}

			programRuning = JOptionPane.showConfirmDialog(null, "Deseja adicionar outra pessoa?");
		}while(programRuning != 0);
		
		
		averageAge = averageAge / interviewedQuant;
		averageSalary = averageSalary / interviewedQuant;
		
		JOptionPane.showMessageDialog(null, "Em seu clube:\n"
				+ "Idade m�dia: " + averageAge + "\n"
				+ "M�dia salarial: " + averageSalary + "\n"
				+ "Fumantes: " + smokersQuant + "\n"
				+ "Pessoas que frequentam a mais de 3 meses: " + frequentersQuant );
	}

}
