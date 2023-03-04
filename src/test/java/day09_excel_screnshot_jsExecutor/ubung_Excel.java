package day09_excel_screnshot_jsExecutor;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ubung_Excel {

    @Test
    public void test01() throws IOException {
        String dosyaYolu="src/test/java/day09_excel_screnshot_jsExecutor/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);

        //- 1.satirdaki 2.hucreye gidelim ve yazdiralim

        System.out.println(workbook.getSheet("Sayfa1").getRow(0).getCell(1));

        //- 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
        String istenendata=workbook.getSheet("Sayfa1").getRow(0).getCell(1).toString();
        System.out.println("istenen data: "+istenendata);
        //- 2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
        String expectedicerik="Kabil";
        String actualicerik= workbook.getSheet("Sayfa1").getRow(1).getCell(3).toString();
        Assert.assertEquals(expectedicerik,actualicerik);
        //- Satir sayisini bulalim
        System.out.println("satir sayisi:"+ workbook.getSheet("Sayfa1").getLastRowNum());
        //- Fiziki olarak kullanilan satir sayisini bulun
        System.out.println("fiziki satir sayisi: ="+(workbook.getSheet("Sayfa1").getLastRowNum()+1));
        //- Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim


        Map<String,String> ulkelerMap= new TreeMap<>();

        int sonSatirIndex=workbook.getSheet("Sayfa1").getLastRowNum();

        for (int i = 1; i <=sonSatirIndex ; i++) {

            String key=workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            String value=workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();

            ulkelerMap.put(key,value);

        }
        System.out.println(ulkelerMap);

        Set<Map.Entry<String,String>> ulkeleEntrySet=ulkelerMap.entrySet();

        for (Map.Entry<String,String> eachEnty:ulkeleEntrySet
             ) {
            System.out.println(eachEnty);
        }
    }

}
