package lista2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ex07 {

	private static DecimalFormat df = new DecimalFormat();

	public static void main(String[] args) {
		//Um estudante do ensino m�dio gostaria de controlar melhor suas notas nas disciplinas exatas. 
		// Ele gostaria de poder enxergar suas notas dos 4 bimestres com exatamente duas casas decimais e em formato
		// de matriz,
		// como no exemplo a seguir:
		// Mat  | F�s  | Qu�
		// 9.53 | 8.66 | 8.45
		// 7.57 | 9.00 | 8.01
		// 8.87 | 9.44 | 7.88
		// 7.30 | 6.77 | 9.21

		//Al�m disso, o estudante gostaria de poder escolher algumas op��es de visualiza��o de acordo com o menu abaixo:
		//	Todas as notas de todas as disciplinas;
		//	Qual a maior nota e em qual disciplina foi;
		//	A m�dia das notas de alguma disciplina (solicitar qual);
		//	As notas de um dos bimestres (solicitar qual);
		//	Encerrar.
		
		//Fa�a um programa que permita cadastrar as notas de acordo com o exemplo (considerando a ordem das disciplinas) 
		// e forne�a os dados supracitados. O menu deve ser exibido repetitivamente, at� que o usu�rio deseje encerrar o
		// programa.


		double[][] grades = new double[3][4];
		String[][] formatedGrades = new String[3][4];
		double majorGrade = -1;
		String formatedMajorGrade = "";
		String majorDiscipline = "";
		
		df.applyPattern("00.00");

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				switch (i){
					case 0:{
						grades[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + ( 1 + j ) + "� nota de matem�tica"));
						formatedGrades[i][j] = df.format(grades[i][j]);

						if(majorGrade < grades[i][j]){
							majorGrade = grades[i][j];
							majorDiscipline = "Matem�tica";
						}
						break;
					}
					case 1:{
						grades[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + ( 1 + j ) + "� nota de f�sica"));
						formatedGrades[i][j] = df.format(grades[i][j]);

						if(majorGrade < grades[i][j]){
							majorGrade = grades[i][j];
							majorDiscipline = "F�sica";
						}
						break;
					}
					case 2:{
						grades[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + ( 1 + j ) + "� nota de qu�mica"));
						formatedGrades[i][j] = df.format(grades[i][j]);

						if(majorGrade < grades[i][j]){
							majorGrade = grades[i][j];
							majorDiscipline = "Qu�mica";
						}
						break;
					}
				}
			}
		}

		formatedMajorGrade = df.format(majorGrade);

		do {
			int option = Integer.parseInt(JOptionPane.showInputDialog(" Menu:\n"
					+ "1 - Todas as notas de todas as disciplinas\n"
					+ "2 - Qual a maior nota e em qual disciplina foi\n"
					+ "3 - A m�dia das notas de alguma disciplina\n"
					+ "4 - As notas de um dos bimestres\n"
					+ "5 - Encerrar"));
			while(option < 1 && option > 5) {
				option = Integer.parseInt(JOptionPane.showInputDialog("Op��o inv�lida.\n Menu:\n"
						+ "1 - Todas as notas de todas as disciplinas\n"
						+ "2 - Qual a maior nota e em qual disciplina foi\n"
						+ "3 - A m�dia das notas de alguma disciplina\n"
						+ "4 - As notas de um dos bimestres\n"
						+ "5 - Encerrar"));
			}
			
			switch(option) {
				case 1:{
					JOptionPane.showMessageDialog(null, "" +
									"Mat   | F�s   | Qu�m\n" +
									formatedGrades[0][0] + " | " + formatedGrades[1][0] + " | " + formatedGrades[2][0] + "\n" +
									formatedGrades[0][1] + " | " + formatedGrades[1][1] + " | " + formatedGrades[2][1] + "\n" +
									formatedGrades[0][2] + " | " + formatedGrades[1][2] + " | " + formatedGrades[2][2] + "\n" +
									formatedGrades[0][3] + " | " + formatedGrades[1][3] + " | " + formatedGrades[2][3] + "\n"

					);
					break;
				}
				case 2:{
					JOptionPane.showMessageDialog(null, "Sua maior � " + formatedMajorGrade + " e foi em " + majorDiscipline);
					break;
				}
				case 3:{
					int optionAverage = (Integer.parseInt(JOptionPane.showInputDialog("Qual a disciplina desejada?\n" +
							"1 - Matem�tica\n" +
							"2 - F�sica\n" +
							"3 - Qu�mica\n")) - 1);

					double average = 0;

					for(int i = 0; i < 4; i++) {
						average += grades[optionAverage][i];
					}
					average /= 4;

					switch (optionAverage){
						case 0:{
							JOptionPane.showMessageDialog(null, "Matem�tica:\n" +
									grades[0][0] + " | " + grades[0][1] + " | " + grades[0][2] + " | " + grades[0][3] + "\n" +
									"M�dia: " + average
							);
							break;
						}
						case 1:{
							JOptionPane.showMessageDialog(null, "F�sica:\n" +
									grades[1][0] + " | " + grades[1][1] + " | " + grades[1][2] + " | " + grades[1][3] + "\n" +
									"M�dia: " + average
							);
							break;
						}
						case 2:{
							JOptionPane.showMessageDialog(null, "Qu�mica:\n" +
									grades[2][0] + " | " + grades[2][1] + " | " + grades[2][2] + " | " + grades[2][3] + "\n" +
									"M�dia: " + average
							);
							break;
						}
						default:{
							JOptionPane.showMessageDialog(null, "Op��o n�o encontrada, voltando ao menu principal...");
							break;
						}
					}

					break;
				}
				case 4:{
					int optionBimester = (Integer.parseInt(JOptionPane.showInputDialog("Qual bimestre voc� deseja visualizar? [1-4]")) - 1);

					while(optionBimester < 0 || optionBimester > 3){
						optionBimester = (Integer.parseInt(JOptionPane.showInputDialog("Bimestre n�o encontrado.\nQual bimestre voc� deseja visualizar? [1-4]")) - 1);
					}

					JOptionPane.showMessageDialog(null, "Mat   | F�s   | Qu�m\n" +
							formatedGrades[0][optionBimester] + " | " + formatedGrades[1][optionBimester] + " | " + formatedGrades[2][optionBimester]);
					break;
				}
				case 5:{
					JOptionPane.showMessageDialog(null,"Saindo...");
					System.exit(0);
					break;
				}
				default:{
					JOptionPane.showMessageDialog(null, "Op��o n�o encontrada, voltando ao menu principal...");
					break;
				}

			}
			
		}while(true);

	}

}
