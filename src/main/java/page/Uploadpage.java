package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Uploadpage {

    private WebDriver driver;
    private final By fileInput = By.id("uploadFile");

    private final By uploadedFilePathText = By.id("uploadedFilePath");

    public Uploadpage(WebDriver driver){
        this.driver=driver;
    }

    public void clickElements (){
    }

    public void selectFile (String absolutePathOfFile ){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fileInputElement = wait.until(ExpectedConditions.presenceOfElementLocated(fileInput));

        fileInputElement.sendKeys(absolutePathOfFile);
    }

    public String getUploadedFileName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(uploadedFilePathText)).getText();
    }
}