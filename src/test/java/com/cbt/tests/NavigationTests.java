package com.cbt.tests;


import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtilities;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
            ChromeTest();
            FirefoxTest();
            SafariTest();
            OperaTest();
    }

    public static void ChromeTest(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String googleTitle1 = driver.getTitle();
        driver.get("https://etsy.com");
        String etsyTitle1 = driver.getTitle();
        driver.navigate().back();
        String googleTitle2 = driver.getTitle();
        StringUtilities.verifyEquals(googleTitle1,googleTitle2);
        driver.navigate().forward();
        String etsyTitle2 = driver.getTitle();
        StringUtilities.verifyEquals(etsyTitle1,etsyTitle2);

        driver.quit();

    }
    public static void FirefoxTest(){
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String googleFirst = driver.getTitle();
        driver.get("https://etsy.com");
        String EtsyFirst = driver.getTitle();
        driver.navigate().back();
        String googleSecond = driver.getTitle();
        StringUtilities.verifyEquals(googleFirst, googleSecond);
        driver.navigate().forward();
        String EtsySecond = driver.getTitle();
        StringUtilities.verifyEquals(EtsyFirst, EtsySecond);

        driver.quit();
    }

    public static void SafariTest(){
        System.setProperty("Webdriver.safari.driver" , "/usr/bin/safaridriver");
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://google.com");
        String google1 = driver.getTitle();
        driver.get("https://etsy.com");
        String Etsy1 = driver.getTitle();
        driver.navigate().back();
        String google2 = driver.getTitle();
        driver.navigate().forward();
        String Etsy2 = driver.getTitle();
        StringUtilities.verifyEquals(Etsy1,Etsy2);

        driver.quit();

    }

    public static void OperaTest(){
        WebDriver driver = BrowserFactory.getDriver("opera");
        driver.get("https://google.com");
        String gT1 = driver.getTitle();
        driver.get("https://etsy.com");
        String eT1 = driver.getTitle();
        driver.navigate().back();
        String gT2 = driver.getTitle();
        StringUtilities.verifyEquals(gT1,gT2);
        driver.navigate().forward();
        String eT2 = driver.getTitle();
        StringUtilities.verifyEquals(eT1,eT2);

        driver.quit();
    }

}
