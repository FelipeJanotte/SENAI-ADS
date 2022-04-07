package materialDeConstrucao.view;

import materialDeConstrucao.model.TaxCoupon;

import javax.swing.*;

public class Output {
    public static void displayFinishProgram(){
        JOptionPane.showMessageDialog(null, "O programa sera encerrado!");
    }

    public static void displayIdAlreadyExist(){
        JOptionPane.showMessageDialog(null, "Este codigo ja existe!");
    }

    public static void displayList(String list){
        JOptionPane.showMessageDialog(null, list);
    }

    public static void displayDontHave(String method){
        JOptionPane.showMessageDialog(null, "Voce nao possui " + method + "!");
    }

    public static void displayTaxCoupon(TaxCoupon taxCoupon){
        JOptionPane.showMessageDialog(null, "Compra bem-sucedida!" + "\n Cupom fiscal:" +
                "\n Data: " + taxCoupon.getDate() +
                "\n Produto: " + taxCoupon.getProductDescription() +
                "\n Valor: R$" + String.format("%.2f",taxCoupon.getProductValue()) +
                "\n Quantidade: " + taxCoupon.getProductQuantity() +
                "\n Valor Total: R$" + String.format("%.2f",taxCoupon.getValue()));
    }

    public static void displayInvalidPrice(){
        JOptionPane.showMessageDialog(null, "O valor do produto precisa ser maior que zero!");
    }
}
