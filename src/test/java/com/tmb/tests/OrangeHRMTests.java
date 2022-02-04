package com.tmb.tests;

import com.tmb.annotations.FrameworkAnnotation;
import com.tmb.enums.CategoryType;
import com.tmb.pages.OrangeHRMLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public final class OrangeHRMTests extends BaseTest {
    private OrangeHRMTests() {

    }

    @FrameworkAnnotation(author = {"Sreejith"}, category = {CategoryType.SMOKE, CategoryType.REGRESSION})
    @Test
    public void loginLogoutTest(Map<String, String> data) throws Exception {
        OrangeHRMLoginPage orangeHRMLoginPage = new OrangeHRMLoginPage();
        String title = orangeHRMLoginPage.enterUsername(data.get("username")).enterPassword(data.get("password")).clickLogin().clickWelcome().clickLogout().getTitle();
        Assert.assertEquals("OrangeHRM", title);


    }

    @FrameworkAnnotation(author = {"Sreejith"}, category = {CategoryType.SMOKE, CategoryType.REGRESSION})
    @Test
    public void newTest(Map<String, String> data) throws Exception {
        OrangeHRMLoginPage orangeHRMLoginPage = new OrangeHRMLoginPage();
        String title = orangeHRMLoginPage.enterUsername(data.get("username")).enterPassword(data.get("password")).clickLogin().clickWelcome().clickLogout().getTitle();
        Assert.assertEquals("OrangeHRM", title);

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
