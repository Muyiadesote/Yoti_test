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

/**
 * Created by musti on 17/06/2017.
 */
public class InvalidLoginTest extends base {

    @Test
    public void InvalidLoginTest() throws IOException {

        /*
         This test is to perform Valid username and Invalid password scenario.
         */
        LoginPage lp = new LoginPage(driver);
        lp.doLogin("olu.adesote@yahoo.co.uk", "muyi123");

        Assert.assertTrue(lp.InvalidLoginMsg());

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\WIP\\FirstAutomationProject\\YotiTest\\src\\main\\java\\Screenshots\\InvalidLogin.jpg"));
        driver.close();
    }
}
