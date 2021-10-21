package com.leafground.step_definitions;

import com.leafground.pages.EditPage;
import com.leafground.utilities.BrowserUtils;
import com.leafground.utilities.ConfigurationReader;
import com.leafground.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditStepDefs {

    EditPage editPage = new EditPage();

    @Given("the user is on homepage")
    public void the_user_is_on_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));

        String expectedTitile = "TestLeaf - Selenium Playground";
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals( "Verify tjat user is on the expected page", expectedTitile,actualTitle);
    }

    @When("the user navigates on {string} sub-page")
    public void the_user_navigates_on_sub_page(String tab) {
        BrowserUtils.waitFor(2);
        new EditPage().navigateToModule(tab);

    }

    @Then("the user should land on {string} sub-page successfully")
    public void the_user_should_land_on_sub_page_successfully(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.waitFor(2);

        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }

    @Then("the user should be able to enter email address")
    public void the_user_should_be_able_to_enter_email_address() {

    }

    @Then("the user should be able to append text and press Tab")
    public void the_user_should_be_able_to_append_text_and_press_Tab() {

    }

    @Then("the user should be able to get default text")
    public void the_user_should_be_able_to_get_default_text() {

    }

    @Then("the user should be able to clear the text")
    public void the_user_should_be_able_to_clear_the_text() {

    }

    @Then("the user should be able to confirm that edit field is disabled")
    public void the_user_should_be_able_to_confirm_that_edit_field_is_disabled() {

    }

    @Then("the user should be able to do all steps successfully")
    public void the_user_should_be_able_to_do_all_steps_successfully() {

    }
}
