package fabricaDeCarros.view;

import javax.swing.*;

public class Input {
    public static int requestOption() {
        String[] options = {"Fabricar carros", "Vender um carro", "Ver informacoes do(s) carro(s) adicionado(s)", "Sair do programa"};
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

    public static String requestCarDescription(String method, int index){
        return JOptionPane.showInputDialog(null, "Qual o " + method +
                " do " + index + "o carro?");
    }

    public static int requestCarToSell(String[] carsOptionsMenu){
        JComboBox<String> carsMenu = new JComboBox<>(carsOptionsMenu);
        JOptionPane.showConfirmDialog(null, carsMenu, "Selecione o carro para ser excluido", JOptionPane.OK_CANCEL_OPTION);
        return carsMenu.getSelectedIndex();
    }

    public static String requestLicensePlate(int index){
        String licensePlate = JOptionPane.showInputDialog(null, "Qual a placa do " + index + "o carro?");
        return licensePlate;
    }
}
