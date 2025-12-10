package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    private By usernameElement = By.cssSelector("#userName");
    private By passwordElement = By.cssSelector("#password");
    private By loginButton = By.id("login");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void setCredentials ( String username, String password ){
        driver.findElement(usernameElement).sendKeys(username);
        driver.findElement(passwordElement).sendKeys(password);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'});",driver.findElement(loginButton));
        driver.findElement(loginButton).click();

    }
//    private By status= By.cssSelector("#userName-value");
//    public String getStatus(){
//        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(status));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName-value"))));
//        return driver.findElement(status).getText();
//    }

}
