package com.tmb.reports;

import com.aventstack.extentreports.ExtentTest;

import java.util.Objects;

public class ExtentManager {

    private ExtentManager() {

    }

    private static ThreadLocal<ExtentTest> extTest = new ThreadLocal<>();

    public static ExtentTest getExtentTest() {
        return extTest.get();
    }

    public static void setExtentTest(ExtentTest test) {
        if (Objects.nonNull(test)) {
            extTest.set(test);
        }
    }

    public static void unload() {
        extTest.remove();
    }

}
