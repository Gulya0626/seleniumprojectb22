package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {

        //TC #1: Cybertek Practice Tool Verification

        //SET UP THE BROWSER
        WebDriverManager.chromedriver().setup();

        //1. OpenChromebrowser
        WebDriver driver = new ChromeDriver();

        //maximze the page
        driver.manage().window().maximize();

        //2. Gotohttps://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com/");

        //3. VerifyURLcontains
        //Expected: cybertekschool

        String expectedInUrl= "cybertekschool";
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains(expectedInUrl)) {
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!");
        }

        //4. Verifytitle:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
    }
}
