package com.leafground.step_definitions;

import com.leafground.pages.DragAndDropPage;
import com.leafground.utilities.BrowserUtils;
import com.leafground.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStepDefs {

    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @Then("the user should be able to drag and drop successfully")
    public void the_user_should_be_able_to_drag_and_drop_successfully() {
        BrowserUtils.waitFor(2);
        Actions actions = new Actions(Driver.get());
        actions.dragAndDrop(dragAndDropPage.source,dragAndDropPage.target).perform();
        BrowserUtils.waitFor(2);
        Assert.assertEquals( "Verify that user draged and dropped successfully","Dropped!",dragAndDropPage.Dropped.getText());
    }
}
