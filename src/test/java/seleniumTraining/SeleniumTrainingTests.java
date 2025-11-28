package seleniumTraining;

import base.BaseTests;
import org.testng.annotations.Test;

public class SeleniumTrainingTests extends BaseTests {
    @Test
    public void clickSeleniumTrainingLink (){
        homePage.clickSeleniumCoursePage().clickSeleniumTrainingLink();
    }
}
