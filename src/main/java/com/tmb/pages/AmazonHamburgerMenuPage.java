package com.tmb.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;
import com.tmb.utils.DynamicXpathUtils;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class AmazonHamburgerMenuPage extends BasePage{

    private String linkComputers = "//div[text()='Mobiles, Computers']/parent::a";
    private  String linkSubMenu = "//a[text()='%s']";
    private  String linkSubMenu2 = "//div[text()='%s']/parent::a[text()='%s']";

    public AmazonHamburgerMenuPage clickComputer() {
        click(By.xpath(linkComputers), WaitStrategy.CLICKABLE, "Mobiles and Computers");
        System.out.println("CLicked Computer");
        return this;
    }


    public AmazonLaptopPage clickOnSubMenuItem(String menutext) {
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        String newxpath = DynamicXpathUtils.getXpath(linkSubMenu, menutext);
        click(By.xpath(newxpath), WaitStrategy.CLICKABLE, menutext);
        System.out.println(DriverManager.getDriver().getTitle());
        if(menutext.contains("Laptops")) {
            return new AmazonLaptopPage();
        }
        return null;
    }

}
