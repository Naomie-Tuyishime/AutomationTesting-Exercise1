package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;

// Placeholder import for your Page Object Model class
// Ensure you have a 'page.HomePage' class in your project structure
import page.HomePage;

// Assuming this is part of your BaseTests class
public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage; // Field added based on your structure

    // Updated URL to match your provided code
    private static final String baseURL = "https://demoqa.com/";
    private static final int TIMEOUT_SECONDS = 60;

    @BeforeTest // Changed from @BeforeClass to match your structure
    public void setUp() {
        // --- CRITICAL FIX: Replaced manual System.setProperty with WebDriverManager ---
        // This prevents the "NoSuchWindowException" by automatically managing the ChromeDriver version
        WebDriverManager.chromedriver().setup();

        // Configuration for maximum browser stability on launch
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox");

        driver = new ChromeDriver(options);

        // Configure Driver Settings
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TIMEOUT_SECONDS));

        // Navigate to the base URL
        driver.get(baseURL);

        // Initialize the HomePage object as in your code
        homePage = new HomePage(driver);

        System.out.println("Navigated to: " + driver.getCurrentUrl());
        System.out.println("Current Page Title: " + driver.getTitle());
    }

    // Crucial cleanup method to close the browser after the test suite finishes
    //@AfterTest // Changed from @AfterClass to match your structure
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//            System.out.println("Browser closed successfully.");
//        }
//    }

    // Add a simple getter for the driver
    public WebDriver getDriver() {
        return driver;
    }
}