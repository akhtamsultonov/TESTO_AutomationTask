package com.testleaf.step_definitions;

import com.testleaf.pages.UploadFilePage;
import com.testleaf.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UploadFileStepDefs {

    UploadFilePage uploadFilePage = new UploadFilePage();

    @Then("the user should be able to upload file successfully")
    public void the_user_should_be_able_to_upload_file_successfully() {
        uploadFilePage.sendFile();
        Assert.assertTrue(uploadFilePage.uploadFile.isDisplayed());
        BrowserUtils.waitFor(2);
    }
}
