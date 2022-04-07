package materialDeConstrucao.model;

public class Product {
    private String id;
    private String description;
    private double price;
    private int quantity;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }
}
