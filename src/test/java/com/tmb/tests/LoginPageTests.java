package com.tmb.tests;

import com.tmb.constants.FrameworkConstants;
import com.tmb.driver.Driver;
import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public final class LoginPageTests extends BaseTest {

    private LoginPageTests() {

    }

    @Test
    public void test1() {
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("LoginPageTest 1", Keys.ENTER);
    }

//    @Test
//    public void test2() {
//        DriverManager.getDriver().findElement(By.name("q")).sendKeys("LoginPageTest 2", Keys.ENTER);
//    }
//
//    @Test
//    public void test3() {
//        DriverManager.getDriver().findElement(By.name("q")).sendKeys("LoginPageTest 3", Keys.ENTER);
//    }


}
