package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    private By emailInput = By.name("session_key");
    private By passwordInput = By.id("base-sign-in-modal_session_password");
    public  SignInPage(WebDriver driver) {
        this.driver = driver;
    }
    public void getEmailText (String email){
        driver.findElement(emailInput).sendKeys(email);

    }
    public void getPasswordText (String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

}
