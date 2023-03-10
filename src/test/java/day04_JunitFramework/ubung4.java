package day04_JunitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ubung4 {

    @Test
    public void test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");
        //2- arama kutusunu locate edelim
        WebElement aramakutusu =driver.findElement(By.id("twotabsearchtextbox"));
        //3- “Samsung headphones” ile arama yapalim
        aramakutusu.sendKeys("Samsung headphones");
        aramakutusu.submit();
        //4- Bulunan sonuc sayisini yazdiralim
        System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
        //5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("//img[@class='s-image']")).click();
        //6- Sayfadaki tum basliklari yazdiralim
        System.out.println(driver.findElement(By.id("productTitle")).getText());
        Thread.sleep(3000);
        driver.close();
    }
}
