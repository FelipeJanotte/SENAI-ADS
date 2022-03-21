package lista3;

import javax.swing.JOptionPane;

public class ex02 {

	public static void main(String[] args) {
//		Fa�a um programa que receba as tr�s notas de um aluno e pergunte ao professor qual m�dia ele deseja calcular: 
//		aritm�tica ou ponderada. Se for a m�dia ponderada, os pesos de cada nota devem ser informados.
//			Cada m�dia dever� ser calculada por um m�todo;
//			Os dois m�todos devem receber como par�metros as notas;
//			No caso do m�todo da m�dia ponderada, al�m das notas, o m�todo dever� receber tamb�m os pesos, 
//			  que devem ser previamente solicitados ao usu�rio;
//			Os dois m�todos devem retornar a m�dia;
//			Um m�todo deve ser criado para receber a m�dia final e mostrar se o aluno est� aprovado ou reprovado, 
//		      considerando que a m�dia m�nima para aprova��o � 7.

		float[] grades = new float[3];
		int averageIsWeighted = JOptionPane.showConfirmDialog(null, "A m�dia � ponderada?");
		float average = (float) 0;

		// ajustar
		// ?
		// * criar mais metodos necess�rios;
		// * notas limitadas nas m�dias;
		switch (averageIsWeighted) {
		case 0: {
			float[] gradeWeights = new float[3];
			for (int i = 0; i < grades.length; i++) {
				gradeWeights[i] = receiveWeights((i + 1));
				grades[i] = receiveValue((i + 1));
			}
			average = weightedAverage(grades, gradeWeights);
			break;
		}
		case 1: {
			for (int i = 0; i < grades.length; i++) {
				grades[i] = receiveValue((1 + i));
			}
			average = normalAvarage(grades);
			break;
		}
		default: {
			JOptionPane.showMessageDialog(null, "Saindo do programa...");
			System.exit(0);
			break;
		}
		}
		approved(average);
	}

	private static float receiveWeights(int order) {
		float weight = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da " + order + "� nota:"));
		while (weight <= 0) {
			weight = Float.parseFloat(JOptionPane.showInputDialog(
					"O peso da nota n�o pode ser menor que zero.\nDigite o peso da " + order + "� nota:"));
		}
		return weight;
	}

	private static float receiveValue(int order) {
		float value = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da " + order + "� nota: "));
		while (value < 0) {
			value = Float.parseFloat(JOptionPane
					.showInputDialog("A nota n�o pode ser menor que zero.\nDigite o valor da " + order + "� nota: "));
		}
		return value;

	}

	private static float weightedAverage(float[] grades, float[] weight) {
		float average = ((grades[0] * weight[0]) + (grades[1] * weight[1]) + (grades[2] * weight[2]))
				/ (weight[0] + weight[1] + weight[2]);
		return average;
	}

	private static float normalAvarage(float[] grades) {
		float average = (grades[0] + grades[1] + grades[2]) / grades.length;

		return average;
	}

	private static void approved(float average) {
		if (average >= 7) {
			JOptionPane.showMessageDialog(null,
					"Seu aluno foi aprovado com uma m�dia de " + String.format("%.2f", average));
		} else {
			JOptionPane.showMessageDialog(null,
					"Seu aluno n�o foi aprovado com uma m�dia de " + String.format("%.2f", average));
		}
	}

}
