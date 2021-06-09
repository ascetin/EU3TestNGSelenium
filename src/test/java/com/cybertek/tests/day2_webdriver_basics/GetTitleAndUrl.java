package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) throws InterruptedException {

        // Task open chrome and navigate to http://practice.cybertekschool.com
        // getting title with selenium
        //shorcut for creating variable
        //Option or ALT + enter enter
        //getTitle () ---> get you title of the page
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Thread.sleep(3000);

        driver.navigate().to("http://practice.cybertekschool.com");
        /*
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        */

        // soutv + enter to print variable name and value
        String title = driver.getTitle();
        System.out.println("title = " + title);
// getCurrentUrl ---> get the url from browser...
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println("CurrentUrl = " + CurrentUrl);

        //
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);



    }
}
