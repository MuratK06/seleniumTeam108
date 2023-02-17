package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {

    public static void main(String[] args) {

        // 1 - Driver olusturalim
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32");
        WebDriverManager.chromedriver().setup();
        // 2 - Java class'imiza chromedriver.exe'yi tanitalim
        WebDriver driver = new ChromeDriver();
        // 3 - Driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();
        // 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        // 5 - "https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        // 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String ottoTitle=driver.getTitle();
        String ottoUrl=driver.getCurrentUrl();
        // 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
        WebElement ottokelime = driver.findElement(By.className("san-svg"));
        System.out.println(driver.findElement(By.className("san-svg")).getText());
        Assert.assertTrue(ottokelime.isDisplayed());
        // 8 - Ardindan "https://wisequarter.com/" adresine gidelim
        driver.get("https://wisequarter.com/");
        // 9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
        //     kontrol edelim
          WebElement wisequarter=driver.findElement(By.xpath("//img[@width='600']"));
        System.out.println(driver.findElement(By.xpath("//img[@width='600']")).getText());
        Assert.assertTrue(wisequarter.isDisplayed());
        // 10- Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
        // 11- Sayfayi yenileyelim
        driver.navigate().refresh();
        // 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        // 13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.close();
    }
}
