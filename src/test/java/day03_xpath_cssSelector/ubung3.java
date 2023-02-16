package day03_xpath_cssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ubung3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.mediamarkt.de/");
        driver.findElement(By.xpath("//button[@class='sc-140xkaw-1 ekVisH']")).click();

        WebElement aramakutusu=driver.findElement(By.xpath("//input[@type='text']"));
        aramakutusu.sendKeys("iphone 14 pro"+ Keys.ENTER);
        driver.findElement(By.xpath("//img[@crossorigin='anonymous']")).click();
        driver.findElement(By.id("pdp-add-to-cart-button")).click();
        driver.findElement(By.xpath("//button[@class='sc-140xkaw-1 iNaIdT sc-dn64wt-4 fVioGP']")).click();
        Thread.sleep(3000);
        driver.close();





    }
}
