package com.testleaf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WaitToAppearPage extends BasePage{

    @FindBy(xpath = "//button[@id='btn']")
    public WebElement appearingText;

}
