package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest {

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
        driver.get("http://practice.cybertekschool.com/dropdown");
    //1. Locate your dropdown just like any other webelement with unique  locator

    WebElement dropdownElement = driver.findElement(By.id("state"));
    //2. create Select object by passing that element as a contsructor
        Select stateDropdown = new Select(dropdownElement);
        // burda bir class olusturduk.. construktor olöarak da statedropdown koyduk..
        //bu sekilde daha önce tanimli olan bir cok methodlari kullanabiliriz..
        // getoptions ---> returns all the available options from the dropdown
        List<WebElement> options = stateDropdown.getOptions();
        // print size the options
        System.out.println("options.size() = " + options.size());
// asagida java da ögrendigimiz for döngüsünü kullanarak options daki bütün secilebilen degerleri ekrana yazdirdik 52 tane
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");
    //1. locate your dropdown just like any other webelement with unique locator
    WebElement dropdownElement = driver.findElement(By.id("state"));

    //2. create a select object by passing that element as a constructor
    Select stateDropdown = new Select(dropdownElement);

    //verify that first selection is a Select a state
        String expectedOption = "Select a State";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");

        // HOW TO SELECT OPTIONS FROM DROPDOWN ß
        // 1. SELECT USING visible text
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Virginia");

        expectedOption = "Virginia";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption, "verify first selection");

        //2. Select using Index
        Thread.sleep(2000);
        // index numarasi 0 dan baslar... 52. secmek istersek 51 yaziyotuz
        stateDropdown.selectByIndex(51);

        expectedOption = "Wyoming";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption, "verify first selection");

        //3. Select by Value(HTML kodundaki Value degerine göre)
        Thread.sleep(2000);
        stateDropdown.selectByValue("TX");

        expectedOption = "Texas";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption, "verify first selection");
    }


}
