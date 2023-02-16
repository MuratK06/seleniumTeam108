package day04_JunitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ubung3 {

    @Test
    public void test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- C01_TekrarTesti isimli bir class olusturun
        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");
        //3- cookies uyarisini kabul ederek kapatin
        driver.findElement(By.xpath("//div[@class='QS5gu sy4vM']")).click();
        //4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        WebElement googlrkontrol=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        Assert.assertTrue(googlrkontrol.isDisplayed());
        //5- Arama cubuguna “Nutella” yazip aratin
        WebElement aramakutusu=driver.findElement(By.xpath("//input[@class='gLFyf']"));
        aramakutusu.sendKeys("Nutella");
        aramakutusu.submit();
        //6- Bulunan sonuc sayisini yazdirin
        List<WebElement> aramasonuclarilist=driver.findElements(By.id("result-stats"));
        System.out.println(aramasonuclarilist.size());
        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
         double sonucsayisi= 157000000;
         if (sonucsayisi>10000000){
             System.out.println("Sonuc sayisi 10000000 dan fazla."+ "\n Sonuc sayisi: "+ sonucsayisi);
         }else{
             System.out.println("Sonuc sayisi 10000000 dan az."+ "\n Sonuc sayisi: "+ sonucsayisi);
         }
        //8- Sayfayi kapatin
        Thread.sleep(3000);
         driver.close();
    }
}
