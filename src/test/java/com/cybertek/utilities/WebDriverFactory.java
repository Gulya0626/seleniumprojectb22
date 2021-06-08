package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    //Task: NEW METHOD CREATION
// Method name is getDriver
//Static method
//Accepts String arg: browserType
// - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"


        public static void main(String[] args) {

            getDriver("chrome");
        }
        public static WebDriver getDriver (String browserType) {
            if(browserType.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }else if(browserType.equalsIgnoreCase("firefox")) {

                WebDriverManager.chromedriver().setup();
                return new FirefoxDriver();
            }
            return null;
        }
    }

