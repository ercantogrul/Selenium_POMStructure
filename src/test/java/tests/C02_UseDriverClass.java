package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C02_UseDriverClass {
    //Go to URL: https://opensource-demo.orangehrmlive.com/
    //Verify title contains OrangeHRM.
    //Use Driver Class.

    @Test
    public void useDriverClass(){
       // WebDriver driver = new ChromeDriver();
        // bunun yerine driver i Driver classindan getiriyoruz

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        Assert.assertTrue(Driver.getDriver().getTitle().contains("OrangeHRM"));
        Driver.closeDriver();
    }
}
//  Question: Where do you static keyword in your framework?
//  Answer :
// In my Driver class, our driver is static so It can be shared across the framework(or so driver instance can be used)
