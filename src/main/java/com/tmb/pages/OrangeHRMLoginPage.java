package com.tmb.pages;

import com.tmb.enums.WaitStrategy;
import com.tmb.reports.ExtentLogger;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage extends BasePage {


    private final By textboxUsername = By.name("username");
    private final By textboxPassword = By.name("password");
    private final By buttonLogin = By.xpath("//button[contains(@class,'orangehrm-login-button')]");

    public OrangeHRMLoginPage enterUsername(String username) throws Exception {
        sendKeys(textboxUsername,username);
        ExtentLogger.pass(username+" entered successfully", true);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password) throws Exception {
        sendKeys(textboxPassword,password);
        ExtentLogger.pass(password+" entered successfully", true);
        return this;
    }

    public OrangeHRMHomePage clickLogin() throws Exception {
        click(buttonLogin, WaitStrategy.CLICKABLE,"Login");
        ExtentLogger.pass("Login button clicked successfully", true);
        return new OrangeHRMHomePage();
    }

    public String getTitle(){
        return getPageTitle();
    }

}
