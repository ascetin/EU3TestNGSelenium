package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{

    //since we are extending BasePage we do not need explicit constructor for this class
    @FindBy(xpath = "//td[contains(text(),'mbrackstone9@example.com')][@data-column-label='Email']")
    public WebElement email;


    //sayfada birden fazla email adresleri var ve email adresöerin locator asagidaki gibi
    // yani sadece email degisken dolayisiyla asagidaki gibi bir metod yaziyoruz
    // bize emailini yazdigimiz yerin locatorunu gönderiyor...
    public WebElement getContactEmail(String email) {
        String xpath = "//td[contains(text(),'mbrackstone9@example.com')][@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }

}

