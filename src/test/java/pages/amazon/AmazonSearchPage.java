package pages.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonSearchPage extends AmazonBasePage{
    public AmazonSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // //img[@class='s-image']
    @FindBy(xpath = "//a[@class='a-link-normal s-no-outline']")
    List<WebElement> products;

    public void navigateToProduct(int index){
        products.get(index).click();
    }
}
