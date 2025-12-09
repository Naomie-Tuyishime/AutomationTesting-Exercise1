package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

public class DropDownTests extends BaseTests {
    @Test
    public void selectDropDownItemByValue(){
       var dropdownTest= homePage.clickDropDown();
       var selectMenuPage = dropdownTest.findDropDownItem();
       selectMenuPage.SelectFromDropDownItemByValue(2);

    }
}
