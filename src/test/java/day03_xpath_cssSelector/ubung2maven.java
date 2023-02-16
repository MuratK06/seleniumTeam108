package day03_xpath_cssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ubung2maven {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");

        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("iphone 14 pro"+ Keys.ENTER);
        driver.findElement(By.xpath("//img[@class='s-image']")).click();
        driver.findElement(By.xpath("//i[@class='ssf-share-trigger']")).click();
        driver.navigate().back();
        //driver.findElement(By.xpath("//a[@class='a-link-normal']")).click();
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();


    }
}
