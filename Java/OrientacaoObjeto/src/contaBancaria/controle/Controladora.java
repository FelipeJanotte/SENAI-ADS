package contaBancaria.controle;

import contaBancaria.modelo.Conta;
import contaBancaria.visualizacao.EntradaSaida;

public class Controladora {

    public static void exibirMenu() {
        Conta conta =  new Conta();

        // Criacao da conta
        conta.setTitularDaConta(EntradaSaida.solicitarTitularDaConta());
        conta.setTipo(EntradaSaida.solicitarTipoDaConta());

        int opcao = 0;

        do{
            opcao = EntradaSaida.solicitarOpcaoPrograma();
            switch (opcao){
                case 0: {
                    double deposito = EntradaSaida.solicitarInformacoesDeposito();
                    while(deposito <= 0) {
                        EntradaSaida.exibirInvalido("deposito");
                        deposito = EntradaSaida.solicitarInformacoesDeposito();
                    }

                    conta.gerarSaldo("Deposito", deposito);
                    EntradaSaida.exibirSucesso("Deposito");

                    break;
                }
                case 1: {
                    if(conta.getSaldo() == -1000){
                        EntradaSaida.exibirLimiteAtingido();
                    } else {
                        double saque = EntradaSaida.solicitarInformacoesSaque();
                        while(saque <= 0 || saque > conta.getSaldo() + 1000){
                            if(saque <= 0){
                                EntradaSaida.exibirInvalido("saque");
                            } else {
                                EntradaSaida.exibirLimiteAtingido();
                            }

                            saque = EntradaSaida.solicitarInformacoesSaque();
                        }

                        conta.gerarSaldo("Saque", saque);
                        EntradaSaida.exibirSucesso("Saque");

                    }


                    break;
                }
                case 2: {
                    // Visualizar Dados da Conta
                    String[] dados = conta.gerarDadosDaConta();
                    EntradaSaida.exibirDadosDaConta(dados);
                    break;
                }
                case 3: {
                    // Visualizar Extrato
                    EntradaSaida.exibirExtratoCompleto(conta.gerarExtrato());
                    break;
                }
                case 4: {
                    //Visualizar Extrato de Depositos
                    EntradaSaida.exibirExtratos("Deposito", conta.gerarExtratoDepositos());
                    break;
                }
                case 5: {
                    //Visualizar Extrato de Saques
                    EntradaSaida.exibirExtratos("Saque", conta.gerarExtratoSaques());
                    break;
                }
            }

        }while(opcao != 6);
    }
}
