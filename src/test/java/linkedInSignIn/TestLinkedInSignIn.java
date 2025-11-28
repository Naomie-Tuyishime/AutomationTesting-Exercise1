package linkedInSignIn;

import base.BaseTests;
import org.testng.annotations.Test;

public class TestLinkedInSignIn  extends BaseTests {
    @Test
    public void TestLinkedInSignIn (){
        var homepage = homePage.clickAbout().clickIntouchButton();
        homepage.clickOnSignInButton().getEmailText("tuyishimenaome58@gmail.com");
        homepage.clickOnSignInButton().getPasswordText("Kigali@123");
        homepage.clickOnSignInButton();

        homepage.clickOnSignInButton();


    }



}
