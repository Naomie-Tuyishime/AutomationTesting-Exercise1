package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SelectMenu {
    private WebDriver driver;
    private By inputSelecting = By.id("oldSelectMenu");
    public SelectMenu(WebDriver driver) {
        this.driver = driver;
    }
  public void SelectFromDropDownItemByValue(int value){
        findDropDownItem().selectByIndex(value);
  }

    public Select findDropDownItem(){
return new Select (driver.findElement(inputSelecting));
    }
}
