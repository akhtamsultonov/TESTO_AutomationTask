package com.testleaf.step_definitions;

import com.testleaf.pages.WaitAlertPage;
import com.testleaf.utilities.BrowserUtils;
import com.testleaf.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAlertStepDefs {

    WaitAlertPage waitAlertPage = new WaitAlertPage();

    @Then("the user should be able to get handle alert successfully")
    public void the_user_should_be_able_to_get_handle_alert_successfully() {

        waitAlertPage.handleAlert();

        new WebDriverWait(Driver.get(),5).until(ExpectedConditions.alertIsPresent());

        Alert alert = Driver.get().switchTo().alert();

        String expectedMessage = "Hurray, Click OK";
        String alertMessage = Driver.get().switchTo().alert().getText();

        alert.accept();

        Assert.assertEquals("Verify that user can handle the alert",expectedMessage,alertMessage);
    }
}
