package page_objects.homepage;

import actions.Actions;
import assertions.Assertions;

public class HomepageHelper extends HomepageElements {

    public static void searchForProduct(String product) {
        Actions.type(product,searchField);
    }

    public static void clickSearchBtn() {
        Actions.click(searchBtn);
    }

    public static void assertSuggestionsProducts() {
        Assertions.elementExists(suggestionsContainer);
    }

    public static void assertProductsFoundNumber() {
        Assertions.elementExists(productsFoundNumber);
    }

    public static void assertProductsFound() {
        Assertions.elementExists(productsFound);
    }

    public static void assertNoProductFound() {
        Assertions.assertTwoStrings("No products found matching the search criteria",noProductsFoundMsg);
    }

    public static void selectFirstProduct() {
        Actions.click(firstProduct);
    }

    public static void clickAddToCartBtn() {
        Actions.click(addToCartBtn);
    }

    public static void clickCheckoutBtn() {
        Actions.click(checkoutBtn);
    }

    public static void clickCart() {
        Actions.click(cartBtn);
    }

    public static void assertEmptyCart() {
        Assertions.assertTwoStrings("Cart is empty",emptyCartMsg);
    }
}
