package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactInfoPage extends BasePage{
    @FindBy(className = "user-name")
    public WebElement contactFullName;

    @FindBy(css="a.phone")
    public WebElement phone;

    @FindBy(css="a.email")
    public WebElement email;

    @FindBy (xpath = "//input[@type='number']")
    public WebElement pageNumber;

    @FindBy(css = "[class='title title-level-1']")
    public List<WebElement> drivermenuOptions;
}
