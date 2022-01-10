package com.cybertek.utilities;

import org.openqa.selenium.JavascriptExecutor;

public class BrowserUtils {

    public static void sleep(int seconds) throws InterruptedException {
        try{
            Thread.sleep(seconds * 1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }
    }
    public static void scrollDown(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, " + pixels + ")");
    }



}
