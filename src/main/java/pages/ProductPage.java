package pages;

import org.openqa.selenium.support.FindBy;

import lombok.Getter;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class ProductPage extends CommonPage{

    @FindBy(xpath = "//div[@class='app_logo']")
    WebElementFacade mainContent;

    @FindBy(xpath = "//div[@class='inventory_list']")
    WebElementFacade productsList;

}
