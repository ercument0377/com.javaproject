package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C4_GetPageSource {
    public static void main(String[] args) {
        // path ı set et
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");

        //crome drive objesi olustur
        WebDriver driver = new ChromeDriver();

        // sayfayı maximize et
        driver.manage().window().maximize();

        // google anasayfasına git
        driver.get("https://www.google.com");

        //amazon sayfasına git
        driver.navigate().to("https:/www.amazon.com");

        // açılan sayfada bulunan kelimeleri bul
        //get.PageSource()  page source String olarak döndurur
        // Tüm sayfanın içinde istediğiniz bir tex (metin) kullanılıp kullanılmadığınız  doğrulayabilirim (verify)
       // Note: pageSource için assertion pek sık kullanılmaz cunku çok genel bilgi vardır
        //      bu genel bilgi bize false yanlış sonuc verebilir.
        String pageSource = driver.getPageSource();

       System.out.println(pageSource);

       // sayfada electronics kelimesi var mı kontrolet
      //  System.out.println(pageSource.contains("Electronics"));
        if(pageSource.contains("Gaming accessories")){
            System.out.println("Basarili");

        }else {
            System.out.println("Basarisiz");
        }
         driver.close();



    }
}
