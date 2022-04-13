package materialDeConstrucao.model;

import materialDeConstrucao.view.Input;
import materialDeConstrucao.view.Output;

import javax.swing.*;
import java.util.ArrayList;

public class StockedProduct {
    public static ArrayList<Product> products = new ArrayList<>();

    public static void addProductToStock() {
        int option;
        do{
            ArrayList<Product> registeredProducts = new ArrayList<>(RegisteredProduct.products);

            String[] menuOptions = new String[registeredProducts.size()];

            for(Product product: registeredProducts){
                // For each product from registered product, add to menu options
                menuOptions[registeredProducts.indexOf(product)] = product.getDescription() + " | " + product.getPrice() + " | " +
                    product.getQuantity();
            }

            int productIndex = Input.requestProductToSell(menuOptions); // Get option index
            Product product = registeredProducts.get(productIndex); // Get selected product by its index(code)
            int quantity = Input.requestProductQuantity("adicionar ao estoque");

            if(!products.contains(product)){
                // If product isn't on Stock, add it!
                products.add(product);
            }

            product.setQuantity(quantity + product.getQuantity());

            option = Input.continueMenu("Continuar adicionando produtos ao estoque?");
        } while(option != 1);

    }

    public static void listStockedProducts(){
        String list = "Produto | Valor | Quantidade";

        for(Product product: products){
            list += "\n" + product.getDescription() + " | " + String.format("%.2f",product.getPrice()) + " | "
                    + product.getQuantity() ;
        }

        Output.displayList(list);
    }

    public static void sellStockedProduct() {
        String[] menuOptions = new String[products.size()];
        for(Product product: products){
            // Add each stock product to menu options
            menuOptions[products.indexOf(product)] = product.getDescription() + " | " + String.format("%.2f",product.getPrice()) + " | " + product.getQuantity();
        }
        int productIndex = Input.requestMenu(menuOptions, "Vender Produtos");
        Product productToSell = products.get(productIndex); // Get product by selected option

        int quantity = Input.requestProductQuantity("vender");

        if(productToSell.getQuantity() - quantity < 0){
            // Can't sell! Don't have enough quantity!
            JOptionPane.showMessageDialog(null, "Voce nao possui quantidade suficiente desse " +
                    "produto para vender!");
            return; // End method
        } else if(productToSell.getQuantity() - quantity == 0){
            // Set the product's quantity to zero and remove from Stock
            productToSell.setQuantity(0);
            products.remove(productIndex);
        } else {
            // Decrease product's quantity by selling
            productToSell.setQuantity(productToSell.getQuantity() - quantity);
        }

        double value = productToSell.getPrice() * quantity;

        // Create new tax coupon
        TaxCoupon taxCoupon = new TaxCoupon();
        taxCoupon.setDate();
        taxCoupon.setProductDescription(productToSell.getDescription());
        taxCoupon.setProductValue(productToSell.getPrice());
        taxCoupon.setValue(value);
        taxCoupon.setProductQuantity(quantity);

        Output.displayTaxCoupon(taxCoupon);

        TaxCoupon.taxCoupons.add(taxCoupon);
    }
}
