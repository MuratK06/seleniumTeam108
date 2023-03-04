package day08_ecplicitlyWait_cookies_webTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utuluties.TestBase;

public class ubung_4 extends TestBase {

    @Test
    public void test01() {


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        String expected="http://automationexercise.com/";
        String actual= driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[text()= ' Signup / Login']")).click();
        //5. Verify 'Login to your account' is visible
        WebElement loginelement= driver.findElement(By.xpath("//h2[text()= 'Login to your account']"));
        Assert.assertTrue(loginelement.isDisplayed());
        //6. Enter correct email address and password
        WebElement mail= driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        mail.sendKeys("muratkorkmaz8306@gmail.com");
        WebElement password= driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys("021226033");
        //7. Click 'login' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        //8. Verify that 'Logged in as username' is visible
        //9. Click 'Delete Account' button
        //10. Verify that 'ACCOUNT DELETED!' is visible

    }
}
