package steps;

import static org.hamcrest.Matchers.is;

import java.time.Duration;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.thucydides.core.steps.ScenarioSteps;
import pages.ProductsPage;

public class ProductsPageSteps extends ScenarioSteps {

    @Page
    ProductsPage productsPage;

    public void waitForLoginPageLoading() {
        productsPage.withTimeoutOf(
            Duration.ofSeconds(20l)).waitFor(ExpectedConditions.visibilityOf(productsPage.getMainContent()));
    }

    public void verifyProductListIsVisible() {
        waitForLoginPageLoading();
        MatcherAssert.assertThat("Product list is not currently visible",
            productsPage.getProductsList().isCurrentlyVisible(), is(true)
        );
    }

    public void singleProductTitleClick(String productTitle) {
        productsPage.getSingleProductTitleByString(productTitle).click();
    }
}
