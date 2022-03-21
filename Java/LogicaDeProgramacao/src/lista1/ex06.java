package lista1;

import javax.swing.JOptionPane;

public class ex06 {
	public static void main(String[] args) {
		//Crie uma calculadora que permita o c�lculo de uma equa��o, sem limite de execu��es definido, da seguinte maneira:
		//	1. Pe�a o primeiro valor ,
		//	2. Pe�a o c�lculo que deseja fazer (entre as 4 opera��es b�sicas),
		//	3. Pe�a um segundo valor 
		//	4. Efetue o c�lculo,
		//	5. Pe�a se o usu�rio quer continuar calculando. Se ele responder que sim, volte para o passo 
		//		2 usando o resultado do c�lculo da linha 4 como primeiro valor, e se disser que n�o, mostre o resultado final . 
		//	Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.

		boolean programRuning = true;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		int num2 = 0;
		int result = 0;
		String oper = "";
		
		do {
			oper = JOptionPane.showInputDialog("Qual opera��o deseja fazer?(+,-,x,/)");
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o pr�ximo n�mero"));
			
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
						num2 = Integer.parseInt(JOptionPane.showInputDialog("Divis�o por zero � inv�lida.\nInforme o segundo n�mero novamente"));
					}
					result = num1 / num2;
				}
			};
			
			String continueProgram = JOptionPane.showInputDialog(num1 + oper + num2 + "=" + result + "\n Deseja continuar o programa?\n[S]im / [N]�o (Caso informar outro valor o programa dar� continuidade)");
			if(continueProgram == "N" || continueProgram == "n") {
				programRuning = false;
				JOptionPane.showMessageDialog(null, "Fechando o programa...");
			};
			
			
		}while(programRuning);
		
	}
}
