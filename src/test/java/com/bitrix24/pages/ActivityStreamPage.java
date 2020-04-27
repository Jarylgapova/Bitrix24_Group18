package com.bitrix24.pages;

import com.bitrix24.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

//Author: Serdar H.
public class ActivityStreamPage extends PageBase {

    @FindBy(className = "bx-editor-iframe")
    private WebElement messageIframe;

    @FindBy(css = "[class='feed-add-post-micro-title'")
    private WebElement sendMessageBox;

    @FindBy(css = "[id='blog-submit-button-save']")
    private WebElement sendButton;

    @FindBy(xpath = "//body[@contenteditable='true']")
    private WebElement textBox;

    @FindBy(css = "[placeholder='Filter and search']")
    private WebElement filterAndSearch;

    @FindBy(xpath = "//span[text()='My Activity']")
    private WebElement myActivityFilter;

    @FindBy(css = "[class='feed-post-user-name']")
    private List<WebElement> feedPostUserNames;

    /**
     * This method will post a message to Activity Stream
     * Message to be posted is alread
     */
    public void postMessageToActivityStream(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(sendMessageBox)).click();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(messageIframe));
        textBox.sendKeys("Posting to test My Activity filter feature");
        BrowserUtils.wait(1);
        driver.switchTo().defaultContent();
        sendButton.click();
    }

    /**
     * This method will filter messages on the Activity Stream by "My Activity" only
     * to show only my own postings
     */
    public void filterByMyActivity(){
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch)).click();
        wait.until(ExpectedConditions.elementToBeClickable(myActivityFilter)).click();
    }

    /**
     * This message collects and returns usernames
     * from every posting on the Activity Stream
     * @return usernames of posts as List of WebElements
     */
    public List<WebElement> getFeedPostUserNames(){
        BrowserUtils.wait(2);
        return feedPostUserNames;
    }
}
