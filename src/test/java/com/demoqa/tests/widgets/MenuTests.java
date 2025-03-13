package com.demoqa.tests.widgets;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.widgets.MenuPage;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTests extends TestBase {

    @BeforeMethod
    public void precondtition(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).getMenu().hideIframes();
    }

    @Test
    public void moveToMenuTest(){
        new MenuPage(driver).selectSubMenu()
                .verifySubMenu();
    }


}