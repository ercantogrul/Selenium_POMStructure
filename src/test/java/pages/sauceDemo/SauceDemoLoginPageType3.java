package pages.sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoLoginPageType3 {

   public By usernameBoxLocator = By.id("user-name");  // location i By class indan bir variableye atadik
   public By passwordBoxLocator = By.id("password");
   public By loginButtonLocator = By.id("login-button");



    public void loginSauceDemo(String username, String password) {  // method olusturduk
        Driver.getDriver().findElement(usernameBoxLocator).sendKeys(username);
        //usernameBoxLocator.sendKeys("username")

        Driver.getDriver().findElement(passwordBoxLocator).sendKeys(password);
        //passwordBoxLocator.sendKeys("password")

        Driver.getDriver().findElement(loginButtonLocator).click();
        //loginButtonLocator.click();


    }
}
