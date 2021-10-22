package com.testleaf.step_definitions;

import com.testleaf.pages.CheckboxesPage;
import com.testleaf.utilities.BrowserUtils;
import com.testleaf.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesStepDefs {

    CheckboxesPage checkboxesPage = new CheckboxesPage();

    @When("the user should be able to select the {string}")
    public void the_user_should_be_able_to_select_the(String expectedCheckbox) {

        checkboxesPage.getSelectedCheckboxes(expectedCheckbox).click();
        Assert.assertTrue(  checkboxesPage.getSelectedCheckboxes(expectedCheckbox).isSelected());
    }

    @When("the user should be able to confirm {string} is checked")
    public void the_user_should_be_able_to_confirm_is_checked(String expectedChecked) {

        Assert.assertTrue(checkboxesPage.getSelectedCheckboxes(expectedChecked).isSelected());

    }

    @When("the user should be able to deselect the {string}")
    public void the_user_should_be_able_to_deselect_the(String expectedDeselect) {

        checkboxesPage.getSelectedCheckboxes(expectedDeselect).click();
        Assert.assertFalse(checkboxesPage.getSelectedCheckboxes(expectedDeselect).isSelected());
    }

    @When("the user should be able to select all")
    public void the_user_should_be_able_to_select_all() {

        List<WebElement> optionElements = checkboxesPage.selectAll();

        for (WebElement element: optionElements) {
            Assert.assertTrue(element.isSelected());
        }
    }

}
