package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class classNameTest {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homeClick = driver.findElement(By.className("nav-link"));
        homeClick.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        // print multipple buttons header
        System.out.println(driver.findElement(By.className("h3")).getText());

    }
}
