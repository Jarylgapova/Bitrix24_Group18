package com.bitrix24.pages;

import com.bitrix24.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US8AC7Page extends PageBase {

    @FindBy(className = "menu-favorites-more-text")
    private WebElement more;

    @FindBy(xpath = "//span[@class='menu-item-link-text'][contains(text(),'Workflows')]")
    private WebElement workflows;

    public void moreOption() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(more)).click();
    }

    public void workflowsDirectoryPage() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(workflows));
    }
}
