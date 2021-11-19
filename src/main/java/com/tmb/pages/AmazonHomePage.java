package com.tmb.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import com.tmb.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AmazonHomePage extends BasePage{

    @FindBy(id="nav-hamburger-menu")
    private WebElement linkHamburger;


    public AmazonHomePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public AmazonHamburgerMenuPage clickHamburger() {
        Uninterruptibles.sleepUninterruptibly(4,TimeUnit.SECONDS);
        linkHamburger.click();
        System.out.println("CLicked Hamburger menu");
        return new AmazonHamburgerMenuPage();
    }

}
