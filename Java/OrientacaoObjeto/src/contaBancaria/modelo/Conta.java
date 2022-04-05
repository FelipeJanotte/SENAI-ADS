package contaBancaria.modelo;

import java.util.ArrayList;

public class Conta {
    private String titularDaConta;
    private String tipo;
    private double saldo;
    private ArrayList<Movimentacao> listaDeMovimentacao;

    public void setTitularDaConta(String titularDaConta){
        this.titularDaConta = Conta.this.titularDaConta;
    }

    public String getTitularDaConta(){
        return titularDaConta;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

//    Métodos:
//    depositar()

    public static void depositar(){

    }

//    sacar()
//    gerarSaldo()
//    gerarDadosDaConta()
//    gerarExtrato()
//    gerarExtratoDepositos()
//    gerarExtratoSaques()


}

