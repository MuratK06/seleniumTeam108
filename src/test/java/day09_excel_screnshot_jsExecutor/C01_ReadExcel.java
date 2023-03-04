package day09_excel_screnshot_jsExecutor;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {

         /*
            Biz kodlarimizla bilgisayardaki bir dosyaya direk erisim saglayip
            anlik o dosyadan bilgi almayiz
            Bunun yerine class'in basinda, bilgisayarimizdaki excel dosyanin
            1- bir kopyasini olusturur
            2- excel'deki tum bilgileri kopya workbook'a yukler
            3- workbook uzerinde yapacagimiz tum islemleri yapariz
            4- eger olusturdugumuz workbook'da update yaparsak
               son halini excel'e islemek icin
               class'in sonunda kopya workbook'daki bilgileri excel'e kaydederiz.
         */


        // 1- bilgisayardaki excel e ulasabilmak icin dosyayolu gerekir

        String dosyaYolu="src/test/java/day09_excel_screnshot_jsExecutor/ulkeler.xlsx";

        // 2- Dosya yolu ulastirdigimiz excel den bilgileri almak icin Fileinput objesi olusturmaliyiz

        FileInputStream fis=new FileInputStream(dosyaYolu);

        // 3- bilgilerini aldigimiz excel de calisma yapabilmemiz icin kod ortaminda kopya bir workbook olusturmaliyiz

        Workbook workbook= WorkbookFactory.create(fis);

        // 4- Bilgisayarimizdaki excelin icinde bulunan tum bilgiler Workbook objesinde kayitli
        // excelin yapisi geregi sirayla
        // - istenen sayfa
        // - istenen satir
        // - istenen hucre
        // olusturulmalidir/okunmalidir

        // 12. satirin 3. hucresinin "Azerbaycan" oldugunu test edin
        Sheet sayfa1=workbook.getSheet("Sayfa1");

        // excel index kullanir yani 0 dan baslar
        Row row=sayfa1.getRow(11);
        Cell cell= row.getCell(2);

        System.out.println(cell);

        String expectedData="Azerbaycan";
        String actualData = cell.toString();
        Assert.assertEquals(expectedData,actualData);

    }
}
