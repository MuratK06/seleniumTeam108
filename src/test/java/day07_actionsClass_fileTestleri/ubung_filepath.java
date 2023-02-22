package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ubung_filepath {

    @Test
            public void test01(){
        String dosyayolu=System.getProperty("user.home")+"/Downloads/logo.png";

        Assert.assertTrue(Files.exists(Paths.get(dosyayolu)));
    }



}
