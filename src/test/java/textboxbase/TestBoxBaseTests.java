package textboxbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.DemoPage;
import page.HomePage;
import page.TexBoxPage;

public class TestBoxBaseTests  {

    public class textboxbase {
        private WebDriver driver;
        protected DemoPage demoPage;
        @BeforeTest
        public void setUp () {

            System.setProperty("Webdriver.chrome.driver", "resources/chromedriver-win64/chromedriver.exe");
            driver = new ChromeDriver();
            demoPage = new DemoPage(driver);
            driver.get(" https://demoqa.com/forms");
            System.out.println(driver.getTitle());


        }




        @AfterTest
        public void tearDown (){
//        driver.quit();
        }

}}
