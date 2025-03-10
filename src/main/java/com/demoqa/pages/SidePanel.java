package com.demoqa.pages;

import com.demoqa.pages.bookStore.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {

    public SidePanel(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath="//span[.='Login']")
    WebElement login;

    public LoginPage selectLogin() {
        clickWithJS(login,0,800);
//        click(login);
        return new LoginPage(driver);

    }
}
