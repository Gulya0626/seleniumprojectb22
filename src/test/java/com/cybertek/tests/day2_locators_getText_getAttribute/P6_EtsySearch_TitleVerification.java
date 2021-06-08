package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_EtsySearch_TitleVerification {
    public static void main(String[] args) {

        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        // 3. Search for “wooden spoon”
        // a.First we need to locate the search bar
        // b.We enter search value
        // c.We press ENTER
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys
                ("Wooden spoon"+ Keys.ENTER);

        // 4. Verify title:
        String expectedInTitle = ("Wooden spoon | Etsy");
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)) {
            System.out.println("Its Passed!");
        }else{
            System.out.println("It's Failed!");
        }

        //Expected: “Wooden spoon | Etsy”
    }
}
