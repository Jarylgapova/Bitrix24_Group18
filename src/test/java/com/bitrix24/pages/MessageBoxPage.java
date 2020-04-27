package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessageBoxPage extends PageBase{

    private WebDriver driver = Driver.getDriver();

    @FindBy(css = "[id^='feed-add-post-form-tab-message']")
    public WebElement message;
    @FindBy(css = "[class='feed-add-post-title']")
    public WebElement topic;

    @FindBy(css = "[class='feed-add-post-form-title-btn']")
    public WebElement topicBtn;




}
