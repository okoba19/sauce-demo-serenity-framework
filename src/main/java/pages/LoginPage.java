package pages;

import org.openqa.selenium.support.FindBy;

import lombok.Getter;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class LoginPage extends CommonPage {

    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElementFacade mainContent;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElementFacade loginButton;

    @FindBy (xpath = "//input[@id='user-name']")
    private WebElementFacade usernameLoginInputField;

    @FindBy (xpath = "//input[@id='password']")
    private WebElementFacade passwordLoginInputField;

}
