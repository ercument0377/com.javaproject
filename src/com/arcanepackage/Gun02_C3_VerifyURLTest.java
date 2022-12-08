package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C3_VerifyURLTest {
    public static void main(String[] args) {
        /*Google anasayfasına git
        Google anasayfasında url in "www.google.com" oldugunuz dogrula/veryfy et



         */
        //path set et
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        String expectedUrl = "www.google.com";
        String actualUrl =  driver.getCurrentUrl();

        if (expectedUrl.equals((actualUrl))){
            System.out.println("Basarili");

        }else{
            System.out.println("Basarisiz");
            System.out.println("Acual: "+ actualUrl);
            System.out.println("Expected : "+ expectedUrl);
        }


    }
}
