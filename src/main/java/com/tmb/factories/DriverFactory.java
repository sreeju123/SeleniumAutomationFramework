package com.tmb.factories;

import com.tmb.driver.DriverManager;
import com.tmb.enums.ConfigProperties;
import com.tmb.utils.PropertyUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Sreej
 */
public final class DriverFactory {

    private DriverFactory() {

    }

    public static WebDriver getDriver(String browser) throws MalformedURLException {
        WebDriver driver = null;

        String runMode = PropertyUtils.get(ConfigProperties.RUNMODE);
        if (browser.equalsIgnoreCase("chrome")) {
            if (runMode.equalsIgnoreCase("remote")) {
                DesiredCapabilities cap = DesiredCapabilities.chrome();
                ChromeOptions chromeOptions = new ChromeOptions();
//                chromeOptions.addArguments("--no-sandbox");
                cap.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                driver = new RemoteWebDriver(new URL(PropertyUtils.get(ConfigProperties.SELENIUMGRIDURL)), cap);


            } else {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
        } else if (browser.equalsIgnoreCase("firefox")) {

            if (runMode.equalsIgnoreCase("remote")) {
                DesiredCapabilities cap = DesiredCapabilities.firefox();


                driver = new RemoteWebDriver(new URL(PropertyUtils.get(ConfigProperties.SELENIUMGRIDURL)), cap);


            } else {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }

}
