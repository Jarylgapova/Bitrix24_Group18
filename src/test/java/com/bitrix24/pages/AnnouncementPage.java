package com.bitrix24.pages;

import com.bitrix24.pages.PageBase;
import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AnnouncementPage extends PageBase {

    @FindBy(id = "feed-add-post-form-link-text")
    private WebElement moreButton;

    @FindBy(xpath = "//span[text()='Announcement']")
    private WebElement announcementSubheading;

    @FindBy(xpath = "(//div//span[@title='Upload files'])[1]")
    private WebElement uploadFilesIcon;

    @FindBy(name = "bxu_files[]")
    private WebElement uploadFilesAndImages;

    @FindBy(xpath = "(//span[text()='Select document from Bitrix24'])[1]")
    private WebElement selectDocumentsFromBitrix24;

    @FindBy(xpath = "(//span[text()='Download from external drive'])[1]")
    private WebElement downloadFromExternalDrive;

    @FindBy(xpath = "//span[@id='bx-b-link-blogPostForm']")
    private WebElement linkIcon;

    @FindBy(css = "[class='bx-core-adm-dialog-head-inner']")
    private WebElement linkHeadInner;

    @FindBy(css = "[id='linkidPostFormLHE_blogPostForm-text']")
    private WebElement linkTextInputBox;

    @FindBy(css = "[id='linkidPostFormLHE_blogPostForm-href']")
    private WebElement linkUrlInputBox;

    @FindBy(className = "adm-btn-save")
    private WebElement saveButton;

    @FindBy(css = "[id='cancel']")
    private WebElement cancelButton;

    @FindBy(className = "bx-core-adm-icon-close")
    private WebElement closeIcon;

    @FindBy(xpath = "//div//div[@id='bx-html-editor-idPostFormLHE_blogPostForm']")
    private WebElement textBox;

    @FindBy(className = "bx-editor-iframe")
    private WebElement iFrame;

    @FindBy(css = "[id='bx-b-quote-blogPostForm']")
    private WebElement commaIcon;

    @FindBy(className = "bxhtmled-quote")
    private WebElement quoteInputBox;

    @FindBy(css = "[id='blog-submit-button-save']")
    private WebElement sendButton;

    @FindBy(xpath = "(//table[@class='blogquote'])[4]")
    private WebElement feedTextPostBlock;

    @FindBy(className = "bx-editor-iframe")
    private WebElement quoteIFrame;


    public void clickMoreButton(){
        BrowserUtils.waitForPageToLoad(20);
        moreButton.click();
    }

    public void clickAnnouncementSubheading(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(announcementSubheading)).click();
    }

    public void clickLinkIcon(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(linkIcon)).click();
    }

    public void inputText(String linkName, String link){

        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(linkTextInputBox));
        linkTextInputBox.sendKeys(linkName);
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(linkUrlInputBox));
        linkUrlInputBox.sendKeys(link);
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
        BrowserUtils.wait(2);

    }

    public void switchToFrame(){
        BrowserUtils.waitForPageToLoad(20);
        Driver.getDriver().switchTo().frame(iFrame);
        Driver.getDriver().switchTo().defaultContent();
    }

    public boolean isTextDisplayed(){
       return textBox.isDisplayed();
    }

    public void clickCommaIcon(){
        BrowserUtils.waitForPageToLoad(20);
        commaIcon.click();
    }

    public void switchToQuoteBlockFrame(String text){
        BrowserUtils.waitForPageToLoad(20);
        Driver.getDriver().switchTo().frame(quoteIFrame);
        BrowserUtils.waitForPageToLoad(20);
        quoteInputBox.sendKeys(text);
        BrowserUtils.wait(2);
        Driver.getDriver().switchTo().defaultContent();
        wait.until(ExpectedConditions.elementToBeClickable(sendButton)).click();
    }

    public boolean isQuoteDisplayed(){
        BrowserUtils.waitForPageToLoad(20);
        return feedTextPostBlock.isDisplayed();
    }

}
