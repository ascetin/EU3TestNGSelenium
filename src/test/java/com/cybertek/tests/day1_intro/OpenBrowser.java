package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager; //library
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
    public static void main(String[] args) {
    // we have to enter this line every time we want to open chrome
    // hey webdrivermanager, can you make chome ready for me for automation

       // WebDriverManager.chromedriver().setup(); // responsible download internet browser chrome fire fox etc

       // WebDriver driver = new ChromeDriver(); //  creating chromeDriver Object...


     //   driver.get("https://cybertekschool.com");
        // calisti !!!//
    WebDriverManager.firefoxdriver().setup();

    WebDriver driver = new FirefoxDriver();

    driver.get("htpp://google.com");

    //day2_webdriver_basics

    }
}
