package day03_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ubung {
    public static void main(String[] args) throws InterruptedException {

        // 1- bir class olusturun

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        //4- Sayfayi “refresh” yapin
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        //6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
        //7- Birthday butonuna basin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("apple watch series 8");
        aramaKutusu.submit();

        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//img[@class='s-image']")).click();
        driver.findElement(By.xpath("//span[@class='a-button a-button-thumbnail a-button-toggle a-button-unavailable']")).click();
        driver.findElement(By.xpath("//img[@class='kfs-img']")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();
        //9- Gift card details’den 25 $’i secin
        //10-Urun ucretinin 25$ oldugunu test edin
        //11-Sayfayi kapatin


    }
}
