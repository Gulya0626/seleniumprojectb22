package com.cybertek.utilities;

public class BrowserUtils {
     /**
    Method that will accept int argum
    Wait for given second duration
     */
    public static void sleep(int second)  {
        second=1000;
        //1sec = 1000 milli seconds
        //1*1000 = 1000

        //here instead using 1000 we using second b/c second accepts 1sec (1000)

        //second way of using thread.sleep(more options->try to catch up-click)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Something happens in the sleep method");
        }
    }
}
