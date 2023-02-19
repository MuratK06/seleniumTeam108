package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class a {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2. Go to the youtube web page and verify if the page title is "youtube", if not, print
        //the correct title (Actual Title) in the console.
        driver.get("https:www.youtube.com");
        Thread.sleep(3000);
        String expectedTitle ="youtube";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test1 PASSED");
        }else {
            System.out.println("Test1 FAILED. The correct title is : "+actualTitle);
        }
        //3. Verify if the page URL contains “youtube”, otherwise print the correct URL.
        String actualURL = driver.getCurrentUrl();
        if(actualURL.contains(expectedTitle)){
            System.out.println("Test2 PASSED");
        }else {
            System.out.println("Test2 FAILED. The correct URL is : "+actualURL);
        }
        //4. Then go to Amazon page https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //5. Go back to Youtube page
        driver.navigate().back();
        //6. Refresh the page
        driver.navigate().refresh();
        //7. Return to Amazon page
        driver.navigate().forward();
        //8. Make the page full
        //screen
        driver.manage().window().fullscreen();
        //9. Then verify if the page title contains "Amazon", otherwise print the correct title
        //(Actual Title)
        String expectedAmazonWord = "Amazon";
        String actualTitleAmazon = driver.getTitle();
        if(actualTitleAmazon.contains(expectedAmazonWord)){
            System.out.println("Test3 PASSED");
        } else{
            System.out.println("Test3 FAILED. The correct title is : "+actualTitleAmazon);
        }
        //10. Verify if the page URL is https://www.amazon.com/, otherwise print the correct
        //URL
        String expectedURL = "https://www.amazon.com/";
        String actualURLAmazon = driver.getCurrentUrl();
        if(actualURLAmazon.equals(expectedURL)){
            System.out.println("Test4 PASSED");
        }else {
            System.out.println("Test4 FAILED. The correct URL is : "+actualURLAmazon);
        }
        driver.close();
    }
}
