package materialDeConstrucao.model;

import javax.swing.*;
import java.util.ArrayList;

public class StockedProduct {
    private static ArrayList<Product> products = new ArrayList<>();

    public static void addProductToStock(int quantity, Product product) {
        if (!products.contains(product)) {
            // If product isn't on Stock, add it!
            products.add(product);
        }

        product.setQuantity(quantity + product.getQuantity());
    }

    public static String listStockedProducts() {
        String list = "Produto | Valor | Quantidade";

        for (Product product : products) {
            list += "\n" + product.getDescription() + " | " + String.format("%.2f", product.getPrice()) + " | "
                    + product.getQuantity();
        }

        return list;
    }

    public static void sellStockedProduct(int productIndex, int quantity) {

        double value = 0;
        Product productToSell = products.get(productIndex); // Get product by selected option
        if (productToSell.getQuantity() - quantity < 0) {
            // Can't sell! Don't have enough quantity!
            JOptionPane.showMessageDialog(null, "Voce nao possui quantidade suficiente desse " +
                    "produto para vender!");
            return; // End method
        } else if (productToSell.getQuantity() - quantity == 0) {
            // Set the product's quantity to zero and remove from Stock
            productToSell.setQuantity(0);
            products.remove(productIndex);
        } else {
            // Decrease product's quantity by selling
            productToSell.setQuantity(productToSell.getQuantity() - quantity);
        }

        value = productToSell.getPrice() * quantity;


        // Create new tax coupon
        TaxCouponList.createTaxCoupon(productToSell.getDescription(), productToSell.getPrice(), value, quantity);

    }

    public static boolean verifyStockedProductsIsEmpty() {
        return products.isEmpty();
    }

    public static String[] createMenuStockedProducts(){
        String[] menuOptions = new String[products.size()];

        for (Product product : products) {
            // For each product from registered product, add to menu options
            menuOptions[products.indexOf(product)] = product.getDescription() + " | " + String.format("%.2f",product.getPrice()) + " | " +
                    product.getQuantity();
        }
        return menuOptions;
    }
}
