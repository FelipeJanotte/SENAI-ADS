package materialDeConstrucao.controller;

import materialDeConstrucao.model.*;
import materialDeConstrucao.view.*;

public class Control {
    public static void showMenu() {

        int optionMenu = 0;

        do {
            String[] options = {"Registro de Produtos", "Estoque de Produtos", "Cupons Fiscais", "Sair do programa"};
            optionMenu = Input.requestMenu(options);
            int optionSubMenu = Input.requestSubMenu(optionMenu);
            switch (optionMenu) {
                case 0: {
                    if (optionSubMenu == 0) {
                        // Register products (id, description, price)
                        RegisteredProduct.registerProduct();
                        break;
                    } else if (optionSubMenu == 1) {
                        // List registered products
                        if(RegisteredProduct.products.isEmpty()){
                            Output.displayDontHave("produtos registrados");
                            break;
                        }
                        RegisteredProduct.listRegisteredProducts();
                        break;
                    }

                    break;
                }
                case 1: {


                    if (optionSubMenu == 0) {
                        // Add products on stock by id and quantity
                        if(RegisteredProduct.products.isEmpty()){
                            Output.displayDontHave("produtos registrados");
                            break;
                        }
                        StockedProduct.addProductToStock();
                    } else if (optionSubMenu == 1) {
                        // List stock products
                        if(StockedProduct.products.isEmpty()){
                            Output.displayDontHave("produtos no estoque");
                            break;
                        }
                        StockedProduct.listStockedProducts();
                    } else if (optionSubMenu == 2) {
                        // Sell a product - create tax coupon (date, product's description, quantity, value)
                        if(StockedProduct.products.isEmpty()){
                            Output.displayDontHave("produtos no estoque");
                            break;
                        }
                        StockedProduct.sellStockedProduct();
                    }

                    break;
                }
                case 2: {
                    if(TaxCoupon.taxCoupons.isEmpty()){
                        Output.displayDontHave("cupons fiscais");
                        break;
                    }

                    String list = "Data | Produto | Valor do Produto | Quantidade | Valor Total";
                    for(TaxCoupon taxCoupon: TaxCoupon.taxCoupons){
                        list += "\n" + taxCoupon.getDate() + " | " + taxCoupon.getProductDescription() + " | " + String.format("%.2f",taxCoupon.getProductValue())
                                + " | " + taxCoupon.getProductQuantity() + " | " + String.format("%.2f",taxCoupon.getValue());
                    }

                    Output.displayList(list);
                    break;
                }
            }

        } while (optionMenu != 3);
        // Close program
        Output.displayFinishProgram();
        System.exit(0);
    }
}
