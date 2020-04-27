package com.bitrix24.tests.serdar;

import com.bitrix24.pages.ActivityStreamPage;
import com.bitrix24.pages.LoginPage;
import com.bitrix24.tests.TestBase;
import com.bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US9AC1MyActivityFilterTest extends TestBase {


    /**
     * This method will post a sample message in the Activity Stream
     * and will filter all postings by My Activity Filter
     * and verify that only current user's posts are displayed
     * in the Activity Stream
     */
    @Test
    public void verifyFilterMyActivity() {
        test = report.createTest("Verify My Activity Filter");
        LoginPage loginPage = new LoginPage();
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();

        loginPage.login();
        activityStreamPage.postMessageToActivityStream();
        activityStreamPage.filterByMyActivity();
        List<WebElement> feedPostUsers = activityStreamPage.getFeedPostUserNames();        

        for (WebElement feedPostUser : feedPostUsers) {
            //print collected usernames for manual verification
            System.out.println("feedPostUser.getText() = " + feedPostUser.getText());
            Assert.assertEquals(feedPostUser.getText(), ConfigurationReader.getProperty("username"));
        }
        test.pass("My Activity Filter successfully verified!");



    }


}
