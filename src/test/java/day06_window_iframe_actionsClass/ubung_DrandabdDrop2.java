package day06_window_iframe_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utuluties.TestBase;

public class ubung_DrandabdDrop2 extends TestBase {

    @Test
    public void test01(){

        //Yeni bir class olusturalim: MouseActions3
        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin
        //mouse’u bu menunun ustune getirin
        Actions actions=new Actions(driver);
        WebElement actionsElement= driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        actions.moveToElement(actionsElement).perform();

        //3- “Create a list” butonuna basin
        driver.findElement(By.xpath("(//span[@class='nav-text'])[1]")).click();
        //4- Acilan sayfada “Your Lists” yazisi oldugunu test edin
        String expectedyazi="Meine Listen";
        String actuelyazi=driver.findElement(By.xpath("//div[@role='heading']")).getText();
        Assert.assertEquals(expectedyazi,actuelyazi);
        bekle(3);

    }

}
