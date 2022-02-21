package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;

    public void loginAsDriver(){
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys(ConfigurationReader.get("driver_username"));
        loginPage.password.sendKeys(ConfigurationReader.get("driver_password"));
        loginPage.submit.click();
    }
    public void loginAsSalesmanager(){
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys(ConfigurationReader.get("salesmanager_username"));
        loginPage.password.sendKeys(ConfigurationReader.get("salesmanager_password"));
        loginPage.submit.click();
    }
    public void loginAsStoreManager(){
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys(ConfigurationReader.get("storemanager_username"));
        loginPage.password.sendKeys(ConfigurationReader.get("storemanager_password"));
        loginPage.submit.click();
    }
    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }
}
