package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {
    WebDriver driver;

    @BeforeClass
    public void setupMethod() {

        //TC #1: Information alert practice
        //1. Open browser
        //2. Go to website: http://practice.cybertekschool.com/javascript_alerts

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //5. Verify “Y ou successfully clicked an alert” text is displayed.
    }

    @Test
    public void information_alert_test() throws InterruptedException {
        //Locating the button for alert to click
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        //3. Click to “Click for JS Alert” button
        informationAlertButton.click();

        Thread.sleep(2000);

        //Switching driver's focus to alert, so we can handle it
        Alert alert = driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();

        //5. Verify "You successfully clicked an alert" text is displayed
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed on the page.");
        Assert.assertEquals(actualText, expectedText);
    }
}
