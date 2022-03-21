package lista2;

import javax.swing.JOptionPane;

public class ex05 {

	public static void main(String[] args) {
		// Faça um programa que solicite alguns dados dos usuários que frequentam um clube. 
		// O programa deve solicitar a idade, se a pessoa é fumante ou não (1- SIM, 2- NÃO), 
		// seu salário líquido e há quanto tempo frequenta o clube (em meses). 
		// O usuário deverá digitar “encerrar” quando não tiver mais pessoas para registrar.  
		// Como dados de saída, o programa deve exibir:
		// 	A média das idades das pessoas;
		// 	A média salarial das pessoas;
		// 	Quantos são fumantes e quantos não são fumantes;
		// 	A porcentagem de pessoas que frequentam o clube há mais de 03 meses. 

		int interviewedQuant = 0;
		float averageAge = 0;
		float averageSalary = 0;
		int smokersQuant = 0;
		int frequentersQuant = 0;
		
		int programRuning = 1;
		
		do {
			interviewedQuant++;
			
			int requestAge = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos completados têm o entrevistado?"));
			while(requestAge < 0){
				averageAge += Integer.parseInt(JOptionPane.showInputDialog("A idade não pode ser menor que zero.\nQuantos anos completados têm o entrevistado?"));
			}
			
			int requestSmokers = JOptionPane.showConfirmDialog(null, "O entrevistado é fumante?");
			if(requestSmokers == 0) smokersQuant++;
			
			float requestSalary = Integer.parseInt(JOptionPane.showInputDialog("Qual o salário líquido do entrevistado?"));
			while(requestSalary < 0){
				averageSalary += Integer.parseInt(JOptionPane.showInputDialog("O salário não pode ser menor que zero.\nQual o salário líquido do entrevistado?"));
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
				+ "Idade média: " + averageAge + "\n"
				+ "Média salarial: " + averageSalary + "\n"
				+ "Fumantes: " + smokersQuant + "\n"
				+ "Pessoas que frequentam a mais de 3 meses: " + frequentersQuant );
	}

}
