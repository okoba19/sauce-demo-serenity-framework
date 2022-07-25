package steps;

import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.CommonPage;

public class CommonSteps extends ScenarioSteps {
    private final String BASE_URL = "https://www.saucedemo.com/";

    private WebDriver driver;

    @Page
    private CommonPage commonPage;

    public void openBrowser() {
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
    }

    @Step
    public void openLoginPage(){
        openBrowser();
        getDriver().get(BASE_URL);
    }

    @Step
    public void refreshPage() {
        getDriver().navigate().refresh();
    }

}
