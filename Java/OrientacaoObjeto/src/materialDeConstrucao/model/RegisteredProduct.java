package materialDeConstrucao.model;

import java.util.ArrayList;
import materialDeConstrucao.view.*;

public class RegisteredProduct extends Product{
    public static ArrayList<Product> products = new ArrayList<>();

    public static void registerProduct(){
        int option = 0;
        do {

            String id = Input.requestProductId();
            while(verifyIdExists(id)){
                Output.displayIdAlreadyExist();
                id = Input.requestProductId();
            }
            String description = Input.requestProductDescription();
            double price = Input.requestProductPrice();

            Product product = new Product();
            product.setId(id);
            product.setDescription(description);
            product.setPrice(price);

            products.add(product);

            option = Input.continueMenu("Continuar registrando produtos?");
        }while(option != 1);

    }

    public static void listRegisteredProducts() {
        String list = "Codigo | Produto | Valor ";

        for(Product product: products){
            list += "\n" + product.getId() +" | " + product.getDescription()
                    + " | " + String.format("%.2f",product.getPrice());
        }

        Output.displayList(list);
    }

    private static boolean verifyIdExists(String id){
        for(Product product: products){
            if(product.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
