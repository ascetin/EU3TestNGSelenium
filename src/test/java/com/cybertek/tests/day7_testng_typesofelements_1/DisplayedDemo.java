package com.cybertek.tests.day7_testng_typesofelements_1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {
    @Test
    public void test1 () throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput = driver.findElement(By.id("username"));
        //usernameInput.sendKeys("some keys ");
        // Asagidaki kod ile aradigimiz elementin ekranda göüküp gözükmedigini ögreniyoruz
        // gözüküyorsa true deger gözükmüyorsa false deger döndürür...
        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());


        //TASK
        // verify username inputbox is not displayed on the screen
        Assert.assertFalse(usernameInput.isDisplayed(), "verify inputbox is NOT disables");

        // click start button
        // find start button and click
        driver.findElement(By.cssSelector("#start>button")).click();

        Thread.sleep(6000); //Bunu koyduk cünkü program hata verdi.
        // Hatanin nedeni sayfa tiklandiktan sonra yeni sayfanin yüklenmesi yaklasik 6 saniye sürüyor
        //eger bekleme kodunu koymazsak müteakip kodla yapmak istedigimiz islemi yapamiyor ve hata veriyor..
        // Ancak beklersek tikladigimiz sayfa aciliyor ve muteakip kod düzgün calisiyor...

        // verify username displayed on the screen

        Assert.assertTrue(usernameInput.isDisplayed(), "verify username inputbox is displayed");


    }
}
