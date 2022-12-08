package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gun02_C1_FirefoxBrowserDemo {
    /*
     https://www.mozilla.org/en-US/firefox/new/
     https://github.com/mozilla/geckodriver/releases
     Yeni sinif olustur : FirefoxBrowserDemo
     Main method olustur
     Set Path
     Gecko driver olustur
     Ac : google home page https://www.google.com/
     Maximize the window
     Close/Quit the browser
      */
    public static void main(String[] args) {
        //Path'i set et
        System.setProperty("webdriver.gecko.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/geckodriver.exe");


        // obje olustur
        WebDriver driver = new FirefoxDriver();

        //             Maximize the window
        driver.manage().window().maximize();

//             Ac : google home page https://www.google.com/
        driver.get("https://www.google.com/");
//             driver.navigate().to("https://www.google.com/");

//             Close/Quit the browser
        driver.close();

             /*
                get() and navigate().to()
             1) get() daha yaygin kullanilir
             2) get() daha hizli calisir
             3) get () YALNIZCA parametre olarak String alir. fakat navigate().to() hem String hem de URL'i parametre olarak alabilir
             4) navigate()  daha fazla method ortaya cikar (forward, to, back, refresh())

             close() ile quid () arasındaki fark
             1- close() yalnızca calıstıgımız browseri kapatır
             2- quit() calıstıgımız tum browserleri kapatır. Quit saglam kapatır

             --------------------------------------------

             java ya bekleme (wait) ekleme
             1- Thread.sleep(5000) -> bir sonraki adıma gecmeden 5 saniye bekle
             2- bu bekleme JAVA nın kendisine aittir. Selenium ait değildir
                bu nedenle Thread.sleep()  kullanımı tavsiye edilmez(  hard wait denir)
                NOT: daha sonra "selenium wait" bu dimamik beklemedir.


              */

    }

}