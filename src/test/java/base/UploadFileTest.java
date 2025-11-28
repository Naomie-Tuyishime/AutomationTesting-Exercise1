package base;

import org.testng.annotations.Test;

public class UploadFileTest extends BaseTests{
    @Test
    public void uploadFileTest(){
        homePage.clickUpload("C:\\Users\\user\\IdeaProjects\\seleniumExercise\\resources\\chromedriver-win64\\chromedriver.exe");
    }
}
