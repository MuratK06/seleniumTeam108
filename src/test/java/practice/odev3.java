package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Navigate to website https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //    Under the ORIGINAL CONTENTS
        //    click on Alerts
        driver.findElement(By.id("alerts")).click();
        //    print the URL

        //    navigate back
        driver.navigate().back();
        //    print the URL

        //    Click on Basic Ajax
        driver.findElement(By.id("basicajax")).click();

        //    print the URL
        //    enter value 20 and ENTER
        driver.findElement(By.id("lteq30")).sendKeys("20"+Keys.ENTER);
        //    and then verify Submitted Values is displayed open page
        WebElement dogrulama= driver.findElement(By.id("_language_id"));
        Assert.assertTrue(dogrulama.isDisplayed());
        System.out.println(driver.findElement(By.id("_language_id")).getText());
        //    close driver
        Thread.sleep(3000);
        driver.close();
    }
}
