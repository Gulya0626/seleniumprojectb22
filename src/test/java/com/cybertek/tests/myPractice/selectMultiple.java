package com.cybertek.tests.myPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class selectMultiple {
    protected static ThreadLocal<ChromeDriver> getDriver = new ThreadLocal<>();

    @BeforeMethod

    public void setUp(){

        WebDriverManager.chromedriver().setup();
        getDriver.set(new ChromeDriver());

//        //maximize the browser window
//        driver.manage().window().maximize();
//
//        //Added implicit wait
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        //Added to wait till page gets loaded completely
//        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);


    }

    public WebDriver getDriver(){

        return getDriver.get();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
//        Thread.sleep(3000);
//        getDriver().quit();
    }

}

