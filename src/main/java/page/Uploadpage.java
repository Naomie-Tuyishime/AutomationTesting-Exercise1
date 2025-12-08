package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Uploadpage {

private WebDriver driver;
private By elements = By.className("header-text");
private By uploadFile = By.cssSelector("span.text");
public Uploadpage(WebDriver driver){
    this.driver=driver;

}
public void clickElements (){
    driver.findElement(elements).click();
}

public void selectFile (String absolutePathOfFile ){
    driver.findElement(uploadFile).sendKeys(absolutePathOfFile);


}
}
