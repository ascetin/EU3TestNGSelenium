package com.cybertek.tests.day7_testng_typesofelements_1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class RadioButtonTest {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        // locating radio buttons
        WebElement blueRadioBtn = driver.findElement(By.cssSelector("#blue"));
        WebElement redRadioBtn = driver.findElement(By.id("red"));

        // How to click radio button ?
        redRadioBtn.click();

        System.out.println("blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());
        System.out.println("redRadioBtn.isSelected() = " + redRadioBtn.isSelected());
        // verify blue is selected red is not selected
        //blue  --- false
        Assert.assertFalse(blueRadioBtn.isSelected(), "verify that blue is not selected");

        //red  --- true
        Assert.assertTrue(redRadioBtn.isSelected(),"verify that red is selected");


        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test2(){


    }
}
