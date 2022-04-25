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
        String quantity = String.valueOf(JOptionPane.showInputDialog(null,
                "Quantos carros desejas fabricar?", "Fabrica de carros", JOptionPane.INFORMATION_MESSAGE));
        if(quantity.equals("null")){
            return -1;
        }
        while(Integer.parseInt(quantity) <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade inválida!");
            quantity = String.valueOf(JOptionPane.showInputDialog(null,
                    "Quantos carros desejas fabricar?", "Fabrica de carros", JOptionPane.INFORMATION_MESSAGE));
            if(quantity.equals("null")){
                return -1;
            }
        }
        return Integer.parseInt(quantity);
    }

    public static String requestCarDescription(String method, int index){
        return JOptionPane.showInputDialog(null, "Qual o " + method +
                " do " + index + "o carro?");
    }

    public static int requestCarToSell(String[] carsOptionsMenu){
        JComboBox<String> carsMenu = new JComboBox<>(carsOptionsMenu);
        int option = JOptionPane.showConfirmDialog(null, carsMenu, "Selecione o carro para ser excluido",
                JOptionPane.OK_CANCEL_OPTION);
        if(option == 2){
            return -1;
        }
        return carsMenu.getSelectedIndex();
    }
}
