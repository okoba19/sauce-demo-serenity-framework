package definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Steps;
import steps.CommonSteps;
import steps.LoginSteps;

@Slf4j
public class LoginDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    public CommonSteps commonSteps;

    @Given("I open a Login page")
    public void openLoginPage() {
        commonSteps.openLoginPage();
        loginSteps.waitForLoginPageLoading();
    }

    @When("I enter {string} in the Username input field on the login page")
    public void enterUsername(String username) {
        loginSteps.enterUsername(username);
    }

    @When("I enter {string} in the Password input field on the login page")
    public void enterPassword(String password) {
        loginSteps.waitForLoginPageLoading();
        loginSteps.enterPassword(password);
        log.info(password);
    }

    @When("I click on the Login button on the login page")
    public void clickLoginButton() {
        loginSteps.clickLoginButton();
    }

}
