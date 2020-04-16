package com.bitrix24.pages;

import com.bitrix24.utilities.BrowserUtils;
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

    @FindBy(xpath = "//label[text()='Text:']")
    private WebElement labelText;

    @FindBy(css = "[id='linkidPostFormLHE_blogPostForm-text']")
    private WebElement linkTextInputBox;

    @FindBy(xpath = "(//label[text()='Link:'])[1]")
    private WebElement labelLink;

    @FindBy(css = "[id='linkidPostFormLHE_blogPostForm-href']")
    private WebElement linkUrlInputBox;

    @FindBy(className = "adm-btn-save")
    private WebElement saveButton;

    @FindBy(css = "[id='cancel']")
    private WebElement cancelButton;

    @FindBy(className = "bx-core-adm-icon-close")
    private WebElement closeIcon;

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





}
