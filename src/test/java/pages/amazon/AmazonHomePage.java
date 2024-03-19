package pages.amazon;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonHomePage extends AmazonBasePage{
    public AmazonHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //HomePage ile ilgili diger WebElemenetler locate edilebilir..
}
