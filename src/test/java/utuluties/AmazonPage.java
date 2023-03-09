package utuluties;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class AmazonPage extends  TestBase{

    @Test
    public void amazonAnasayfa(){

        ////Soru 1 :
        ////-> Amazon anasayfaya gidebilecek sekilde bir page sayfasi olusturun : AmazonPage
        ////-> Amazon ana sayfasinda en altta bulunan Webtable'i inceleyebilmek icin
        driver.get("https://www.amazon.com");
        ////-> AmazonPage clasinda en altta gitme isini yapacak bir method olusturun
        ////-> Tests paketi altinda yeni bir class olusturun: D26_AmazonSatirSutunSayisi
        ////-> Bu class'in altinda bir test method olusturun : satirSayisi( ) ve webtable'da 10
        ////   satir oldugunu test edin
        ////-> Yeni bir method olusturun : sutunSayisi( ) ve yazi olan sutun sayisinin 7oldugunu
        ////   test edin
    }
    @Test
    public void webtable(){
        ////-> AmazonPage clasinda en altta gitme isini yapacak bir method olusturun
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.END).perform();

    }
}
