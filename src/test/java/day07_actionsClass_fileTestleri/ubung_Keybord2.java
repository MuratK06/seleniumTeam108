package day07_actionsClass_fileTestleri;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utuluties.TestBase;

public class ubung_Keybord2 extends TestBase {

    @Test
    public void test01(){

        //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        //2- Hover over Me First" kutusunun ustune gelin
        //3- Link 1" e tiklayin
        //4- Popup mesajini yazdirin
        //5- Popup'i tamam diyerek kapatin

        WebElement hoverkutusu= driver.findElement(By.xpath("//*[text()='Hover Over Me First!']"));
        WebElement link1kutusu= driver.findElement(By.xpath("(//div[@class='dropdown-content'])[1]"));
        Actions actions=new Actions(driver);
        actions.click(hoverkutusu)
                .click(link1kutusu).perform();

        driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        //6- “Click and hold" kutusuna basili tutun
        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        WebElement clickkutusu= driver.findElement(By.id("click-box"));

        actions.click(clickkutusu).perform();
        System.out.println("click ktusu mesaj: "+clickkutusu.getText());

        //8- “Double click me" butonunu cift tiklayin
        WebElement doublekutusu= driver.findElement(By.id("double-click"));
        actions.doubleClick(doublekutusu).perform();

        bekle(4);
    }
}
