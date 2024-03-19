package tests.parallelTestWithThreadLocalDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactoryStaticThreadLocal;

import java.lang.reflect.Method;

public class Test2WithStaticWebDriver {
    @BeforeClass
    public void setUp() throws InterruptedException
    {
        WebDriverFactoryStaticThreadLocal.setDriver();
        System.out.println("Browser setup by Thread "+Thread.currentThread().getId()+" and Driver reference is : "+WebDriverFactoryStaticThreadLocal.getDriver());
    }


    @Test
    public void FlipkartTest(Method m) throws InterruptedException
    {
        System.out.println(m.getName()+" of class TestOneWithStaticWebDriver Executed by Thread "+Thread.currentThread().getId()+" on driver reference "+WebDriverFactoryStaticThreadLocal.getDriver());
        WebDriverFactoryStaticThreadLocal.getDriver().get("https://www.flipkart.com/");
        Thread.sleep(1500);
        System.out.println("Title printed by Thread "+Thread.currentThread().getId()+" - "+WebDriverFactoryStaticThreadLocal.getDriver().getTitle()+" on driver reference "+WebDriverFactoryStaticThreadLocal.getDriver());
        WebDriverFactoryStaticThreadLocal.getDriver().manage().deleteAllCookies();

    }

    @Test
    public void MyntraTest(Method m) throws InterruptedException
    {
        System.out.println(m.getName()+" of class TestOneWithStaticWebDriver Executed by Thread "+Thread.currentThread().getId()+" on driver reference "+WebDriverFactoryStaticThreadLocal.getDriver());
        WebDriverFactoryStaticThreadLocal.getDriver().get("https://www.myntra.com/");
        Thread.sleep(1500);
        System.out.println("Title printed by Thread "+Thread.currentThread().getId()+" - "+WebDriverFactoryStaticThreadLocal.getDriver().getTitle()+" on driver reference "+WebDriverFactoryStaticThreadLocal.getDriver());
        WebDriverFactoryStaticThreadLocal.getDriver().manage().deleteAllCookies();

    }

    @AfterClass
    public void tearDown()
    {
        System.out.println("Browser closed by Thread "+Thread.currentThread().getId() + " and Closing driver reference is :"+WebDriverFactoryStaticThreadLocal.getDriver());
        WebDriverFactoryStaticThreadLocal.closeBrowser();
    }
}
