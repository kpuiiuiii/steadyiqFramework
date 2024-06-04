package com.steadyiq.pages;

import com.steadyiq.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends MainPage{


    public ContactUsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement fNameField;
    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lNameField;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailField;
    @FindBy(xpath = "//input[@name='company']")
    public WebElement companyField;

    @FindBy(xpath = "//select[@name='industries']")
    public WebElement industryField;

    @FindBy(xpath = "//input[@value='Get Started']")
    public WebElement submitButton;
    @FindBy(xpath = "//label[contains(text(), 'Please complete all required fields.')]")
    public WebElement messageAlert;








}
