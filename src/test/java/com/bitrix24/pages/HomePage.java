package com.bitrix24.pages;

import com.bitrix24.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends PageBase {

    @FindBy(css = "[id^='log_entry_favorites']")
    private List<WebElement> allStarButtons;

    @FindBy(css = "[id='log_entry_favorites_2005']")
    private WebElement button;

    @FindBy(xpath = "//span[text()='Mac OS']")
    private WebElement macButton;

    @FindBy(xpath = "//span[text()='Windows']")
    private WebElement windowsButton;

    @FindBy(xpath = "//span[text()='Linux']")
    private WebElement linuxButton;




    public void clickMacIconToDownloadApp(){
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.elementToBeClickable(macButton)).click();
    }

    public void clickWindowsIconToDownloadApp(){
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.elementToBeClickable(windowsButton)).click();
    }

    public void clickLinuxIconToDownloadApp(){
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.elementToBeClickable(linuxButton)).click();
    }


    public void clickAllStarButtons(){
        BrowserUtils.wait(2);
        for (WebElement each:allStarButtons) {
            wait.until(ExpectedConditions.elementToBeClickable(each)).click();
        }
    }


    public boolean areAllButtonsSelected(){
        BrowserUtils.wait(2);
        for (WebElement each:allStarButtons) {
            if(!each.isSelected()){
                return false;
            }
        }
        return true;
    }
}
