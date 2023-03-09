package day08_ecplicitlyWait_cookies_webTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utuluties.AmazonPage;

import java.util.List;

public class D26_AmazonSatirSutunSayisi extends AmazonPage {

    @Test
    public void satirSayisi(){

        List<WebElement> satirlarListesi = driver.findElements(By.xpath("(//tbody/tr"));

        Assert.assertEquals(10,satirlarListesi.size());
        int satirno=1;

        for (WebElement eachsatir:satirlarListesi
             ) {
            System.out.println(satirno+" - "+ eachsatir.getText());
            satirno++;
        }
    }
@Test
    public void sutunSayisi(){

        List<WebElement> sutunSayilari=driver.findElements(By.xpath("//tbody/tr[3]/td"));
        Assert.assertEquals(13,sutunSayilari);


}
}
