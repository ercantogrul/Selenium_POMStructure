package pages.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class AmazonCartPage extends AmazonBasePage{

    public AmazonCartPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath =  "//select[@id='quantity']")
    WebElement dropQuantity;


    @FindBy(id = "sc-subtotal-label-activecart")
    public WebElement subTotalLabel;


    @FindBy(id = "sc-subtotal-amount-activecart")
    WebElement subTotalAmount;


    @FindBy(xpath ="//div[@class='sc-badge-price-to-pay']" )
    WebElement productPrice;

    public void selectOuantity(int quantity) {
        Select select = new Select(dropQuantity);
        select.selectByIndex(quantity);
    }

    public double getProductPrice(){
        //$ isareti oldugundan manipule ettik..
        return Double.parseDouble(productPrice.getText().substring(1));
    }

    public double getSubTotalAmount(){
        // bazen web sayfalarinda gorununen bosluklara dikkat edelim,
        // $ isaretinden once bolsuk old icin 2 den basladik
        return Double.parseDouble(subTotalAmount.getText().substring(2));
    }
}
