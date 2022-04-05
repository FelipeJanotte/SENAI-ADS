package contaBancaria.controle;

import contaBancaria.modelo.Conta;
import contaBancaria.visualizacao.EntradaSaida;

public class Controladora {

    public static void exibirMenu() {
        Conta conta =  new Conta();

        // Criacao da conta
        conta.setTitularDaConta(EntradaSaida.solicitarTitularDaConta());
        conta.setTipo(EntradaSaida.solicitarTipoDaConta());
        conta.setSaldo(EntradaSaida.solicitarSaldo());

        int opcao = 0;

        do{
            opcao = EntradaSaida.solicitarOpcaoPrograma();
            switch (opcao){
                case 0: {
                    // Depositar
                    break;
                }
                case 1: {
                    // Sacar
                    break;
                }
                case 2: {
                    // Visualizar Dados da Conta
                    break;
                }
                case 3: {
                    // Visualizar Extrato
                    break;
                }
                case 4: {
                    // Visualizar Extrato de Depositos
                    break;
                }
                case 5: {
                    //Visualizar Extrato de Saques
                    break;
                }
            }

        }while(opcao != 6);
    }
}
