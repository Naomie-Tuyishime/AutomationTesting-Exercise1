package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeTest;



import page.HomePage;

// Assuming this is part of your BaseTests class
public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage; // Field added based on your structure


    private static final String baseURL = "https://demoqa.com/";

    @BeforeTest
    public void setUp() {
         WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.get(baseURL);
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
//        driver.quit();
    }
}