package com.testleaf.pages;

import com.testleaf.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CheckboxesPage extends BasePage{

    public WebElement getSelectedCheckboxes(String name){
        WebElement selectCheckbox = Driver.get().findElement((By.xpath("//div[.='"+name+"']/input")));
        return selectCheckbox;
    }

    public List<WebElement> selectAll(){
        List<WebElement> options = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            WebElement element = Driver.get().findElement(By.xpath("//div[.='Option " + i + "']/input"));
            element.click();

            options.add(element);
        }
        return options;
    }

}
