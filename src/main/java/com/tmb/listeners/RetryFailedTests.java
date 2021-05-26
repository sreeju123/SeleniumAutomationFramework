package com.tmb.listeners;

import com.tmb.enums.ConfigProperties;
import com.tmb.utils.PropertyUtils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {

    private int count = 0;
    private int retry = 1;

    @Override
    public boolean retry(ITestResult iTestResult) {

            if (PropertyUtils.get(ConfigProperties.RETRYFAILEDTESTS).equalsIgnoreCase("yes")) {
                if (count < retry) {
                    count++;
                    return true;
                }
            }
        return false;
        }


}
