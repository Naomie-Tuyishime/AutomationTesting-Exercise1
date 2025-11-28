package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Uploadpage {

private WebDriver driver;
private By chooseFile = By.id("uploadFile");
public Uploadpage(WebDriver driver){
    this.driver=driver;

}
public void selectFile (String absolutePathOfFile ){
    driver.findElement(chooseFile).sendKeys(absolutePathOfFile);

}
}
