package com.bitrix24.tests.userStory11;

import com.bitrix24.pages.HomePage;
import com.bitrix24.pages.LoginPage;
import com.bitrix24.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadApp extends TestBase {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void downloadMac(){
        test = report.createTest("User should be able to click on Mac Os icon under Desktop." +
                "Client to download Mac version of Bitrix");
        loginPage.login();
        test.info("Login as a marketing member");
        homePage.clickMacIconToDownloadApp();
        test.pass("Test was verified");
    }


    @Test
    public void downloadWindows(){
        test = report.createTest("User should be able to click on Windows icon under Desktop." +
                "Client to download Windows version of Bitrix");
        loginPage.login();
        test.info("Login as a marketing member");
        homePage.clickWindowsIconToDownloadApp();
        test.pass("Test was verified");
    }

    @Test
    public void downloadLinux(){
        test = report.createTest("User should be able to click on Linux icon under Desktop." +
                "Client to download Linux version of Bitrix");
        loginPage.login();
        test.info("Login as a marketing member");
        homePage.clickLinuxIconToDownloadApp();
        test.pass("Test was verified");
    }

}
