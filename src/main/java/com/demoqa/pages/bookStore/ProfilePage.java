package com.demoqa.pages.bookStore;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id= "userName-value")
    WebElement userName;

    public ProfilePage verifyUserName(String text) {
        Assert.assertTrue(userName.getText().contains(text));
        return this;
    }
}
