package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class ListOfElements {

    WebDriver driver; // Bunu buraya yaziyoruz cünkü Before Method'a yazdigimiz durumda sadece
    //beforeMethodda iken ulasilabilir. Class da ulasilamaz. Bu yüzden class'in altina yazdik
    // ve bütüm metodlarda ve classlarda artik ulasabiliriz.
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // save our web elements inside the List
        // Burda sunu yaptik sayfadaki bütün buttonlari "buttons" a listeledik, bundan sonra
        // element kullnamak istedigimizde locator kullanmak zorunda degiliz.
        // Sira numarasi vererek kullanabiliriz. Birinci button "0" dir.
        // 54. ve 55 satirda bunun örnekleri mevcut..
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("buttons.size() = " + buttons.size());
        Assert.assertEquals(buttons.size(), 6, "verify buttons size");

        // iter yazdiktan sonra enter'a basinca asagidaki kodu otomatik cikartiyor...
        // iter+enter to get each loop with shortcut
        for (WebElement button : buttons) {
            //asagidaki kod ile ekrana sayfada hangi buttonlarin oldugunu yazdirdik
            System.out.println(button.getText());

            //  asagidaki kod ile deayni sekilde ekranda hangi buttonlarin oldugunu yazdirdik
            System.out.println("button.isDisplayed() = " + button.isDisplayed());
            Assert.assertTrue(button.isDisplayed(), "verify buttons are displayed");
        }

        //click second button
        buttons.get(1).click();
    }

    @Test

    public void test2() {
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

// List<WebElement> ile sayfadaki buttonlarin bütün locatorlarini bulup bunlari
// kendi olusturdugumuz buttons'un icine alabiliyoruz. Biz asagidaki örnekte bunu
// tagname ile yaptik. Ancak eger tagname yanlis yazarsak ne olur...
// program hata vermez calisir ancak belirtilen tagname olmadigi icin olusturdugumuz
// "buttons" ici bos olur..
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("buttons.size() = " + buttons.size());


    }

    }
