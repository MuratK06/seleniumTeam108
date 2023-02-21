package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
    public static WebDriver driver;

    // 1) Bir class oluşturun: YoutubeAssertions
    //2) https://www.youtube.com adresine gidin
    //3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
    //    ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
    //    ○ imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //    ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //    ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");

        WebElement cookiesKabulButonu= driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape yt-spec-touch-feedback-shape--touch-response-inverse'])[2]"));
        cookiesKabulButonu.click();
    }

    @AfterClass
    public static void theared() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void titleTest(){
        //    ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
        String expectedTitle= "YouTube";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Test
    public void imageTest(){
        //  ○ imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        WebElement logoElementi=driver.findElement(By.xpath("//yt-icon[@id='logo-icon']"));
        Assert.assertTrue(logoElementi.isDisplayed());
    }

    @Test
    public void serchBoxText(){
        //    ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement serchBoxElementi=driver.findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue(serchBoxElementi.isDisplayed());
    }

    @Test
    public void wrongTitleTest(){
        //    ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        String unexpectedTitle="youtube";
        String actualTitle=driver.getTitle();
        Assert.assertNotEquals(unexpectedTitle,actualTitle);
    }
}
