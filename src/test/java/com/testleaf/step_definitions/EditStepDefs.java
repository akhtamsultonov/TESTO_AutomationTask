package com.testleaf.step_definitions;


import com.testleaf.pages.EditPage;
import com.testleaf.utilities.BrowserUtils;
import com.testleaf.utilities.ConfigurationReader;
import com.testleaf.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EditStepDefs {

    EditPage editPage = new EditPage();

    @Given("the user is on homepage")
    public void the_user_is_on_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));

        String expectedTitle = "TestLeaf - Selenium Playground";
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals( "Verify that user is on expected page", expectedTitle,actualTitle);
    }

    @When("the user navigates on {string} sub-page")
    public void the_user_navigates_on_sub_page(String tab) {
        BrowserUtils.waitFor(2);
        new EditPage().navigateToModule(tab);

    }

    @Then("the user should land on {string} sub-page successfully")
    public void the_user_should_land_on_sub_page_successfully(String expectedTitle) {
        String actualTitle = editPage.getPageSubTitle();
        BrowserUtils.waitFor(3);
        Assert.assertEquals("Verify that user is on expected page",expectedTitle,actualTitle);
    }

    @Then("the user should be able to enter email address")
    public void the_user_should_be_able_to_enter_email_address() {
        BrowserUtils.waitFor(2);
        editPage.email.sendKeys("anton94@mail.ru");
        String passedEmail = editPage.email.getAttribute("value");
        Assert.assertEquals("anton94@mail.ru",passedEmail);

    }

    @Then("the user should be able to append text and press Tab")
    public void the_user_should_be_able_to_append_text_and_press_Tab() {
        BrowserUtils.waitFor(2);
        editPage.append.clear();
        editPage.append.sendKeys("Hello World!" + Keys.TAB);
        String appendText = editPage.append.getAttribute("value");
        Assert.assertEquals("Hello World!",appendText);

    }

    @Then("the user should be able to get default text")
    public void the_user_should_be_able_to_get_default_text() {
        BrowserUtils.waitFor(2);
        String getText = editPage.text.getAttribute("value");
        Assert.assertEquals("TestLeaf",getText);



    }

    @Then("the user should be able to clear the text")
    public void the_user_should_be_able_to_clear_the_text() {
        BrowserUtils.waitFor(2);
        editPage.clear.clear();

        String clearInputBox = editPage.clear.getAttribute("value");
        Assert.assertTrue(clearInputBox.isEmpty());


    }

    @Then("the user should be able to confirm that edit field is disabled")
    public void the_user_should_be_able_to_confirm_that_edit_field_is_disabled() {
        BrowserUtils.waitFor(2);
        Assert.assertFalse(editPage.disabled.isEnabled());
    }

}
