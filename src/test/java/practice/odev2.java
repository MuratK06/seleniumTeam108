package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Exercise4...
        //Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        //Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("25");
        //Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("5");
        //Click on Calculate
        driver.findElement(By.id("calculate")).click();
        //Get the result
        //Print the result
        System.out.println("islemin sonucu= "+driver.findElement(By.id("answer")).getText());
        Thread.sleep(3000);
        driver.close();
    }
}
