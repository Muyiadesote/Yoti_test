package TestCases;

import browsers.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.createWishListPage;

import java.io.File;
import java.io.IOException;

/**
 * Created by musti on 17/06/2017.
 */
public class createWishListTest extends base {

    @Test
    public void createWishListTest() throws InterruptedException, IOException {

         /*
         This test is to Validate that can add items to their wishlist so they can purchase it at a later time
         */

        LoginPage lp = new LoginPage(driver);
        lp.doLogin("olu.adesote@yahoo.co.uk", "Muyi123");

        createWishListPage cwlp = new createWishListPage(driver);
        cwlp.add2WishList();
//        Assert.assertTrue(cwlp.confirmAdd2Wishlist());
        cwlp.CloseAdd2WishListBtn();
        cwlp.validateWishlistBag();
        Assert.assertTrue(cwlp.ConfirmWishList());
        System.out.println(driver.getTitle());

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\WIP\\FirstAutomationProject\\YotiTest\\src\\main\\java\\Screenshots\\createWishListTest.jpg"));
        driver.close();
    }


}

