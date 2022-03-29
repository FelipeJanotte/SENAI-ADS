package casaV1.visualizacao;

import javax.swing.*;

public class EntradaSaida {
    public static int solicitaOpcao() {
        String[] opcoes = { "Construir casa",
                "Movimentar portas ou janelas",
                "Ver informações da casa",
                "Sair do programa"};
        JComboBox<String> menu = new JComboBox<>(opcoes);
        JOptionPane.showConfirmDialog(null, menu, "Selecione a opcao desejada", JOptionPane.OK_CANCEL_OPTION);
        return menu.getSelectedIndex();
    }

    public static void exibeMsgEncerrarPrograma() {
        JOptionPane.showMessageDialog(null, "O programa sera encerrado");
    }
}
