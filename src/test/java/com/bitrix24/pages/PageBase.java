package com.bitrix24.pages;

import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,10);

    public PageBase(){
        PageFactory.initElements(driver,this);
    }
    //span[@class='menu-item-link-text' and contains(text(),'')]
    public void navigateTo(String tabName) {
        String tabNameXpath = "//span[@class='menu-item-link-text' and contains(text(),'" + tabName + "')]";

        WebElement tabElement = driver.findElement(By.xpath(tabNameXpath));
        BrowserUtils.wait(2);
        tabElement.click();



    }

}
