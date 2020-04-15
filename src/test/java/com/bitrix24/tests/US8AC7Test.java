package com.bitrix24.tests;

import com.bitrix24.pages.LoginPage;
import com.bitrix24.pages.US8AC7Page;
import com.bitrix24.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class US8AC7Test extends TestBase {

    /**
     * Test Case: Workflows Directory Page
     * Login as a marketing staff
     * Go to more option click it
     * Click on Workflows page
     **/
    @Test
    public void workflowsDirectoryPage() {
        test = report.createTest("Verify Workflows Directory Page");
        LoginPage loginPage = new LoginPage();
        US8AC7Page us8AC7Page = new US8AC7Page();

        loginPage.login();
        BrowserUtils.wait(2);

        us8AC7Page.moreOption();
        BrowserUtils.wait(2);

        us8AC7Page.workflowsDirectoryPage();
        test.pass("Workflows Directory Page verified");
    }

}
