package com.tmb.driver;

import com.tmb.enums.ConfigProperties;
import com.tmb.factories.DriverFactory;
import com.tmb.utils.PropertyUtils;

import java.net.MalformedURLException;
import java.util.Objects;

public final class Driver {

    private Driver() {

    }

//    private static WebDriver driver;


    public static void initDriver(String browser) {

        if (Objects.isNull(DriverManager.getDriver())) {

//            DriverManager.setDriver(new ChromeDriver());
            try {
                DriverManager.setDriver(DriverFactory.getDriver(browser));
            } catch (MalformedURLException e) {
                throw new RuntimeException("MalformedURLException happened");
            }
            DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
            DriverManager.getDriver().manage().window().maximize();
            System.out.println("Browser launched");
            System.out.println(DriverManager.getDriver().getTitle());
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }

}
