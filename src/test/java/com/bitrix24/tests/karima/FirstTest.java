package com.bitrix24.tests.karima;

import com.bitrix24.pages.AllPage;
import com.bitrix24.pages.LoginPage;
import com.bitrix24.tests.TestBase;
import com.bitrix24.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class FirstTest extends TestBase {
//1. As a user, I should be able to send messages by clicking on Message tab under Active Stream.
//
    //"1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
    //2. User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
    //3. User should be able to attach link by clicking on the link icon.
    //4. User should be able to insert videos by clicking on the video icon and entering the video URL.
    //5. User should be able to create a quote by clicking on the Comma icon.
    //6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
    //7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
    //8. User should be able to click on the Topic icon to see the Message Topic text box displays on top of the message box.
    //9. User should be able to click on ""Record Video"" tab to record a video and attach it with the message."
    @Test
    public void Test1(){
        test= report.createTest("Verify the Topic text box displays or not");
        LoginPage loginPage = new LoginPage();
        AllPage allPage = new AllPage();
        loginPage.login();
        BrowserUtils.wait(2);
        allPage.message.click();
        allPage.topicBtn.click();

        BrowserUtils.wait(2);

        test.pass("the text box was verified");
    }

}
