package framework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class TakeScreenShot extends Driver {

    private static final String filepath = "test-output/ScreenShots/";


    public void takeScreenShot(String fname) throws Exception {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String imageFileDir = System.getProperty("selenium.screenshot.dir");
        if (imageFileDir == null)
            imageFileDir = System.getProperty("java.io.tmpdir");
        FileUtils.copyFile(scrFile, new File(imageFileDir, fname));
    }
}