package com.bitrix24.tests;

import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest(){
        test = report.createTest("login test");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Portal");
        test.pass("login successful");
    }

    @Test
    public void navigateToMyDrive(){
        test = report.createTest("Navigate to My Drive Test");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.navigateTo("Drive");
        Assert.assertEquals(Driver.getDriver().getTitle(),"My Drive");
        test.pass("Success");

    }
<<<<<<< HEAD
}
=======
}
>>>>>>> e16cfd029d36eb681c02d3683efaa4c8c1c4a9bd
