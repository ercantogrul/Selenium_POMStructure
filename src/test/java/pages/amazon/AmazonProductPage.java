package pages.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonProductPage extends AmazonBasePage{
    public AmazonProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement btnAddCart;


    public void addProductToCart(){
        btnAddCart.click();
    }
}
