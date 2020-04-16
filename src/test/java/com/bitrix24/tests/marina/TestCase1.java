package com.bitrix24.tests.marina;

import com.bitrix24.pages.LoginPage;
import com.bitrix24.tests.TestBase;
import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 extends TestBase {

    /*
    "3. As a user, I should be able to create
events by clicking on Event tab under Activity Stream."
"1. User should be able to click on upload files icon
to upload files and pictures from local disks,
download from external drive, select documents from bixtrix24,
 and create files to upload.
2. User should be able to attach link by clicking on the link icon.
4. User should be able to insert videos by clicking on the video icon and entering the video URL.
5. User should be able to create a quote by clicking on the Comma icon.
6. User should be able to click on Visual Editor
and see the editor text-bar displays on top of the message box.
7. User should be able to add Event start and ending date and time,
 and specify the time zone.
8. User should be able to set reminder by entering the timeing.
9. User should be able to select event location from dropdown.
10. User should be able to add attendees by selecting contacts
 individually or adding grups and departments.
11. Useer should be able to click on More to specify the event details.
"
   */



//7. User should be able to add Event start and ending date and time,
 //  and specify the time zone.



private WebDriver driver =Driver.getDriver();

    @Test
    public void TestCase1(){
        test = report.createTest(" ");
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        //find Active stream
      driver.findElement(By.xpath("//*[@id='bx_left_menu_menu_live_feed']/a/span[1]")).click();
        BrowserUtils.wait(3);
      //find Event
     driver.findElement(By.xpath("//*[@id='feed-add-post-form-tab-calendar']/span"));

      //find time from
  //      driver.findElement(By.xpath(" //input[@id='feed-cal-event-fromcal_3Jcl']"));

        BrowserUtils.wait(5);



      //   1. User should be able to click on upload files icon
      //  to upload files and pictures from local disks,
      //  download from external drive, select documents from bixtrix24,
        //         and create files to upload.
       driver.findElement(By.id("bx-b-uploadfile-blogPostForm_calendar"));
        WebElement upload =  driver.findElement(By.xpath("//*[@id='diskuf-selectdialog-hoAJSRy']/div[2]/table/tbody/tr[1]/td[1]/div/input"));
        String filePath = System.getProperty("C:/Users/Simzi/Desktop/English lessons/Prepositional phrases.pdf.pdf");
        upload.sendKeys(filePath);
        BrowserUtils.wait(5);



    }

}
