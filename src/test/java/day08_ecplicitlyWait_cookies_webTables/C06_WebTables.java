package day08_ecplicitlyWait_cookies_webTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utuluties.TestBase;

import java.util.List;

public class C06_WebTables extends TestBase {

    @Test
    public void test01(){
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");
        //  2. Headers da bulunan basliklari yazdirin
        WebElement headers= driver.findElement(By.xpath("//div[@class='element-list collapse show']"));
        System.out.println("headers basliklari:"+headers.getText());
        //  3. 3.sutunun basligini yazdirin
        WebElement sutun3= driver.findElement(By.xpath("(//li[@class='btn btn-light '])[3]"));
        System.out.println("3. sutunun basligi:"+sutun3.getText());
        //  4. Tablodaki tum datalari yazdirin
        WebElement tumdetay= driver.findElement(By.xpath("//div/div/div[2]/div[2]/div[2]/div[3]/div[1]"));
        //  5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        List<WebElement> satirlar= driver.findElements(By.xpath("//div[@class='rt-td']"));
        int sayac=0;
        for (WebElement dolu:satirlar
        ) {
            if(!(dolu.getText().isBlank())){
                sayac++;
            }
        }
        System.out.println("data sayisi:"+sayac);
        //  6. Tablodaki satir sayisini yazdirin
        List<WebElement> satirsayisi=driver.findElements(By.xpath("//div[@role='rowgroup']"));
        System.out.println("satir sayisi: "+satirsayisi.size());
        //  7. Tablodaki sutun sayisini yazdirin
        List<WebElement> sutunsayisi=driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
        System.out.println("sutun sayisi: "+sutunsayisi.size());
        //  8. Tablodaki 3.kolonu yazdirin
        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        // 10. Bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde
        //     bana datayi yazdirsin
    }
}
