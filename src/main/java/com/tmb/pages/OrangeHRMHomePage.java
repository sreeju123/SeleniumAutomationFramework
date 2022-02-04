package com.tmb.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import com.tmb.enums.WaitStrategy;
import com.tmb.reports.ExtentLogger;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class OrangeHRMHomePage extends BasePage {
    private final By linkWelcome = By.xpath("//*[@id='welcome']");
    private final By linkLogout = By.xpath("//a[text()='Logout']");

    public OrangeHRMHomePage clickWelcome() {
        click(linkWelcome, WaitStrategy.CLICKABLE, "Welcome");
        ExtentLogger.pass("Welcome Link clicked");
        return this;
    }

    public OrangeHRMLoginPage clickLogout() {

//        From Commons lang3
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);

//        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 60);
//        wait.until(ExpectedConditions.elementToBeClickable(linkLogout));
        /*
        wait.until(d->d.findElement(link_logout).isEnabled());  Java 8
        */

        click(linkLogout, WaitStrategy.CLICKABLE,"Logout");
        ExtentLogger.pass("Logout Link clicked");
        return new OrangeHRMLoginPage();
    }


}
