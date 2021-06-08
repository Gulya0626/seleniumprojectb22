package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_Apple_Task {
    public static void main(String[] args) throws InterruptedException {
        //TC #03: FINDELEMENTS_APPLE
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen(); OPTIONAL
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.click/ to all of the headers one by one
        // Apple logo //index 0
        // Mac,       //index 1
        // iPad,      //index 2
        // iPhone,    //index 3
        // Watch,     //index 4
        // TV,        //index 5
        // Music,     //index 6
        // Support    //index 7
        // Apple bag
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        //starts from index 1 not 0, because we don't need Apple logo
        for (int eachLink = 1; eachLink < headerLinks.size() - 1; eachLink++) {

            //System.out.println(headerLinks.get(eachLink).getText());

            headerLinks.get(eachLink).click();
            Thread.sleep(1000);
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li//a"));


            // 4.Print out the titles of the each page
            System.out.println("Current title in the page: " + driver.getTitle());

            // 5.Print out total number of links in each page
            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

            System.out.println("Total number of links in current page: " + allLinks.size());


            int linksWithNoText = 0;
            int linksWithText = 0;

            for (WebElement each : allLinks) {
                if (each.getText().isEmpty()) {
                    linksWithNoText++;
                } else {
                    linksWithText++;
                }
            }

            // 6.While in each page:
            // a.Print out how many link is missing textTOTAL
            System.out.println("--> Current page links with NO TEXT: " + linksWithNoText);

            // b.Print out how many link has textTOTAL
            System.out.println("--> Current page links with NO TEXT: " + linksWithText);

            //to find the elements again after refresh
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li//a"));

        }

        driver.close();
    }
}

