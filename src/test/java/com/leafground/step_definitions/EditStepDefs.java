package com.leafground.step_definitions;

import com.leafground.pages.EditPage;
import com.leafground.utilities.ConfigurationReader;
import com.leafground.utilities.Driver;
import io.cucumber.java.en.Given;
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
}
