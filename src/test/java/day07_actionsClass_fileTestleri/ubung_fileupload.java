package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utuluties.TestBase;

public class ubung_fileupload extends TestBase {

    @Test
    public void test01(){

        //1.https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
        //2.chooseFile butonuna basalim
        //driver.findElement(By.id("file-upload")).click();
        //3.Yuklemek istediginiz dosyayi secelim.
        String dosyayolu=System.getProperty("user.home")+ "/Downloads/logo.png";
        WebElement chossefilebutonu= driver.findElement(By.id("file-upload"));
        chossefilebutonu.sendKeys(dosyayolu);
        //4.Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
        //5.“File Uploaded!” textinin goruntulendigini test edelim.

        WebElement fileUploadedYaziElementi=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedYaziElementi.isDisplayed());
        bekle(5);
    }

}
