package pages;

import org.openqa.selenium.support.FindBy;

import lombok.Getter;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class LoginPage extends CommonPage {

    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElementFacade mainContent;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElementFacade loginButton;

    @FindBy (xpath = "//input[contains(@class, 'form_input') and @placeholder='Username']")
    private WebElementFacade usernameLoginInputField;

    @FindBy (xpath = "//input[contains(@class, 'form_input') and @placeholder='Password']")
    private WebElementFacade passwordLoginInputField;

}
