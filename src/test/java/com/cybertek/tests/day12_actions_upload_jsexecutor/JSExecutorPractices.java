package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSExecutorPractices {

    @Test
    public void scroll_using_jsExecutor_test1() {
        //Get the page: http://practice.cybertekschool.com/infinite_scroll

        Driver.getDriver().get("https://practice.cybertekschool.com/infinite_scroll");

        // Down casting our driver type to JavascriptExecutor so we can reach methods in this interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // ((JavascriptExecutor) Driver.getDriver()).executeScript("");

        //using js we reach executeScript method so we are allowed to pass JavaScript functions.
        //this method is capable of accepting JavaScript functions and apply that into our Java+Selenium
        js.executeScript("window.scrollBy(0, 750)");
        js.executeScript("window.scrollBy(0, 750)");
        js.executeScript("window.scrollBy(0, 750)");
    }
}
