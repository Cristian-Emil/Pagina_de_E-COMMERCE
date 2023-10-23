package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage (WebDriver driver) { PageFactory.initElements(driver, this);
    }

//-- Apasam butonul de accesare cont------------------- ----------------------------------------------------------------

//    @FindBy(xpath = "//*[@id=\"my_account\"]/i")
//    private static WebElement signAccountButton;
//    public static WebElement getSignAccountButton() { return signAccountButton; }


//-- Inseram adresa de email si apasam butonul CONTINUA ----------------------------------------------------------------


    @FindBy(id="user_login_email")
//  xpath = "//*[@id=\"user_login_email\"]"
    private static WebElement adresaEmail;
    public static WebElement getAdresaEmail() { return adresaEmail; }


    @FindBy(id="user_login_continue" )
//  xpath = "//*[@id=\"user_login_continue\"]"
    private static WebElement continuaButton;
    public static WebElement getContinuaButton() { return continuaButton; }




}
