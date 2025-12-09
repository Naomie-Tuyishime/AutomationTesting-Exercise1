package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    private WebDriver driver;
    private By  selectMenu = By.id("item-8");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    public SelectMenu findDropDownItem(){
        WebElement element=driver.findElements(selectMenu).get(1);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        return new SelectMenu(driver);

    }



}
