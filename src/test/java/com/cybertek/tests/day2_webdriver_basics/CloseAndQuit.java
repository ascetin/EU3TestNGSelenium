package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(3000);
        driver.close(); // bu sanirim gecerli veya acilan ilk tab'i kapatiyor...

        driver = new ChromeDriver();
        // bir önceki kod ile Chrome'dan ciktim dolayisiyla Selenium'a tekrar hangi browser'i
        // kullanmam gerektigini söylemem lazim..

        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);

        //closes all tabs
        driver.quit();
    }
}
