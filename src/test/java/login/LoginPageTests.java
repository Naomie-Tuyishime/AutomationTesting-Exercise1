package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.antlr.tool.ErrorManager.assertTrue;


public class LoginPageTests extends BaseTests {
    @Test
    public void loginTest(){
       var bookPage= homePage.clickBookStoreApplication();
       var loginPage = bookPage.clickLogin();
       String username = "TNaomie";

        loginPage.setCredentials(username, "Kigali@1234");
//        String actualResults = loginPage.setCredentials(username, "Kigali@1234");
//        assertTrue(actualResults.contains(username),"Something went wrong");

    }
}
