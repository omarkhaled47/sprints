package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;
import page_objects.cart_page.CartPageHelper;
import page_objects.homepage.HomepageHelper;

public class AddItemsToCartSteps {

    @And("Customer clicks on the product he wants to purchase")
    public void customerClicksOnTheProductHeWantsToPurchase() {
        HomepageHelper.selectFirstProduct();
    }

    @And("Customer clicks on add to cart button")
    public void customerClicksOnAddToCartButton() {
        HomepageHelper.clickAddToCartBtn();
    }

    @And("Customer clicks on checkout button")
    public void customerClicksOnCheckoutButton() {
        HomepageHelper.clickCheckoutBtn();
    }

    @Then("Validate customer can see the product added to cart successfully")
    public void validateCustomerCanSeeTheProductAddedToCartSuccessfully() {
        CartPageHelper.assertProductAddedToCart();
    }

    @When("Customer clicks on cart button")
    public void customerClicksOnCartButton() {
        HomepageHelper.clickCart();
    }

    @Then("Validate customer can see empty cart message appears")
    public void validateCustomerCanSeeEmptyCartMessageAppears() {
        HomepageHelper.assertEmptyCart();
    }
}
