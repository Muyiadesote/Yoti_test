package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by musti on 17/06/2017.
 */
public class createWishListPage {

        /*
        This is the page factory for create wishlist test.
        */

    WebDriver driver;

    public createWishListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[1]/a")
    private WebElement WomenSection;

    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
    private WebElement View1stItem;

    @FindBy(xpath = "//*[@id='wishlist_button']")
    private WebElement AddtoWishList;

    @FindBy(xpath = "//*[@id='product']/div[2]/div/div/div/div/p")
    private WebElement AddtoWishlistConfirm;

    @FindBy(xpath = "//*[@id='category']/div[2]/div/div/a")
    private WebElement closeAddtoWishlistMsg;

    @FindBy(xpath = ".//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
    private WebElement MyAccountPage;

    @FindBy(xpath = ".//*[@id='center_column']/div/div[2]/ul/li/a/span")
    private WebElement MyWishLists;

    @FindBy(id = "mywishlist")
    private WebElement ViewWishList;

    public void add2WishList() throws InterruptedException {

        WomenSection.click();
        Thread.sleep(6500);
        View1stItem.click();

        driver.switchTo().frame(0);
        Thread.sleep(5000);
        AddtoWishList.click();

    }

    public void CloseAdd2WishListBtn() throws InterruptedException {
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        closeAddtoWishlistMsg.click();
    }

    public void validateWishlistBag() throws InterruptedException {
        Thread.sleep(1000);
        MyAccountPage.click();
        Thread.sleep(1000);
        MyWishLists.click();
    }

    public boolean ConfirmWishList() {
        return ViewWishList.isDisplayed();
    }


}
