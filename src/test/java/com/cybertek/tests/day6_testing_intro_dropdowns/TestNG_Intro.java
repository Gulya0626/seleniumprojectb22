package com.cybertek.tests.day6_testing_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {

    @BeforeMethod
    public void setupClass() {
        System.out.println(" ---> Before CLASS is running...");
    }

    @AfterClass
    public void teardownClass() {
        System.out.println("After CLASS is running...");
    }

    @BeforeMethod
    public void setupMethod() {
        System.out.println(" ---> Before method is running...");
    }

    @AfterMethod
    public void teardownMethod() {
        System.out.println("After method is running...");
    }

    @Test (priority = 0)
    public void test1() {
        System.out.println("Running test 1...");
        String actual = "apple";
        String expected = "apples";

        Assert.assertEquals(actual, expected);
    }

    @Test (priority = 1)
    public void test2() {
        System.out.println("Running test 2...");

    }
}
