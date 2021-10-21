package com.leafground.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WaitToDisappearPage extends BasePage{

    @FindBy (xpath = "//strong[contains(.,'I know you can do it! Button is disappeared!')]")
    public WebElement disappearingMessage;

}
