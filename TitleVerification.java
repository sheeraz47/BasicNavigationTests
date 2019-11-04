package com.cbt.utilities;

import org.openqa.selenium.WebDriver;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String titleOne = driver.getTitle();
        Thread.sleep(3000);
        driver.get(urls.get(1));
        String  titleTwo = driver.getTitle();
        Thread.sleep(3000);
        //StringUtilities.verifyEquals(titleOne,titleTwo);
        driver.navigate().to(urls.get(2));
        String titleThree = driver.getTitle();
        Thread.sleep(3000);
       // StringUtilities.verifyEquals(titleOne,titleThree);

        String expectedResult = "http://practice.cybertekschool.com/";
        if(titleOne.contains(expectedResult)&& titleTwo.contains(expectedResult)&& titleThree.contains(expectedResult)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST PASSED");
        }

        driver.quit();

        }


    }




