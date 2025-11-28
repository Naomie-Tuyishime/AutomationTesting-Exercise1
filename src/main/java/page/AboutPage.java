package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage {
    private WebDriver driver;
    private By inTouchButton = By.xpath("//a[contains(@href, 'www.linkedin.com/in/lakshay-sharma')]");

    public AboutPage(WebDriver driver) {
        this.driver = driver;
    }
    public LinkedInSignIn clickIntouchButton(){
driver.findElement(inTouchButton).click();
return new LinkedInSignIn (driver);
    }

}
