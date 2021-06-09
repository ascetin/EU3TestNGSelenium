package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class  nameLocatorTest {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        //make browser fullscreen..
        driver.manage().window().maximize();

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("asdfg@gmail.com");

        //laz way...
        // driver.findElement(By.name("email")).sendKeys("asdfg@gmail.com");

        WebElement clickSignOn = driver.findElement(By.name("wooden_spoon"));
        clickSignOn.click();

        //laz way...
        // driver.findElement(By.name("wooden_spoon")).click();

    }
}
