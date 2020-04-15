package com.bitrix24.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;

public abstract class TestBase {
    protected WebDriverWait wait;
    // protected WebDriver driver;
    protected Actions actions;
    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest test;

    @BeforeTest
    @Parameters("reportName")
    public void setupTest(@Optional String reportName) {
        reportName = reportName == null ? "report.html" : reportName + ".html";
        report = new ExtentReports();
        String reportPath = "";

        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            reportPath = System.getProperty("user.dir") + "\\test-output\\report.html";
        } else {
            reportPath = System.getProperty("user.dir") + "/test-output/report.html";
        }

        htmlReporter = new ExtentHtmlReporter(reportPath);
        report.attachReporter(htmlReporter);
        htmlReporter.config().setReportName("Bitrix 24 Group 18");
    }

    @AfterTest
    public void tearDownTest() {
        report.flush(); //to release a report

    }

    @BeforeMethod
    public void setup() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        wait = new WebDriverWait(Driver.getDriver(), 15);
        actions = new Actions(Driver.getDriver());


    }

    @AfterMethod
    public void teardown(ITestResult iTestResult) throws IOException {
        if (iTestResult.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = BrowserUtils.getScreenshot(iTestResult.getName());
            BrowserUtils.wait(2);
            test.addScreenCaptureFromPath(screenshotPath);
            test.fail(iTestResult.getName());
            test.fail(iTestResult.getThrowable());
        }
        Driver.closeDriver();
    }
}