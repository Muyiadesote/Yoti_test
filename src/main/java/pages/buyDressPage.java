package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by musti on 19/06/2017.
 */
public class buyDressPage {

        /*
        This is the page factory for add a dress to cart and proceed to check out test.
        */

    WebDriver driver;

    public buyDressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = ".//*[@id='block_top_menu']/ul/li[2]/a")
    private WebElement Dresses;

    @FindBy (xpath = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")// //*[@id=/"center_column"]/ul/li[1]/div/div[1]/div/a[1]/img
    private WebElement Dress1;

    @FindBy (xpath = "//*[@id='add_to_cart']/button")
    private WebElement Add2CartBtn;

    @FindBy (xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    private WebElement Go2CheckOutBtn;

    public void AddDress2Cart() throws InterruptedException {
        Dresses.click();
        Thread.sleep(1000);
        Dress1.click();

        driver.switchTo().frame(0);
        Thread.sleep(5000);
        Add2CartBtn.click();
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        Go2CheckOutBtn.click();
    }


}
