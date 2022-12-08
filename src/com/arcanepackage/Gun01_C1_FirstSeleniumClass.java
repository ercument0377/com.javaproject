package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun01_C1_FirstSeleniumClass {
    public static void main(String[] args) {
        //Driver'in Type ve Path için  System.setProperties() olustur.

        System.setProperty( "webdriver.chrome.driver","C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");

        //WebDriver objeci olustur. Atomation code bu ZORUNLUDUR

        WebDriver driver = new ChromeDriver();  // buna polimorfizim denir

        // get() url'ye gitmek için kullanılır
        driver.get("https://www.google.com/");






    }



}
