package com.bitrix24.tests;

import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest(){
        test = report.createTest("login test");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        BrowserUtils.waitForPageToLoad(20);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Portal");
        BrowserUtils.waitForPageToLoad(20);
        test.pass("login successful");

    }

    @Test
    public void navigateToMyDrive(){
        test = report.createTest("Navigate to My Drive Test");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        BrowserUtils.waitForPageToLoad(20);
        loginPage.navigateTo("Drive");
        Assert.assertEquals(Driver.getDriver().getTitle(),"My Drive");
        test.pass("Success");

    }

}



