package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C5_Tekrar {
      /*
Create a new class : Tekrar
ChromeDriver kullanarak, youtube git ve page basliginin  "youtube" oldugunu verify et, eger degilse dogrusunu yazdir.
the page URL'in youtube  icerip icermedigini verify et, ve dogru url'i yazdir.
Sonra https://www.amazon.com/ git
youtube geri navigate et
page'i Refresh et
amazon'a tekrar navigate et
Maximize the window
page basliginin "Amazon" icerdigini dogrula, eger degilse dogru basligi yazdir
page URL'in  https://www.amazon.com/ oldugunu dogrula, degilse dogru url'i yazdir
Quit the browser
 */

    public static void main(String[] args) {
        // path ı set et
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");

        //crome drive objesi olustur
        WebDriver driver = new ChromeDriver();

        // sayfayı maximize et
        driver.manage().window().maximize();

        //youtube sayfasına git
        driver.navigate().to("https:/www.youtube.com");

        // "https:/www.youtube.com" sayfanın "youtube" içerip içermediğini veryf et
        String expectedBaslik = "youtube";
        String actualBaslik = driver.getTitle();

        if (expectedBaslik.contains(actualBaslik)) {
            System.out.println("Basarili");
        } else {
            System.out.println("Basarisiz");
            System.out.println("Expected baslik: " + expectedBaslik);
            System.out.println("Actual Baslik: " + actualBaslik);
        }

        String pageSource = driver.getPageSource();
        if (pageSource.contains("Home")) {
            System.out.println("Basarili");
        } else {
            System.out.println("Basarisiz");
        }

        // Sonra https://www.amazon.com/ git
        driver.get("https://www.amazon.com/");

        // youtube geri navigate et
        driver.navigate().back();

        //page'i Refresh et
        driver.navigate().refresh();

        //amazon'a tekrar navigate et
        driver.navigate().forward();


        //page basliginin "Amazon" icerdigini dogrula, eger degilse dogru basligi yazdir
        String expectedTitle = " Amazon";
        String actualTitle = driver.getTitle();

        if (expectedTitle.contains(actualTitle)) {
            System.out.println("Basarili");
        } else {
            System.out.println("Test Basarisiz");
            System.out.println("Actual Baslik: " + expectedTitle);
            System.out.println("Expected Baslik: " + expectedTitle);

            // page URL'in  https://www.amazon.com/ oldugunu dogrula, degilse dogru url'i yazdir

            String expectedUrl = "https://www.amazon.com/";
            String actualUrl = driver.getCurrentUrl();

            if (actualUrl.contains(expectedUrl)) {
                System.out.println("Basarili");
            } else {
                System.out.println("Test Basarisiz");
                System.out.println("Actual Url: " + expectedUrl);
                System.out.println("Expected Url: " + expectedUrl);

            }
            // Quit the browser
            driver.quit();


        }
    }
}


