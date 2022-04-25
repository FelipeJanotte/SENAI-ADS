package materialDeConstrucao.model;

import java.util.ArrayList;

public class TaxCouponList {
    public static ArrayList<TaxCoupon> taxCoupons = new ArrayList<>();

    public static void createTaxCoupon(String description, double productPrice, double value, int quantity ) {
        TaxCoupon taxCoupon = new TaxCoupon();
        taxCoupon.setDate();
        taxCoupon.setProductDescription(description);
        taxCoupon.setProductValue(productPrice);
        taxCoupon.setValue(value);
        taxCoupon.setProductQuantity(quantity);

        taxCoupons.add(taxCoupon);
    }
}
