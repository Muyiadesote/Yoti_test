package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by musti on 19/06/2017.
 */
public class editAddressPage {

        /*
        This is the page factory for create edit address test.
        */

    WebDriver driver;
    public editAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = ".//*[@id='center_column']/div/div[1]/ul/li[3]/a/span")
    private WebElement MyAddressBtn;

    @FindBy (xpath = ".//*[@id='center_column']/div[1]/div/div/ul/li[9]/a[1]/span")
    private WebElement UpdateAddressBtn;

    @FindBy (id = "address1")
    private WebElement AddressLine;

    @FindBy (id = "id_state")
    private WebElement State;

    @FindBy (id = "submitAddress")
    private WebElement SaveBtn;

    @FindBy (xpath = ".//*[@id='center_column']/div[1]/div/div/ul")
    private WebElement NewAddrDisplayed;

    public void editAddress(){
        MyAddressBtn.click();
        UpdateAddressBtn.click();

    }

    public void enterAdd(String newAddr){
        AddressLine.clear();
        AddressLine.sendKeys(newAddr);
    }

    public void selOption(String str){
        Select sel = new Select(State);
        sel.selectByVisibleText(str);

    }

    public void SaveNewAddr(){
        SaveBtn.click();
    }

    public boolean AssertNewAddr(){
       return NewAddrDisplayed.isDisplayed();
    }

}
