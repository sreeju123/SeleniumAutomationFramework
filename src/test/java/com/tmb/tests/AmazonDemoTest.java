package com.tmb.tests;

import com.tmb.annotations.FrameworkAnnotation;
import com.tmb.enums.CategoryType;
import com.tmb.pages.AmazonHamburgerMenuPage;
import com.tmb.pages.AmazonHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public final class AmazonDemoTest extends BaseTest{

    private AmazonDemoTest(){

    }

    @FrameworkAnnotation(author = {"Sreejith"}, category = {CategoryType.SMOKE,CategoryType.REGRESSION})
    @Test
    public void amazonTest(Map<String,String> data) {
        AmazonHomePage amazonHomePage=new AmazonHomePage();
        AmazonHamburgerMenuPage amazonHamburgerMenuPage=new AmazonHamburgerMenuPage();
        amazonHomePage.clickHamburger();
        amazonHomePage.clickHamburger();
        amazonHamburgerMenuPage.clickComputer();
        amazonHamburgerMenuPage.clickOnSubMenuItem(data.get("menutext"));

    }

}
