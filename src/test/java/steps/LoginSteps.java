package steps;

import java.time.Duration;

import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;

public class LoginSteps extends ScenarioSteps {

    private WebDriver driver;

    @Page
    private LoginPage loginPage;

    public void waitForLoginPageLoading() {
        loginPage.withTimeoutOf(
            Duration.ofSeconds(20l)).waitFor(ExpectedConditions.visibilityOf(loginPage.getMainContent()));
    }

    public void enterUsername(String username){
        loginPage.getUsernameLoginInputField().sendKeys(username);
        waitFor(50000);
    }

    public void enterPassword(String password){
        loginPage.getPasswordLoginInputField().sendKeys(password);
    }

    public void clickLoginButton(){
        loginPage.getLoginButton().click();
    }

}
