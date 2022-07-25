package definitions;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.SingleProductPageSteps;

public class SingleProductPageDefinitions {

    @Steps
    SingleProductPageSteps singleProductPageSteps;

    @Then("The product price is displayed in the single product page")
    public void verifySingleProductPriceCurrentlyVisible () {
        singleProductPageSteps.verifySingleProductPriceCurrentlyVisible();
    }
}
