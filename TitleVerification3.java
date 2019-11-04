package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/",
                "https://walmart.com", "https://westelm.com/");

        for(int i = 0; i < urls.size(); i++) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.navigate().to(urls.get(i));
            String title = driver.getTitle().toLowerCase().replace(" ", "");
            System.out.println(driver.getCurrentUrl());
            if (urls.get(i).contains(title)) {
                System.out.println("URL contains: " + driver.getTitle() + ":\n TEST PASSED\n");
            } else {
                System.out.println("URL not contains: " + driver.getTitle() + ":\n TEST FAILED\n");
            }
            driver.close();
        }

    }
}
