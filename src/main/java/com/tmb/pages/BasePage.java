package com.tmb.pages;

import com.tmb.constants.FrameworkConstants;
import com.tmb.driver.Driver;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.tmb.factories.ExplicitWaitFactory.performExplicitWait;

public class BasePage {

    protected void click(By by, WaitStrategy waitStrategy,String elementname){
        performExplicitWait(waitStrategy,by);
        DriverManager.getDriver().findElement(by).click();
    }

    protected void sendKeys(By by,String value){
        explicitlyWaitForElementToBeClickable(by);
        DriverManager.getDriver().findElement(by).sendKeys(value);
    }

    protected String getPageTitle(){
        return DriverManager.getDriver().getTitle();
    }

    private void explicitlyWaitForElementToBeClickable(By by){
        new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getEXPLICITWAIT())
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    private void explicitlyWaitForElementToBePresent(By by){
        new WebDriverWait(DriverManager.getDriver(),FrameworkConstants.getEXPLICITWAIT())
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
