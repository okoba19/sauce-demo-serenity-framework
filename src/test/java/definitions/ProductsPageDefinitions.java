package definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ProductsPageSteps;

public class ProductsPageDefinitions {

    @Steps
    ProductsPageSteps productsPageSteps;

    @Then("The product list is displayed on the product page")
    public void verifyProductListIsVisible() {
        productsPageSteps.verifyProductListIsVisible();
    }

    @When("I click on the {string} product from the product list on the product page")
    public void singleProductTitleClick(String productTitle) {
        productsPageSteps.singleProductTitleClick(productTitle);
    }
}
