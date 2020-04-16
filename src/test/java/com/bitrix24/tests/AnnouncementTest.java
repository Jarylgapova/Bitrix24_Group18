package com.bitrix24.tests;

import com.bitrix24.pages.AnnouncementPage;
import com.bitrix24.pages.LoginPage;
import com.bitrix24.tests.TestBase;
import com.bitrix24.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnouncementTest extends TestBase {
    @Test
    public void testAC_3(){
        test = report.createTest("Verify attach link by clicking on the link icon");
        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        announcementPage.clickMoreButton();
        announcementPage.clickAnnouncementSubheading();
        announcementPage.clickLinkIcon();
        announcementPage.inputText("Macys", "www.macys.com");
        BrowserUtils.waitForPageToLoad(20);
        announcementPage.switchToFrame();
        Assert.assertTrue(announcementPage.isTextDisplayed());
        test.pass("Verified attached link");
    }

    @Test
    public void testAC_5(){
        test = report.createTest("Verify attach link by clicking on the link icon");
        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        announcementPage.clickMoreButton();
        announcementPage.clickAnnouncementSubheading();
        announcementPage.clickCommaIcon();
        announcementPage.switchToQuoteBlockFrame("Good night!!!");
        Assert.assertTrue(announcementPage.isQuoteDisplayed());
        test.pass("Verified attached link");
    }
}
