package lista3;

import javax.swing.JOptionPane;

public class ex02 {

	public static void main(String[] args) {
//		Faça um programa que receba as três notas de um aluno e pergunte ao professor qual média ele deseja calcular: 
//		aritmética ou ponderada. Se for a média ponderada, os pesos de cada nota devem ser informados.
//			Cada média deverá ser calculada por um método;
//			Os dois métodos devem receber como parâmetros as notas;
//			No caso do método da média ponderada, além das notas, o método deverá receber também os pesos, 
//			  que devem ser previamente solicitados ao usuário;
//			Os dois métodos devem retornar a média;
//			Um método deve ser criado para receber a média final e mostrar se o aluno está aprovado ou reprovado, 
//		      considerando que a média mínima para aprovação é 7.

		float[] grades = new float[3];
		int averageIsWeighted = JOptionPane.showConfirmDialog(null, "A média é ponderada?");
		float average = (float) 0;

		// ajustar
		// ?
		// * criar mais metodos necessários;
		// * notas limitadas nas médias;
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
		float weight = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da " + order + "ª nota:"));
		while (weight <= 0) {
			weight = Float.parseFloat(JOptionPane.showInputDialog(
					"O peso da nota não pode ser menor que zero.\nDigite o peso da " + order + "ª nota:"));
		}
		return weight;
	}

	private static float receiveValue(int order) {
		float value = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da " + order + "ª nota: "));
		while (value < 0) {
			value = Float.parseFloat(JOptionPane
					.showInputDialog("A nota não pode ser menor que zero.\nDigite o valor da " + order + "ª nota: "));
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
					"Seu aluno foi aprovado com uma média de " + String.format("%.2f", average));
		} else {
			JOptionPane.showMessageDialog(null,
					"Seu aluno não foi aprovado com uma média de " + String.format("%.2f", average));
		}
	}

}
