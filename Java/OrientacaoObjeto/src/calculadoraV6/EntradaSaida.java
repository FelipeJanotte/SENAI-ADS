package calculadoraV6;

import javax.swing.*;

public class EntradaSaida {
    public static int solicitaOperacao() {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operacao desejada: \n" +
                "1 - Soma\n" +
                "2 - Subtracao\n" +
                "3 - Multiplicacao\n" +
                "4 - Divisao"));
        return operacao;
    }

    public static double solicitaNumero(String ordem){
        double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " numero"));
        return num;
    }

    public static void mostraResultado(double resultado, int operacao) {
        String op = "";

        if(operacao == 1) {
            op="soma";
        }else if(operacao == 2) {
            op="subtracao";
        }else if(operacao == 3) {
            op="multiplicacao";
        }else if(operacao == 4) {
            op="divisao";
        }

        JOptionPane.showMessageDialog(null, "O resultado da " + op + " e: " + resultado);
    }
}
