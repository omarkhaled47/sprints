package page_objects.cart_page;

import assertions.Assertions;

public class CartPageHelper extends CartPageElements {

    public static void assertProductAddedToCart() {
        Assertions.elementExists(productToPurchase);
    }

}
