package com.leafground.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditPage extends BasePage{

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@value='Append ']")
    public WebElement append;

    @FindBy(xpath = "//input[@value='TestLeaf']")
    public WebElement text;

   /* public WebElement getDefaultText(){
        return text;
    }*/

    @FindBy(xpath = "//input[@value='Clear me!!']")
    public WebElement clear;

    @FindBy(xpath = "//div[5]//input[1]")
    public WebElement disabled;




}
