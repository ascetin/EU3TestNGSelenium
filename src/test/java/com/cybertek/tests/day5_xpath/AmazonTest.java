package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    /**
     * TASK
     * go to Amazon.com
     * search for Selenium
     * click search button
     * verify 1-48 of 304 results for "selenium"
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        /*
        Benim cözümümdü bir yerde hata verdi...
        // id dinamik degil ve sadece bir tane var dolayisiyla kullanilabilir...
        WebElement inputTextId = driver.findElement(By.id("twotabsearchtextbox"));
        // Name'i kullanamayiz cünkü name YOK
        WebElement inputTextName = driver.findElement(By.name("..."));
        // ClassName' de kullanamiyoruz tanimli degil...
        WebElement inputTextClassName = driver.findElement(By.className(" "));

        WebElement inputTextTagName = driver.findElement(By.tagName(""));

        WebElement inputTextLinkText = driver.findElement(By.linkText("  "));

        // Burda xpath yöntemlerinden tagname attribute ile locator'i buluyoruz."input[@type='text']"
        // ancak birden fazla oldugu icin bunu da kullanamiyoruz..
        WebElement inputTextAttribute = driver.findElement(By.xpath("input[@type='text']"));

        inputTextId.sendKeys("Selenium");

        WebElement clickSearch = driver.findElement(By.xpath("(input[@*='nav-input'])[2]"));
        clickSearch.click();
    */

        //1-48 of 177 results for "Selenium"
        // (//span[@dir='auto'])[1])

        /*
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement searchbox = driver.findElement(By.ByXPath("//input[id='twotabsearchtextbox']"));
        searchbox.sendKeys("Selenium");
        // click search button
        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement result= driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        String resultText = result.getText();
        System.out.println("resultTex = " + resultText);

        String expectedResult = "1-48 of over 3,000 results for";

        if (expectedResult.equals(resultText)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedResult = " + expectedResult);
            System.out.println("resultText = " + resultText);
        }
        */


    }
}
