package practice;

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

public class ubung {
    // 1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Signup / Login' button
    //5. Verify 'Login to your account' is visible
    //6. Enter correct email address and password
    //7. Click 'login' button
    //8. Verify that 'Logged in as username' is visible
    //9. Click 'Delete Account' button
    //10. Verify that 'ACCOUNT DELETED!' is visible

    public static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void theared() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public void test01(){
        // 1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement dogrulama1=driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(dogrulama1.isDisplayed());
        System.out.println("sayfa dogrulama basarili");
    }
    @Test
    public void test02(){
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        //5. Verify 'Login to your account' is visible
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Murat");
        //6. Enter correct email address and password
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("muratkorkmaz@gmail.com");
        //7. Click 'login' button
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    }
    @Test
    public void test03(){
        //8. Verify that 'Logged in as username' is visible
        //9. Click 'Delete Account' button
        //10. Verify that 'ACCOUNT DELETED!' is visible

    }



}
