package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/",
                "https://walmart.com", "https://westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to(urls.get(0));
        String titleOne = driver.getTitle().toLowerCase().replace(" ","");
        System.out.println(driver.getCurrentUrl());
        if (urls.get(0).contains(titleOne)){
            System.out.println("URL contains: " + driver.getTitle() + ":\n TEST PASSED\n");
        }else{
            System.out.println("URL not contains: " + driver.getTitle() + ":\n TEST FAILED\n");
        }

        driver.navigate().to(urls.get(1));
        String titleTwo = driver.getTitle().toLowerCase().replace(" ","");
        System.out.println(driver.getCurrentUrl());
        if (urls.get(1).contains(titleTwo)){
            System.out.println("URL contains: " + driver.getTitle() + ":\n TEST PASSED\n");
        }else{
            System.out.println("URL not contains: " + driver.getTitle() + ":\n TEST FAILED\n");
        }

        driver.navigate().to(urls.get(2));
        String titleThree = driver.getTitle().toLowerCase().replace(" ", "");
        System.out.println(driver.getCurrentUrl());
        if (urls.get(2).contains(titleThree)){
            System.out.println("URL contains: " + driver.getTitle() + ":\n TEST PASSED\n");
        }else{
            System.out.println("URL not contains: " + driver.getTitle() + ":\n TEST FAILED\n");
        }

        driver.navigate().to(urls.get(3));
        String titleFour = driver.getTitle().toLowerCase().replace(" ","");
        System.out.println(driver.getCurrentUrl());
        if (urls.get(3).contains(titleFour)){
            System.out.println("URL contains: " + driver.getTitle() + ":\n TEST PASSED\n");
        }else{
            System.out.println("URL not contains: " + driver.getTitle() + ":\n TEST FAILED\n");
        }

        driver.close();



    }
}
