package TestCases;

import browsers.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.File;
import java.io.IOException;

import static browsers.base.driver;

/**
 * Created by musti on 17/06/2017.
 */

public class loginTest extends base {
    // This test is to validate login feature

    @Test
    public void loginTest() throws IOException {

        /*
         This test is to perform Valid username and valid password scenario.
         */
        LoginPage lp = new LoginPage(driver);
        lp.doLogin("olu.adesote@yahoo.co.uk", "Muyi123");
        Assert.assertTrue(lp.confirmLoin());

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\WIP\\FirstAutomationProject\\YotiTest\\src\\main\\java\\Screenshots\\Pic1.jpg"));
        driver.close();

    }
}
