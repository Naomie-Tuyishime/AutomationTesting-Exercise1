package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage {

    WebDriver driver;
    private By status= By.cssSelector("#userName-value");

    public ProfilePage(WebDriver driver) {
   this.driver=driver;
    }
    public String getStatus(){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(status));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName-value"))));
        return driver.findElement(status).getText();
    }
}
