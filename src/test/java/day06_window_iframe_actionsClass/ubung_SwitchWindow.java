package day06_window_iframe_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utuluties.TestBase;

import java.util.Set;

public class ubung_SwitchWindow extends TestBase {

    @Test
    public void test01(){

        //● Tests package’inda yeni bir class olusturun: WindowHandle2
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement ilkSayfaYaziElementi= driver.findElement(By.tagName("h3"));
        String expectedyazi="Opening a new window";
        String actuelyazi= ilkSayfaYaziElementi.getText();
        Assert.assertEquals(expectedyazi,actuelyazi);
        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expectedTitle="The Internet";
        String  actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        bekle(2);
        String ilksayfaWHD= driver.getWindowHandle();
        //● Click Here butonuna basın.
         driver.findElement(By.linkText("Click Here")).click();
        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu
        //dogrulayin.
        Set<String> tumSayfalarWHDSeti= driver.getWindowHandles();
        String ikincisayfaWHD="";
        for (String each:tumSayfalarWHDSeti
             ) {
            if (!each.equals(ilksayfaWHD)){
                ikincisayfaWHD=each;
            }
        }
        driver.switchTo().window(ikincisayfaWHD);
        expectedTitle="New Window";
        actualTitle= driver.getTitle();
        bekle(2);
        Assert.assertEquals(expectedTitle,actualTitle);
        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        String ikinciSayfaYazi=driver.findElement(By.tagName("h3")).getText();
        expectedyazi="New Window";
        Assert.assertEquals(expectedyazi,ikinciSayfaYazi);
        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet”
        //olduğunu doğrulayın
        driver.switchTo().window(ilksayfaWHD);
        expectedTitle="The Internet";
        actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        bekle(3);

    }
}
