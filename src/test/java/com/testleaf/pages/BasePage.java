package com.testleaf.pages;

import com.testleaf.utilities.BrowserUtils;
import com.testleaf.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//h1[@class='wp-heading']")
    public WebElement pageSubTitle;

    /**
     * @return page name, for example: Work with Edit Fields
     */
    public String getPageSubTitle() {
        //and time we are verifying page name, or page subtitle
        BrowserUtils.waitForPageToLoad(5);
        return pageSubTitle.getText();
    }

    /**
     * This method will navigate user to the specific module in test leaf application.
     * For example: if tab is equals to Edit.
     * Then method will navigate user to this page: http://www.leafground.com/
     *
     * @param tab
     */
    public void navigateToModule(String tab) {
        String tabLocator = "//a[contains(.,'" + tab + "')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }

    }
}
