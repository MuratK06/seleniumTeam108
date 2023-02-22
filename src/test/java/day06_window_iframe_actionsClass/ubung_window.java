package day06_window_iframe_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utuluties.TestBase;

public class ubung_window extends TestBase {

    @Test
    public void test01(){

        //● Yeni bir class olusturun: WindowHandle
        //● Amazon anasayfa adresine gidin.
        driver.get("https://www.amazon.com");
        //● Sayfa’nin window handle degerini String bir degiskene atayin
        String amazonWindowHanleDegeri= driver.getWindowHandle();
        //● Sayfa title’nin “Amazon” icerdigini test edin
        WebElement ilkyaziAmazon=driver.findElement(By.id("nav-logo-sprites"));
        String expectedTitleamazon="Amazon";
        String actualTitleamazon= ilkyaziAmazon.getText();
        Assert.assertTrue(actualTitleamazon.contains(expectedTitleamazon));
        //● Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");
        //● Sayfa title’nin “wisequarter” icerdigini test edin
         String expectedTitleWise="IT Bootcamp, Distance education method - Wise Quarter Course";
       String actualTitleWise= driver.getTitle();
        Assert.assertEquals(expectedTitleWise,actualTitleWise);
        //● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.walmart.com");
        //● Sayfa title’nin “Walmart” icerdigini test edin
       String expectedTitleWal="Walmart.com | Save Money. Live Better";
        String actualTitleWal= driver.getTitle();
        Assert.assertEquals(expectedTitleWal,actualTitleWal);
        //● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(amazonWindowHanleDegeri);
    }
}
