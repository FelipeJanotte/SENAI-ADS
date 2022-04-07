package contaBancaria.visualizacao;

import contaBancaria.modelo.Conta;
import contaBancaria.modelo.Movimentacao;

import javax.swing.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;

public class EntradaSaida {

    public static int solicitarOpcaoPrograma() {
        String[] opcoes = {"Depositar", "Sacar", "Visualizar Dados da Conta", "Visualizar Extrato",
                "Visualizar Extrato de Depositos", "Visualizar Extrato de Saques", "Sair do Programa"};

        JComboBox<String> menu = new JComboBox<>(opcoes);
        JOptionPane.showConfirmDialog(null, menu, "Selecione uma opcao", JOptionPane.OK_CANCEL_OPTION);

        return menu.getSelectedIndex();
    }

    public static String solicitarTitularDaConta() {
        String nome = JOptionPane.showInputDialog(null, "Qual o nome do titular da conta?");
        return nome;
    }

    public static String solicitarTipoDaConta() {
        String[] opcoes = {"Corrente", "Poupanca"};
        JComboBox<String> menu = new JComboBox<>(opcoes);
        JOptionPane.showConfirmDialog(null, menu, "Selecione o tipo da conta", JOptionPane.OK_CANCEL_OPTION);
        return menu.getSelectedItem().toString();
    }

    public static double solicitarInformacoesDeposito() {
        double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a quantia que você deseja depositar?"));
        return deposito;
    }

    public static double solicitarInformacoesSaque() {
        double saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a quantia que você deseja sacar?"));

        return saque;
    }

    public static void exibirDadosDaConta(String nomeDoTitular, String tipoDaConta, Double saldo) {
        JOptionPane.showMessageDialog(null, "" +
                "Nome do titular: " + nomeDoTitular + "\n" +
                "Tipo da conta: " + tipoDaConta + "\n" +
                "Saldo: R$" + String.format("%.2f", saldo));
    }

    public static void exibirExtratoCompleto(ArrayList<Movimentacao> listaDeExtrato) {
        String listaString = "Extratos " + "\n" + "Data | Tipo | Valor \n";
        double total = 0;

        for (Movimentacao extrato : listaDeExtrato) {
            listaString += extrato.getData() + " | " + extrato.getTipo() + " | " + String.format("%.2f", extrato.getValor()) + "\n";
            total += extrato.getValor();
        }

        String data = OffsetDateTime.now().getDayOfMonth() + "/" + OffsetDateTime.now().getMonthValue() + "/" + OffsetDateTime.now().getYear();
        listaString += data + " | " + "TOTAL" + " | " + String.format("%.2f", total);
        JOptionPane.showMessageDialog(null, listaString);
    }

    public static void exibirExtratos(String tipo, ArrayList<Movimentacao> listaDeExtrato) {
        String listaString = "Extrato de " + tipo + "\n" + "Data | Valor \n";
        double total = 0;

        for (Movimentacao extrato : listaDeExtrato) {
            if (tipo.equals(extrato.getTipo())) {
                listaString += extrato.getData() + " | " + String.format("%.2f",extrato.getValor()) + "\n";
                total += extrato.getValor();
            }
        }

        String data = OffsetDateTime.now().getDayOfMonth() + "/" + OffsetDateTime.now().getMonthValue() + "/" + OffsetDateTime.now().getYear();
        listaString += data + " | " + "SALDO" + " | " + String.format("%.2f", total);

        JOptionPane.showMessageDialog(null, listaString);
    }

//    public static void exibirExtratoDeDeposito(){}
//
//    public static void exibirExtratoDeSaques(){}

    public static void exibirSucesso(String metodo) {
        JOptionPane.showMessageDialog(null, metodo + " bem-sucedido");
    }

    public static void exibirInvalido(String metodo) {
        if (metodo.equals("deposito")) {
            JOptionPane.showMessageDialog(null, "O valor do deposito nao pode ser menor ou igual a zero!");
        } else if (metodo.equals("saque")) {
            JOptionPane.showMessageDialog(null, "O valor do saque nao pode ser menor ou igual a zero!");
        }

        JOptionPane.showMessageDialog(null, "O valor do " + metodo + " nao pode ser menor ou igual a zero!");
    }

    public static void exibirLimiteAtingido() {
        JOptionPane.showMessageDialog(null, "Voce nao pode sacar mais, pois excede o debito maximo na conta!");
    }

    public static void exibirMetodoNaoEncontrado(String metodo) {
        JOptionPane.showMessageDialog(null, "O método '" + metodo + "' nao foi encontrado!");
    }

}
