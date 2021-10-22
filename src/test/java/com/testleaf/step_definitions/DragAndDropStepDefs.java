package com.testleaf.step_definitions;

import com.testleaf.pages.DragAndDropPage;
import com.testleaf.utilities.BrowserUtils;
import com.testleaf.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStepDefs {

    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @Then("the user should be able to drag and drop successfully")
    public void the_user_should_be_able_to_drag_and_drop_successfully() {

        Actions actions = new Actions(Driver.get());
        actions.dragAndDrop(dragAndDropPage.source,dragAndDropPage.target).perform();
        Assert.assertEquals( "Verify that user draged and dropped successfully","Dropped!",dragAndDropPage.Dropped.getText());
    }
}
