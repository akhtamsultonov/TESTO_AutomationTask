package com.leafground.step_definitions;

import com.leafground.pages.WaitToAppearPage;
import com.leafground.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitToAppearStepDefs {

    WaitToAppearPage waitToAppearPage = new WaitToAppearPage();

    @Then("the user should be able get the {string} text successfully")
    public void the_user_should_be_able_get_the_text_successfully(String expectedText) {

        new WebDriverWait(Driver.get(),5).until(ExpectedConditions.elementToBeClickable(waitToAppearPage.appearingText));

        String actualText = waitToAppearPage.appearingText.getText();

        Assert.assertEquals("Verify that user can get the expected text",expectedText,actualText);

    }
}
