package calculadoraV1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int continuar;
        double resultado = 0;

        do{
            double num1 = solicitaNumero("1o");
            double num2 = solicitaNumero("2o");
            int operacao = solicitaOperacao();

            switch (operacao) {
                case 1: {
                    resultado = calculaSoma(num1, num2);
                    break;
                }
                case 2: {
                    resultado = calculaSubtracao(num1,num2);
                    break;
                }
                case 3: {
                    resultado = calculaMultiplicacao(num1,num2);
                    break;
                }
                case 4: {
                    while(num2 == 0) {
                        num2 = solicitaNumero("2o");
                    }
                    resultado = calculaDivisao(num1,num2);
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Operacao invalida! A calculadora sera encerrada!");
                    System.exit(0);
                    break;
                }
            }

            mostraResultado(resultado, operacao);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2 - Nao"));
        } while (continuar == 1);
    }

    static int solicitaOperacao() {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operacao desejada: \n" +
                "1 - Soma\n" +
                "2 - Subtracao\n" +
                "3 - Multiplicacao\n" +
                "4 - Divisao"));
        return operacao;
    }

    static double solicitaNumero(String ordem){
        double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + ordem + " numero"));
        return num;
    }

    static double calculaSoma(double num1, double num2) {
        double soma = num1 + num2;
        return soma;
    }
    static double calculaSubtracao(double num1, double num2) {
        double sub = num1 - num2;
        return sub;
    }
    static double calculaMultiplicacao(double num1, double num2) {
        double mult = num1 * num2;
        return mult;
    }
    static double calculaDivisao(double num1, double num2) {
        double divi = num1 / num2;
        return divi;
    }

    static void mostraResultado(double resultado, int operacao) {
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
