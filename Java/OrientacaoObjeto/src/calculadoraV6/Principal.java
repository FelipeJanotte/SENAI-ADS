package calculadoraV6;

import javax.swing.*;

public class Principal {
//    private static Operacoes oper = new Operacoes();

    public static void main(String[] args) {

        Operacoes oper = null;
        int continuar;
        double resultado = 0;

        do{
            double num1 = EntradaSaida.solicitaNumero("1o");
            double num2 = EntradaSaida.solicitaNumero("2o");
            int operacao = EntradaSaida.solicitaOperacao();

            switch (operacao) {
                case 1: {
                    oper = new Soma();
                    break;
                }
                case 2: {
                    oper = new Subtracao();
                    break;
                }
                case 3: {
                    oper = new Multiplicacao();
                    break;
                }
                case 4: {
                    while(num2 == 0) {
                        num2 = EntradaSaida.solicitaNumero("2o");
                    }
                    oper = new Divisao();
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Operacao invalida! A calculadora sera encerrada!");
                    System.exit(0);
                    break;
                }
            }

            oper.setNum1(num1);
            oper.setNum2(num2);
            resultado = oper.calcula();
            EntradaSaida.mostraResultado(resultado, operacao);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2 - Nao"));
        } while (continuar == 1);
    }







}
