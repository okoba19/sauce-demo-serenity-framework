package pages;

import org.openqa.selenium.support.FindBy;

import lombok.Getter;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class SingleProductPage extends CommonPage {

    @FindBy(xpath = "//div[@class='inventory_details_img_container']/img")
    public WebElementFacade mainContent;

    @FindBy(xpath = "//div[@class='inventory_details_price']")
    public WebElementFacade productPrice;

}
