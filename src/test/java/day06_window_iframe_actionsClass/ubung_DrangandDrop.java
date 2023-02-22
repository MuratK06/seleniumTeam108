package day06_window_iframe_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utuluties.TestBase;

public class ubung_DrangandDrop extends TestBase {

    @Test
    public void test01(){
        //1- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");
        //2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        WebElement dragmeElementi= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drophereElementi =driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(dragmeElementi,drophereElementi).perform();
        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        String expectedyazi="Dropped!";
        String actuelyazi=driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
        Assert.assertEquals(expectedyazi,actuelyazi);
        bekle(3);

    }
}
