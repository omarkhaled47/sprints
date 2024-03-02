package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.BeforeMethod;

import page_objects.homepage.HomepageHelper;

public class SearchProductSteps {

    @Given("Customer opens the browser and navigates to egypt laptop website")
    public void customerOpensTheBrowserAndNavigatesToEgyptLaptopWebsite() {
    }

    @When("Customer enters the name of the {string} he want to search for in search products field")
    public void customerEntersTheNameOfTheHeWantToSearchForInSearchProductsField(String product) {
        HomepageHelper.searchForProduct(product);
    }

    @Then("Validate customer can see popular suggestions appears")
    public void validateCustomerCanSeePopularSuggestionsAppears() {
        HomepageHelper.assertSuggestionsProducts();
    }

    @When("Customer press the search button")
    public void customerPressTheSearchButton() {
        HomepageHelper.clickSearchBtn();
    }

    @Then("Validate customer can see the number of products found")
    public void validateCustomerCanSeeTheNumberOfProductsFound() {
        HomepageHelper.assertProductsFoundNumber();
    }

    @And("Validate customer can see the products found")
    public void validateCustomerCanSeeTheProductsFound() {
        HomepageHelper.assertProductsFound();
    }


    @And("Validate customer can see no products found message appears")
    public void validateCustomerCanSeeNoProductsFoundMessageAppears() {
        HomepageHelper.assertNoProductFound();
    }
}
