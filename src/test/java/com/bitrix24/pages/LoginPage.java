package com.bitrix24.pages;

import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase  {

    @FindBy(name = "USER_LOGIN")
    private WebElement username;

    @FindBy(name = "USER_PASSWORD")
    private WebElement password;

    @FindBy(className = "login-btn")
    private WebElement loginButton;

    public void login(String userName, String passWord) {
        BrowserUtils.waitForPageToLoad(10);
        username.sendKeys(userName);
        password.sendKeys(passWord, Keys.ENTER);

    }

    public void login() {
        BrowserUtils.waitForPageToLoad(10);
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);

    }


}

