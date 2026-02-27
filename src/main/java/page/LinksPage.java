package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LinksPage {
    private WebDriver driver;

    private final By createdLink = By.id("created");

    private final By linkResponse = By.id("linkResponse");

    public LinksPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCreatedLink (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(createdLink));
        link.click();
    }
    public String getLinkResponseText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(linkResponse)).getText();
    }
}