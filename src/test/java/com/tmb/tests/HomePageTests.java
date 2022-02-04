package com.tmb.tests;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest{

    private HomePageTests(){

    }

    @Test
    public void test3(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("HomePageTest", Keys.ENTER);
    }


//    @Test
//    public void test2() {
//        DriverManager.getDriver().findElement(By.name("q")).sendKeys("LoginPageTest 2", Keys.ENTER);
//    }
//
//    @Test
//    public void test4() {
//        DriverManager.getDriver().findElement(By.name("q")).sendKeys("LoginPageTest 3", Keys.ENTER);
//    }


}
