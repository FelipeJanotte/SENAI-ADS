package lista2;

import javax.swing.JOptionPane;

public class ex02 {

	public static void main(String[] args) {
		// Escreva um programa que receba quatro notas do aluno e as insira em um vetor. 
		// Depois, calcule a média aritmética entre as quatro notas e mostre o "conceito" do aluno conforme as instruções: 
		//		9.0 ou maior = Conceito A
		//		entre 8.0 e 8.9 = Conceito B
		//		entre 7.0 e 7.9 = Conceito C
		//		menor que 7.0 = Conceito D

		float[] grades = new float[4];
		float average = 0;
		
		for(int i = 0; i < grades.length; i++) {
			grades[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a " + (i+1) + "ª nota:" ));
			while(grades[i] < 0) {
				grades[i] = Float.parseFloat(JOptionPane.showInputDialog("A nota do aluno não pode ser menor que zero.\n"
						+ "Informe a " + (i+1) + "ª nota:" ));
			}
		}
		
		average = (grades[0] + grades[1] + grades[2] + grades[3]) / grades.length;
		
		if(average >= 9)JOptionPane.showMessageDialog(null, "Seu aluno é conceito A");
		if(average >= 8 && average < 9)JOptionPane.showMessageDialog(null, "Seu aluno é conceito B");
		if(average >= 7 && average < 8)JOptionPane.showMessageDialog(null, "Seu aluno é conceito C");
		if(average < 7)JOptionPane.showMessageDialog(null, "Seu aluno é conceito D");
	}

}
