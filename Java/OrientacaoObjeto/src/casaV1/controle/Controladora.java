package casaV1.controle;

import casaV1.visualizacao.EntradaSaida;
import casaV1.modelo.*;
import javax.swing.*;

public class Controladora {

    private Casa casa = null;

    public void exibeMenu() {
        int opcao;
        do{
            opcao = EntradaSaida.solicitaOpcao();

            switch (opcao) {
                case 0: {
                    JOptionPane.showMessageDialog(null, "Contruir casa");
                    break;
                }
                case 1: {
                    JOptionPane.showMessageDialog(null, "Movimentar portas ou janelas");
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "Ver informações da casa");
                    break;
                }
            }
        } while( opcao != 3 );

        EntradaSaida.exibeMsgEncerrarPrograma();

        System.exit(0);
    }
}
