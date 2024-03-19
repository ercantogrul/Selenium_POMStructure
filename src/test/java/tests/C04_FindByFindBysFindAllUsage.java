package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class C04_FindByFindBysFindAllUsage {
    //@FindBy, @FindBys ve @FindAll, Java programlama dili ve Selenium test otomasyon aracıyla web
    // sayfalarındaki elemanları bulmak için kullanılan annotasyonlardır.
    //@FindBy tek bir elemanı,
    //@FindBys birden çok kriteri birleştiren elemanları
    //@FindAll birden çok kriter arasında herhangi birini karşılayan elemanları bulmak için kullanılır.


    @FindBy(xpath = "//input[@id='twotabsearchtextbox' and @type='text']")
    public WebElement search;
    //FindBys a ihtiyac duymadan da bu sekilde handle edileblir
    //Locatordaki 'and'i OR yaparsak @FindAll gibi kullanmış oluyoruz.
    //@FindBy annotation'ı bu yapısı sayesinde bize yeterlidir, @FinbdBys ve @FindAll kullanımına gerek yoktur.

    //AND operatoru -FindBys
    @FindBys( {
            @FindBy(id="twotabsearchtextbox"),
            @FindBy(xpath = "//input[@type='text']")})
    public WebElement findBys;

    //OR operatoru -FindAll

    @FindAll( {
            @FindBy(),
            @FindBy(),
            @FindBy(),
            @FindBy()
    })
    public List<WebElement> findAll;
}
