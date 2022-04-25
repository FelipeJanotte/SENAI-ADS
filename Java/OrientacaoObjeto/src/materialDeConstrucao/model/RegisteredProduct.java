package materialDeConstrucao.model;

import java.util.ArrayList;

public class RegisteredProduct{
    private static ArrayList<Product> products = new ArrayList<>();

    public static ArrayList<Product> getRegisteredProducts() {
        return products;
    }

    public static void registerProduct(String id, String description, double price){
        Product product = new Product();
        product.setId(id);
        product.setDescription(description);
        product.setPrice(price);
        products.add(product);
    }

    public static String listRegisteredProducts() {
        String list = "Codigo | Produto | Valor ";

        for(Product product: products){
            list += "\n" + product.getId() +" | " + product.getDescription()
                    + " | " + String.format("%.2f",product.getPrice());
        }

        return list;
    }

    public static boolean verifyIdExists(String id){
        for(Product product: products){
            if(product.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyRegisteredProductsIsEmpty(){
        return products.isEmpty();
    }

    public static String[] createMenuRegisteredProducts() {

        String[] menuOptions = new String[products.size()];

        for (Product product : products) {
            // For each product from registered product, add to menu options
            menuOptions[products.indexOf(product)] = product.getDescription() + " | " + product.getPrice() + " | " +
                    product.getQuantity();
        }
        return menuOptions;
    }
}
