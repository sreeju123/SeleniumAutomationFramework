package com.tmb.tests;

import com.tmb.annotations.FrameworkAnnotation;
import com.tmb.enums.CategoryType;
import com.tmb.listeners.RetryFailedTests;
import com.tmb.pages.OrangeHRMLoginPage;
import com.tmb.reports.ExtentReport;
import com.tmb.utils.DataProviderUtils;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

public final class OrangeHRMTests extends BaseTest {
    private OrangeHRMTests() {

    }

    @FrameworkAnnotation(author = {"Sreejith"}, category = {CategoryType.SMOKE,CategoryType.REGRESSION})
    @Test
    public void loginLogoutTest(Map<String,String> data) throws Exception {
        OrangeHRMLoginPage orangeHRMLoginPage = new OrangeHRMLoginPage();
        String title = orangeHRMLoginPage.enterUsername(data.get("username")).enterPassword(data.get("password")).clickLogin().clickWelcome().clickLogout().getTitle();
        Assert.assertEquals("OrangeHRM1", title);

//        orangeHRMHomePage.clickWelcome().clickLogout();
    }

    @FrameworkAnnotation(author = {"Sreejith"}, category = {CategoryType.SMOKE,CategoryType.REGRESSION})
    @Test
    public void newTest(Map<String,String> data) throws Exception {
        OrangeHRMLoginPage orangeHRMLoginPage = new OrangeHRMLoginPage();
        String title = orangeHRMLoginPage.enterUsername(data.get("username")).enterPassword(data.get("password")).clickLogin().clickWelcome().clickLogout().getTitle();
        throw new SkipException("Skipped Exception");
//        Assert.assertEquals("OrangeHRM", title);

//        orangeHRMHomePage.clickWelcome().clickLogout();
    }



     /*Not needed her, creating a separate class for DataProvider*/
    /*@DataProvider(name = "LoginTestDataProvider", parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                {"Admin", "admin123"},
                {"Admin", "admin1234"},
                {"Admin", "admin234"},
                {"Admin", "admin0234"}
        };*/
    }
