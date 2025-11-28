package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedInSignIn {
    private WebDriver driver;
    private By signInButton = By.id("sign-in-form__submit-btn" );

    public LinkedInSignIn(WebDriver driver) {
        this.driver = driver;
    }
    public SignInPage clickOnSignInButton(){
        driver.findElement(signInButton).click();
        return  new SignInPage(driver);



    }


}
