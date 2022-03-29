package calculadoraV3;

import javax.swing.*;

public class Principal {
    private static Operacoes oper = new Operacoes();

    public static void main(String[] args) {

        int continuar;
        double resultado = 0;

        do{
            double num1 = EntradaSaida.solicitaNumero("1o");
            double num2 = EntradaSaida.solicitaNumero("2o");
            int operacao = EntradaSaida.solicitaOperacao();

            switch (operacao) {
                case 1: {
                    resultado = oper.calculaSoma(num1, num2);
                    break;
                }
                case 2: {
                    resultado = oper.calculaSubtracao(num1,num2);
                    break;
                }
                case 3: {
                    resultado = oper.calculaMultiplicacao(num1,num2);
                    break;
                }
                case 4: {
                    while(num2 == 0) {
                        num2 = EntradaSaida.solicitaNumero("2o");
                    }
                    resultado = oper.calculaDivisao(num1,num2);
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Operacao invalida! A calculadora sera encerrada!");
                    System.exit(0);
                    break;
                }
            }

            EntradaSaida.mostraResultado(resultado, operacao);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2 - Nao"));
        } while (continuar == 1);
    }







}
