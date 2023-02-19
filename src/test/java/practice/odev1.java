package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // ...Exercise3...
        //    go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();
        driver.navigate().refresh();
        // driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
        // driver.findElement(By.id("ez-accept-all")).click();
        // driver.findElement(By.className("ns-yanhk-e-16 button-common close-button")).click();

        //    fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kaan");
        //    fill the lastname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Alkan");
        JavascriptExecutor javascript = (JavascriptExecutor)driver;
        javascript.executeScript("window.scrollBy(0,350)");
        //    check the gender
        driver.findElement(By.xpath("//input[@name='sex']")).click();
        //    check the experience
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        //    fill the date
        driver.findElement(By.id("datepicker")).sendKeys("2022-05-05");
        //    choose your profession -> Automation Tester
        driver.findElement(By.id("profession-1")).click();
        //    choose your tool -> Selenium Webdriver
        driver.findElement(By.id("tool-2")).click();
        //    choose your continent -> Antartica
        driver.findElement(By.xpath("//option[text()='Antartica']")).click();
        //    choose your command  -> Browser Commands
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        javascript.executeScript("window.scrollBy(0,350)");
        Thread.sleep(2000);
        //    click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        System.out.println("islem tamam");
        driver.close();

    }
}
