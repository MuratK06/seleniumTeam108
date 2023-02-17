package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
    public static void main(String[] args) {



    // Exercise1...
    //    Create a new class under Q1 create main method
    //    Set Path
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32");
        WebDriverManager.chromedriver().setup();
    //    Create chrome driver
        WebDriver driver = new ChromeDriver();
    //    Maximize the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    //    Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");
    //    On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
        driver.navigate().to("https://www.amazon.com/");
        //driver.get("https://www.amazon.com/");
        driver.navigate().back();
    //    Navigate forward to amazon
        driver.navigate().forward();
    //    Refresh the page
        driver.navigate().refresh();
    //    Close/Quit the browser
        driver.close();
    //    And last step : print "All Ok" on console
        System.out.println("All ok");
}
}

