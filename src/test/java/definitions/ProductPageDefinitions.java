package definitions;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ProductPageSteps;

public class ProductPageDefinitions {

    @Steps
    ProductPageSteps productPageSteps;

    @Then("The product list is displayed on the product page")
    public void verifyProductListIsVisible() {
        productPageSteps.verifyProductListIsVisible();
    }
}
