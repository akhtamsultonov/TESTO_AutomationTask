package com.testleaf.pages;

import com.testleaf.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadFilePage extends BasePage{

    @FindBy(xpath = "//input[@name='filename']")
    public WebElement uploadFile;

    public void sendFile(){

        String projectPath = System.getProperty("user.dir");

        String filePath = "src/test/resources/testo.jpeg";

        String fullPath = projectPath + "/" + filePath;

        uploadFile.sendKeys(fullPath);
    }

}
