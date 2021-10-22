**TESTO Task** 

**Task for test automation:**


1. Use suitable tools to write a few tests that the following website tests for functionality:
http://www.leafground.com/
2. To do this, just select some of the sub-pages.
3. A specification for the behavior of the website is not available, make appropriate assumptions.
4. Automatic execution as part of a build pipeline is not required.
5. You have 1 week (7 calendar days) to complete the task.
6. Ideally, you create a repository on Github or Gitlab and allow us to access your code, including commit messages. 
7. Alternatively, you can also present the code live in a joint video conference.


***Framework Architecture***

    TESTO_TestLeafAutomationTask
    |
    |_idea
    |_src/test/java
    |	|_com
    |       |    |_testleaf
    |       |          |
    |       |       |_Pages
    |	|	   |_BasePage.java
    |	|	   |_CheckboxesPage.java
    |	|	   |_DragAndDropPage.java
    |	|	   |_EditPage.java
    |	|	   |_UploadFilePage.java
    |	|	   |_WaitAlertPage.java
    |	|	   |_WaitToAppearPage.java
    |	|	   |_WaitToDisappearPage.java
    |       |          |
    |       |       |_Runners
    |	|	   |_CukesRunner.java
    |       |          |
    |       |       |_Step_Definitions
    |	|	   |_CheckboxesStepDefs.java
    |	|	   |_DragAndDropStepDefs.java
    |	|	   |_EditStepDefs.java
    |	|	   |_Hooks.java
    |	|	   |_UploadFileStepDefs.java
    |	|	   |_WaitAlertStepDefs.java
    |	|	   |_WaitToAppearStepDefs.java
    |	|	   |_WaitToDisappearStepDefs.java
    |       |          |  
    |       |       |_utilities
    |	|	   |_BrowserUtils.java
    |	|	   |_ConfigurationReader.java
    |	|	   |_Driver.java
    |       |          |   
    |_src/test/resources
    |	|_features
    |	|	|_checkboxes.feature
    |	|	|_dragAndDrop.feature
    |	|	|_edit.feature
    |	|	|_uploadFile.feature
    |	|	|_waitForAlert.feature
    |	|	|_waitToAppears.feature
    |	|	|_waitToDisappear.feature
    |       |testo.jpeg
    |_target
    |_.gitignore
    |_configuration.properties
    |_pom.xml
    |_ReadMe.md


**ABOUT Framework**

**Tools :** `Java-JUnit-Maven-BDD-Cucumber-Selenium-Gherkin`

•	I have used _**Maven**_ for build management tool, `Selenium WebDriver` for browser automation, `JUnit` for starting tests and for assertions, `Gherkin` language and `Cucumber`.

•	In `POM.XML` file I have stored **dependencies** and **plugins**,

•	The necessary information such as _Browser_, and _URL_ are inside `Configuration-Properties` file and I am able to reach these information with the help of **Configuration Reader class**.

•	This framework is `BDD`, which uses `Cucumber` to write tests in **Features Package**, and for each scenario under **Features Package** I created Cucumber feature files where I used `GHERKIN` language in order to organize test suites and  to describe test scenarios, by doing that I’m making sure that my test cases are understandable for each member of my team, even for those who aren’t technically strong.

•	I have used **POM** structure in order to keep codes organized and clean. So, basically under my **Pages Package**, I created separate Java classes for each page where I store all the Web Elements of that page as well as related methods. For instance: I have a _Base Page_ which is an _**Abstract Class**_ that can be extended by other classes and use its reusable codes or methods.

•	In addition, I have another **Step-Definitions Package**. Under this package, I created separate classes where I have methods to execute feature files and keep implemented Step-Definitions. Besides these classes, I have a Hooks class that implements codes which runs before and after all tests, this is where I invoke _Take-Screen-Shot_ for each failure.

•	Moreover, I have another separate package which is _**Utilities Package**_. Under this package I have different classes such as Driver class which is designed with **Singleton Design Pattern**, Browser-Utilities and Configuration Reader classes.

•	Last but not least, I have created **Runners Package** and under this package I have a Cukes-Runner class that runs tests and helps to generate codes for step definition from feature files. It contains locations that shows where feature files and _**Step-Definitions(Glue)**_ are. Also, it contains plugin to generate _**HTML**_ reports with the exact steps from the feature file. Reporting is done in cucumber with `Cucumber HTML Report`.

•	Finally, this framework supports `Data-Driven Testing` using **Scenario Outline with Examples**.


**Report**
**NOTE:**
In order to get the `HTML Cucumber Report` please follow below steps:

    1. Open IDE terminal 
    2. Type mvn verify cmd and  
    3. Hit the Enter
    4. Open target folder 
    5. You will see the report under "Cucumber HTML Reports" directory

**URL:** _**https://stackoverflow.com/**_ 

I have used **Stack OverFlow**  for the challenges which I had. 




