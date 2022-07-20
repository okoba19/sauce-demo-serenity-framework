package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class ProductsPage extends CommonPage{

    private static final String PRODUCT_TITLE_MASK = "//div[@class='inventory_list']//div[text()='%s']";

    @FindBy(xpath = "//div[@class='app_logo']")
    WebElementFacade mainContent;

    @FindBy(xpath = "//div[@class='inventory_list']")
    WebElementFacade productsList;

    public WebElementFacade getSingleProductTitleByString (String productTitle){
        return find(By.xpath(String.format(PRODUCT_TITLE_MASK, productTitle)));
    }

}
