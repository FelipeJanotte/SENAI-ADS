package contaBancaria.visualizacao;

import contaBancaria.modelo.Conta;

import javax.swing.*;

public class EntradaSaida {

    public static int solicitarOpcaoPrograma(){
        String[] opcoes = {"Depositar", "Sacar", "Visualizar Dados da Conta", "Visualizar Extrato",
                "Visualizar Extrato de Depositos", "Visualizar Extrato de Saques", "Sair do Programa"};

        JComboBox<String> menu = new JComboBox<>(opcoes);
        JOptionPane.showConfirmDialog(null, menu, "Selecione uma opcao", JOptionPane.OK_CANCEL_OPTION);

        return menu.getSelectedIndex();
    }

    public static String solicitarTitularDaConta(){
        String nome = JOptionPane.showInputDialog(null, "Qual o nome do titular da conta?");
        return nome;
    }

    public static String solicitarTipoDaConta(){
        String[] opcoes = {"Corrente", "Poupanca"};
        JComboBox<String> menu = new JComboBox<>(opcoes);
        JOptionPane.showConfirmDialog(null, menu, "Selecione o tipo da conta", JOptionPane.OK_CANCEL_OPTION);
        return menu.getSelectedItem().toString();
    }

    public static double solicitarSaldo(){
        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o saldo atual da conta?"));
        return saldo;
    }

    public static void solicitarInformacoesDeposito(){}

    public static void solicitarInformacoesSaque(){}

    public static void exibirSaldo(){}

    public static void exibirDadosDaConta(Conta conta){
        JOptionPane.showMessageDialog(null, "" +
                "Nome do titular: " + conta.getTitularDaConta() + "\n" +
                "Tipo da conta: " + conta.getTipo() + "\n" +
                "Saldo: R$" + conta.getSaldo());
    }

    public static void exibirExtratoCompleto(){}

    public static void exibirExtratoDeDeposito(){}

    public static void exibirExtratoDeSaques(){}

}
