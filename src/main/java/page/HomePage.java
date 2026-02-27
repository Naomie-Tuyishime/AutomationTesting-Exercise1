package page;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private By uploadpagelink = By.cssSelector("#item-7 > span");
    private By elements = By.className("header-text");
    private By uploadFile = By.cssSelector("span.text");
    private By bookStoreElement = By.cssSelector(".card.mt-4.top-card");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    public SeleniumCoursePage clickSeleniumCoursePage (){
        getLink("SELENIUM TRAINING");
        return null;
    }


public DropDownPage clickDropDown(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        return new DropDownPage(driver);
}

    public Uploadpage clickUpload(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement uploadElement = wait.until(ExpectedConditions.presenceOfElementLocated(uploadpagelink));


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", uploadElement);
        js.executeScript("arguments[0].click();", uploadElement);
                return new Uploadpage (driver);
    }
    public LinksPage clickLink (){

     getLink("Links");
     return new LinksPage(driver);
    }
    public BooksPage  clickBookStoreApplication (){
        WebElement element = driver.findElements(bookStoreElement).get(5);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        return new BooksPage(driver);

    }


    public void getLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}