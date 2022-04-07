package materialDeConstrucao.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class TaxCoupon {
    public static ArrayList<TaxCoupon> taxCoupons = new ArrayList<>();

    private String productDescription;
    private int productQuantity;
    private double productValue;
    private double value;
    private String date;

    public void setProductDescription(String description) {
        this.productDescription = description;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductQuantity(int quantity) {
        this.productQuantity = quantity;
    }

    public int getProductQuantity(){
        return productQuantity;
    }

    public void setProductValue(double productValue){
        this.productValue = productValue;
    }

    public double getProductValue(){
        return productValue;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    public void setDate(){
        this.date = OffsetDateTime.now().getDayOfMonth() + "/" + OffsetDateTime.now().getMonthValue()
                + "/" + OffsetDateTime.now().getYear();

    }

    public String getDate(){
        return date;
    }
}
