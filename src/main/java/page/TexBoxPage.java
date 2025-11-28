package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TexBoxPage {
    private By textbox = By.linkText("Text Box");
    private WebDriver driver;
    private By fullName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAdress = By.id("currentAddress");
    private By permentAdress = By.id("permanentAddress");
  private By submitButton = By.id("submit");
    public TexBoxPage(WebDriver driver){
            this.driver = driver;

    }
    public  void  getTextBox(){
        driver.findElement(textbox).click();
    }
    public void getFullName(){
        driver.findElement(fullName).click();
    }
    public void getEmail(String mail){
        driver.findElement(email).sendKeys(mail);
    }
public void getPermentAdress(String text){
        driver.findElement(permentAdress).sendKeys(text);
    }
    public void getSubmitButton(){
        driver.findElement(submitButton).click();
    }
}
