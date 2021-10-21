package com.testleaf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{

    @FindBy(xpath = "//div[@class='ui-widget-content ui-draggable ui-draggable-handle']")
    public WebElement source;

    @FindBy(xpath = "//div[@class='ui-widget-header ui-droppable']")
    public WebElement target;

    @FindBy(xpath = "//p[.='Dropped!']")
    public WebElement Dropped;
}

