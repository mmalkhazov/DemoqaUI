package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class UploadFilePage extends BasePage {
    public UploadFilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "uploadFile")
    WebElement uploadFile;

    public UploadFilePage performKeyEventWithRobot() {
        pause(1000);
        moveWithJS(0, 200);
        clickWithRectangle(uploadFile, 3, 4);

        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        //press SHIFT key
        robot.keyPress(KeyEvent.VK_SHIFT);
        pause(1000);
        //press d(upper case as SHIFT key is pressed)
        robot.keyPress(KeyEvent.VK_D);
        //release SHIFT key
        robot.keyRelease(KeyEvent.VK_SHIFT);
        //press 1, ., t, x, t
        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyPress(KeyEvent.VK_T);
        //press ENTER key
        robot.keyPress(KeyEvent.VK_ENTER);
        return this;
    }

    @FindBy(id = "uploadedFilePath")
    WebElement uploadedFilePath;

    public UploadFilePage verifyPath(String path) {
        Assert.assertTrue(shouldHaveText(uploadedFilePath, path, 5));
        return this;
    }

    public UploadFilePage performMouseEvent() {
        pause(1000);
        moveWithJS(0, 200);
        clickWithRectangle(uploadFile, 3, 4);

        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        //get window size
        org.openqa.selenium.Dimension dimension = driver.manage().window().getSize();
        System.out.println("Dimension x and y: " + dimension.getWidth() + " *** " + dimension.getHeight());

        pause(1000);
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        Point point = pointerInfo.getLocation();
        int x = (int) point.getX();
        int y = (int) point.getY();
        System.out.println(y+ "***" + x);


        int xOffset=dimension.getWidth()/3-50;
        int yOffset=dimension.getHeight()/2;
        robot.mouseMove(xOffset,yOffset);
        pause(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        pause(1000);
        robot.keyPress(KeyEvent.VK_ENTER);


        return this;
    }


}
