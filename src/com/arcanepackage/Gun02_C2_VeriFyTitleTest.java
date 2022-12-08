package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C2_VeriFyTitleTest {

    public static void main(String[] args) {
        //Path'i set et
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        //Chrome driver olustur
        WebDriver driver = new ChromeDriver();

//            Window'u Maximize et
        driver.manage().window().maximize();

        // "https://www.google.com/" sayfasını aç
        driver.get("https://www.google.com/");

        // google başlangıcının google oldugunuz doğrula
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("basarili");

        }else {
            System.out.println("basarisiz");
            System.out.println("beklenen: "+ expectedTitle);
            System.out.println("gercekte: " + actualTitle);
        }
        driver.close();

        /*
        Eger yazdıgınız scriptler başarısız olursa
        1- Script leri tekrar tekrar kosturuyoruz çalıstırıyoruz,
        2- Manuel testing yapıyoruz
        3- Biznes Analist (BA) ve Urunun sahibi belirler (Acteptans Criteria)
          Bir tester olarak sizin göreviniz dokumanlarda bulunan yanlışları duzeltmek degildir
          sizin göreviniz kodlarda hata bulmaktır.BAG = hata
          Sizin misyonunuz sadece bug veya kusur bulacak script (kod)

         */


    }
}
