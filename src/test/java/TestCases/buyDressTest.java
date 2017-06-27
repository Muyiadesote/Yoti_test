package TestCases;

import browsers.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.buyDressPage;

import java.io.File;
import java.io.IOException;

/**
 * Created by musti on 19/06/2017.
 */
public class buyDressTest extends base {

    @Test
    public void buyDress() throws InterruptedException, IOException {

         /*
         This test is to Validate that user can successfully add a dress to cart and view total amount to pay.
         */
        LoginPage lp = new LoginPage(driver);
        lp.doLogin("olu.adesote@yahoo.co.uk", "Muyi123");
        buyDressPage bdp = new buyDressPage(driver);
        bdp.AddDress2Cart();
        System.out.println(driver.getTitle());

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\WIP\\FirstAutomationProject\\YotiTest\\src\\main\\java\\Screenshots\\buyDressTest.jpg"));
        driver.close();
    }
}
