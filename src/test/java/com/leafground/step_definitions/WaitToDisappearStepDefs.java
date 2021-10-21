package com.leafground.step_definitions;

import com.leafground.pages.WaitToDisappearPage;
import com.leafground.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitToDisappearStepDefs {
    WaitToDisappearPage waitToDisappearPage = new WaitToDisappearPage();

    @Then("the user should be able get the disappear text successfully")
    public void the_user_should_be_able_get_the_disappear_text_successfully() {

        String expectedMessage = "I know you can do it! Button is disappeared!";

        new WebDriverWait(Driver.get(),5).until(ExpectedConditions.elementToBeClickable(waitToDisappearPage.disappearingMessage));

        String actualMessage = waitToDisappearPage.disappearingMessage.getText();

        Assert.assertEquals("Verify that user can get disappearing message as expected",expectedMessage,actualMessage);
    }
}
