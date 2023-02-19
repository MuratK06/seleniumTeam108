package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutomationExcercise_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Test Case 1: Register User
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement dogrulama1=driver.findElement(By.xpath("//div[@class='logo pull-left']"));
        Assert.assertTrue(dogrulama1.isDisplayed());
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        //5. Verify 'New User Signup!' is visible
        //6. Enter name and email address
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Murat");
        driver.findElement(By.id("Email Address")).sendKeys("muratkorkmaz8306@gmail.com");
        //7. Click 'Signup' button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement dogrulama2=driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(dogrulama2.isDisplayed());
        //9. Fill details: Title, Name, Email, Password, Date of birth
        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    }
}
