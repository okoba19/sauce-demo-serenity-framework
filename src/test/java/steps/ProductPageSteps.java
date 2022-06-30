package steps;

import static org.hamcrest.Matchers.is;

import java.sql.Struct;
import java.time.Duration;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.thucydides.core.steps.ScenarioSteps;
import pages.ProductPage;

public class ProductPageSteps extends ScenarioSteps {

    @Page
    ProductPage productPage;

    public void waitForLoginPageLoading() {
        productPage.withTimeoutOf(
            Duration.ofSeconds(20l)).waitFor(ExpectedConditions.visibilityOf(productPage.getMainContent()));
    }

    public void verifyProductListIsVisible() {
        waitForLoginPageLoading();
        MatcherAssert.assertThat("Product list is not currently visible",
            productPage.getProductsList().isCurrentlyVisible(), is(true)
        );
    }
}
