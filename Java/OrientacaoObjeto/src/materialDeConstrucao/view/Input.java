package materialDeConstrucao.view;

import javax.swing.*;

public class Input {
    public static int requestMenu() {
        String[] options = {"Registro de Produtos", "Estoque de Produtos", "Cupons Fiscais", "Sair do programa"};
        JComboBox<String> menu = new JComboBox<>(options);
        JOptionPane.showConfirmDialog(null, menu, "Material de construcao", JOptionPane.OK_CANCEL_OPTION);
        return menu.getSelectedIndex();
    }

    public static int requestSubMenu(int menu){
        String[] options = {};
        String title = "";
        if(menu == 0 ){
            title = "Registro de produtos";
            options = new String[]{"Registrar produtos", "Ver produtos registrados", "Voltar"};
        } else if (menu == 1) {
            title = "Estoque de produtos";
            options = new String[]{"Adicionar produtos ao estoque", "Ver produtos no estoque", "Vender produtos", "Voltar"};
        } else{
            return 0;
        }
        JComboBox<String> selectMenu = new JComboBox<>(options);
        JOptionPane.showConfirmDialog(null, selectMenu, title, JOptionPane.OK_CANCEL_OPTION);

        return selectMenu.getSelectedIndex();
    }

    public static String requestProductId() {
        String id = JOptionPane.showInputDialog(null, "Informe o codigo do produto");
        return id;
    }

    public static String requestProductDescription() {
        String description = JOptionPane.showInputDialog(null, "Informe a descricao do produto");
        return description;
    }

    public static double requestProductPrice(){
        double price = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
        while(price <= 0) {
            Output.displayInvalidPrice();
            price = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
        }
        return price;
    }

    public static int continueMenu(String title){
        String[] options = {"Sim", "Nao"};
        JComboBox<String> menu = new JComboBox<>(options);
        JOptionPane.showConfirmDialog(null, menu, title, JOptionPane.OK_CANCEL_OPTION);
        return menu.getSelectedIndex();
    }

    public static int requestProductQuantity(String method) {
        int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade para " + method));
        while(quantity <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade invalida!");
            quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade para " + method));
        }
        return quantity;
    }

    public static int requestProductToSell(String[] menuOptions){
        JComboBox<String> menu = new JComboBox<>(menuOptions);
        JOptionPane.showConfirmDialog(null, menu, "Selecione um produto para atribuir ao estoque", JOptionPane.OK_CANCEL_OPTION);
        return menu.getSelectedIndex();
    }
}
