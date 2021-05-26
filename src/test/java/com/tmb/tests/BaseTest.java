package com.tmb.tests;

import com.tmb.driver.Driver;
import com.tmb.reports.ExtentReport;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.Map;

public class BaseTest {

    protected BaseTest() {

    }

    @SuppressWarnings("unchecked")
    @BeforeMethod
    protected void setUp(Object[] data) {
        Map<String,String> map=(Map<String, String>)data[0];
        Driver.initDriver(map.get("browser"));
    }


    // USing browser parameter in xml
    /*@SuppressWarnings("unchecked")
    @Parameters("browser")
    @BeforeMethod
    protected void setUp(String browser) {
        Driver.initDriver(browser);
    }*/

    @AfterMethod
    protected void tearDown() {
        Driver.quitDriver();
    }

}
