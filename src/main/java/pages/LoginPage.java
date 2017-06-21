package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by musti on 17/06/2017.
 */
public class LoginPage {

        /*
        This is the page factory for create login test.
        */

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = ".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    private WebElement signInButton;

    @FindBy (id = "email")
    private WebElement enterEmail;

    @FindBy (id = "passwd")
    private WebElement enterPassword;

    @FindBy (id = "SubmitLogin")
    private WebElement signInBtn;

    @FindBy (xpath = ".//*[@id='center_column']/h1")
    private WebElement myAccount;

    @FindBy (xpath = ".//*[@id='center_column']/div[1]")
    private WebElement LoginError;

    public void doLogin(String myEmail, String myPassword){

        signInButton.click();
        enterEmail.sendKeys(myEmail);
        enterPassword.sendKeys(myPassword);
        signInBtn.click();
    }

    public boolean confirmLoin(){
       return myAccount.isDisplayed();
    }

    public boolean InvalidLoginMsg(){

        return LoginError.isDisplayed();
    }
}
