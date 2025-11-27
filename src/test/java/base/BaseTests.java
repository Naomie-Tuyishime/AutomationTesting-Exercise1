package base;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeTest
    public void setUp () {

        System.setProperty("Webdriver.chrome.driver", "resources/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://the-internet.herokuapp.com");
        System.out.println(driver.getTitle());


    }
    @Test
    public void  testts(){
        WebElement inputsLink =driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

    }
    @AfterTest
    public void tearDown (){
//        driver.quit();
    }



}
