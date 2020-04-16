package com.bitrix24.tests;

import com.bitrix24.pages.AnnouncementPage;
import com.bitrix24.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnouncementTest extends TestBase{
    @Test
    public void testAC_3(){
        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();

    }
}
