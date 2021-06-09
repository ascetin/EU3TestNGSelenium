package com.cybertek.tests.day7_testng_typesofelements_1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioBtn = driver.findElement(By.id("blue"));
        blueRadioBtn.getAttribute("value");
        // get the value of type attribute
        System.out.println(blueRadioBtn.getAttribute("value"));
        // get the value of name attribute
        System.out.println(blueRadioBtn.getAttribute("name"));
        //since checked attribute does not keep any value, it will return true or false based on
        System.out.println(blueRadioBtn.getAttribute("checked"));

        // trying to get attribute that does not exist
        // when we use non exit attribute it will return null to us.
        System.out.println(blueRadioBtn.getAttribute("href"));

        blueRadioBtn.getAttribute("outerHTML");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button2 = driver.findElement(By.name("button2"));

        System.out.println(button2.getAttribute("outerHTML"));
        String outerHtml = button2.getAttribute("outerHtml");
        Assert.assertTrue(outerHtml.contains("Button2"));

        System.out.println("Inner HTML : " + button2.getAttribute("innerHTML"));

        driver.quit();
    }
}
