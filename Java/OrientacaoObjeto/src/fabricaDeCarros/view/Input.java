package fabricaDeCarros.view;

import javax.swing.*;

public class Input {
    public static int requestOption() {
        String[] options = {"Fabricar carros", "Vender um carro", "Ver informacoes de um carro", "Sair do programa"};
        JComboBox<String> menu = new JComboBox<>(options);
        JOptionPane.showConfirmDialog(null, menu, "Selecione a opcao desejada",
                JOptionPane.OK_CANCEL_OPTION);
        return menu.getSelectedIndex();
    }

    public static int requestManyCarsToCreate() {
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros desejas fabricar?"));
        while(quantity <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade inválida!");
            quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros desejas fabricar?"));
        }
        return quantity;
    }


}
