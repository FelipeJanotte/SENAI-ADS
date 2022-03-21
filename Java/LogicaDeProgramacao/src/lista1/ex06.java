package lista1;

import javax.swing.JOptionPane;

public class ex06 {
	public static void main(String[] args) {
		//Crie uma calculadora que permita o cálculo de uma equação, sem limite de execuções definido, da seguinte maneira:
		//	1. Peça o primeiro valor ,
		//	2. Peça o cálculo que deseja fazer (entre as 4 operações básicas),
		//	3. Peça um segundo valor 
		//	4. Efetue o cálculo,
		//	5. Peça se o usuário quer continuar calculando. Se ele responder que sim, volte para o passo 
		//		2 usando o resultado do cálculo da linha 4 como primeiro valor, e se disser que não, mostre o resultado final . 
		//	Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.

		boolean programRuning = true;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
		int num2 = 0;
		int result = 0;
		String oper = "";
		
		do {
			oper = JOptionPane.showInputDialog("Qual operação deseja fazer?(+,-,x,/)");
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o próximo número"));
			
			switch(oper) {
				case "+":{
					result = num1 + num2;
				}
				case "-":{
					result = num1 - num2;
				}
				case "x":{
					result = num1 * num2;
				}
				case "/":{
					while(num2 == 0) {
						num2 = Integer.parseInt(JOptionPane.showInputDialog("Divisão por zero é inválida.\nInforme o segundo número novamente"));
					}
					result = num1 / num2;
				}
			};
			
			String continueProgram = JOptionPane.showInputDialog(num1 + oper + num2 + "=" + result + "\n Deseja continuar o programa?\n[S]im / [N]ão (Caso informar outro valor o programa dará continuidade)");
			if(continueProgram == "N" || continueProgram == "n") {
				programRuning = false;
				JOptionPane.showMessageDialog(null, "Fechando o programa...");
			};
			
			
		}while(programRuning);
		
	}
}
