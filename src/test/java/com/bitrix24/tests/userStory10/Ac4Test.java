package com.bitrix24.tests.userStory10;

import com.bitrix24.pages.HomePage;
import com.bitrix24.pages.LoginPage;
import com.bitrix24.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ac4Test extends TestBase {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
public void testcase4(){
    test = report.createTest("User should be able to add others' posts to favorate by clicking on the Star icon.");
    loginPage.login();
    test.info("Login as a marketing member");
    homePage.clickAllStarButtons();
    Assert.assertTrue(homePage.areAllButtonsSelected());
    test.pass("Test was verified");
}

}
