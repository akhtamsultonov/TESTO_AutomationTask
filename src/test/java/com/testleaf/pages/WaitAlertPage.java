package com.testleaf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WaitAlertPage extends BasePage{

    @FindBy(xpath = "//button[@id='alert']")
    public WebElement getAlert;

    public void handleAlert(){
        getAlert.click();
    }
}
