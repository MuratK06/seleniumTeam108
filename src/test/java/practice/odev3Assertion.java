package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev3Assertion {

    // Navigate to website https://testpages.herokuapp.com/styled/index.html
    //    Under the ORIGINAL CONTENTS
    //    click on Alerts
    //    print the URL
    //    navigate back
    //    print the URL
    //    Click on Basic Ajax
    //    print the URL
    //    enter value 20 and ENTER
    //    and then verify Submitted Values is displayed open page
    //    close driver

    public static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void therdan() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public  void test01(){
       // Navigate to website https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //    Under the ORIGINAL CONTENTS
        //    click on Alerts
        driver.findElement(By.id("alerts")).click();

        //    navigate back
        driver.navigate().back();

    }
    @Test
    public  void test02(){
        // Click on Basic Ajax
        driver.findElement(By.id("basicajax")).click();
    }

    @Test
    public  void test03(){

        //    enter value 20 and ENTER
        driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);
        //    and then verify Submitted Values is displayed open page
        WebElement dogrulama= driver.findElement(By.id("_language_id"));
        Assert.assertTrue(dogrulama.isDisplayed());
        System.out.println(driver.findElement(By.id("_language_id")).getText());
    }
}
