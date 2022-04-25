package materialDeConstrucao.controller;

import materialDeConstrucao.model.*;
import materialDeConstrucao.view.*;

public class Control {
    public static void showMenu() {

        int optionMenu = 0;

        do {
            String[] options = {"Registro de Produtos", "Estoque de Produtos", "Cupons Fiscais", "Sair do programa"};
            optionMenu = Input.requestMenu(options, "Material de construção");
            int optionSubMenu = Input.requestSubMenu(optionMenu);
            switch (optionMenu) {
                case 0: {
                    switch (optionSubMenu) {
                        case 0: {
                            // Register products (id, description, price)
                            int option = 0;
                            String id = "";
                            String description = "";
                            double price = 0;
                            do {
                                id = Input.requestProductId();
                                while (RegisteredProduct.verifyIdExists(id)) {
                                    Output.displayIdAlreadyExist();
                                    id = Input.requestProductId();
                                }
                                description = Input.requestProductDescription();
                                price = Input.requestProductPrice();
                                RegisteredProduct.registerProduct(id, description, price);
                                option = Input.requestContinueMenu("Continuar registrando produtos?");
                            } while (option != 1);

                            break;
                        }
                        case 1: {
                            // List registered products
                            if (RegisteredProduct.verifyRegisteredProductsIsEmpty()) {
                                Output.displayDontHave("produtos registrados");
                            } else {
                                String list = RegisteredProduct.listRegisteredProducts();
                                Output.displayList(list);
                            }
                            break;
                        }
                    }
                    break;
                }
                case 1: {
                    switch (optionSubMenu) {
                        case 0: {
                            // Add products on stock by id and quantity
                            if (RegisteredProduct.verifyRegisteredProductsIsEmpty()) {
                                Output.displayDontHave("produtos registrados");
                            } else {
                                int option = 0;
                                do {
                                    String[] menuOptionsRegisteredProducts = RegisteredProduct.createMenuRegisteredProducts();
                                    int productIndex = Input.requestProductToSell(menuOptionsRegisteredProducts); // Get option index
                                    Product product = RegisteredProduct.getRegisteredProducts().get(productIndex); // Get selected product by its index(code)

                                    int quantity = Input.requestProductQuantity("adicionar ao estoque");

                                    StockedProduct.addProductToStock(quantity, product);
                                    option = Input.requestContinueMenu("Continuar adicionando produtos ao estoque?");
                                } while (option != 1);
                            }
                            break; // subMenu
                        }
                        case 1: {
                            // List stock products
                            if (StockedProduct.verifyStockedProductsIsEmpty()) {
                                Output.displayDontHave("produtos no estoque");
                            } else {
                                String list = StockedProduct.listStockedProducts();
                                Output.displayList(list);
                            }
                            break; // subMenu
                        }
                        case 2: {
                            // Sell a product - create tax coupon (date, product's description, quantity, value)
                            if (StockedProduct.verifyStockedProductsIsEmpty()) {
                                Output.displayDontHave("produtos no estoque");
                            } else {
                                String[] menuOptions = StockedProduct.createMenuStockedProducts();
                                int productIndex = Input.requestMenu(menuOptions, "Vender Produtos");

                                int quantity = Input.requestProductQuantity("vender");

                                StockedProduct.sellStockedProduct(productIndex, quantity);
                                Output.displayTaxCoupon(TaxCouponList.taxCoupons.get((TaxCouponList.taxCoupons.size() - 1)));
                            }
                            break; // subMenu
                        }
                    }
                    break; // menu
                }
                case 2: {
                    if (TaxCouponList.taxCoupons.isEmpty()) {
                        Output.displayDontHave("cupons fiscais");
                    } else {
                        String list = "Data | Produto | Valor do Produto | Quantidade | Valor Total";
                        for (TaxCoupon taxCoupon : TaxCouponList.taxCoupons) {
                            list += "\n" + taxCoupon.getDate() + " | " + taxCoupon.getProductDescription() + " | " + String.format("%.2f", taxCoupon.getProductValue())
                                    + " | " + taxCoupon.getProductQuantity() + " | " + String.format("%.2f", taxCoupon.getValue());
                        }

                        Output.displayList(list);
                    }
                    break;
                }
            }

        } while (optionMenu != 3);
        // Close program
        Output.displayFinishProgram();
        System.exit(0);
    }
}
