package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BooksPage {
    private WebDriver driver;
    private By bookElement = By.cssSelector(".btn.btn-light.active");
    private By loginELement= By.cssSelector(".element-list.collapse.show ul #item-0");
    public BooksPage(WebDriver driver){
        this.driver = driver;
    }




    public LoginPage clickLogin(){
        WebElement element = driver.findElement(loginELement);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'});", element);
        element.click();
        return new LoginPage (driver);
    }

}
