package steps;

import static org.hamcrest.Matchers.is;

import java.time.Duration;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.thucydides.core.steps.ScenarioSteps;
import pages.SingleProductPage;

public class SingleProductPageSteps extends ScenarioSteps {

    @Page
    SingleProductPage singleProductPage;

    public void waitForLoginPageLoading() {
        singleProductPage.withTimeoutOf(
            Duration.ofSeconds(20l)).waitFor(ExpectedConditions.visibilityOf(singleProductPage.getMainContent()));
    }

    public void verifySingleProductPriceCurrentlyVisible() {
        waitForLoginPageLoading();
        MatcherAssert.assertThat("Product price is not currently visible",
            singleProductPage.getProductPrice().isCurrentlyVisible(), is(true)
        );
    }

}
